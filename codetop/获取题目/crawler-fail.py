import requests
from bs4 import BeautifulSoup
import os
import time
import random
import json

def get_problems():
    base_url = "https://codetop.cc/api/questions/"
    headers = {
        "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36",
        "Accept": "application/json, text/plain, */*",
        "Accept-Language": "zh-CN,zh;q=0.9",
        "Referer": "https://codetop.cc/home",
        "sec-ch-ua": '"Google Chrome";v="135", "Not-A.Brand";v="8", "Chromium";v="135"',
        "sec-ch-ua-mobile": "?0",
        "sec-ch-ua-platform": '"macOS"',
    }
    cookies = {
        'Hm_lvt_27a927196d810bc17f08a3ca40510a2f': '1747798508,1747801895',
        'HMACCOUNT': '649081EFE846DA84',
        'Hm_lpvt_27a927196d810bc17f08a3ca40510a2f': '1747802697'
    }
    problems = []
    page = 1
    while True:
        url = f"{base_url}?page={page}&search=&ordering=-frequency&recent=12"
        print(f"正在请求: {url}")
        resp = requests.get(url, headers=headers, cookies=cookies, timeout=10)
        print(f"响应状态码: {resp.status_code}")
        print(f"响应内容: {resp.text[:200]}...")
        if resp.status_code != 200:
            print(f"第{page}页请求失败: {resp.status_code}")
            break
        try:
            data = resp.json()
            results = data.get('list', [])
            if not results:
                print("没有更多数据")
                break
            for item in results:
                leetcode = item.get('leetcode', {})
                problems.append({
                    'id': item['id'],
                    'number': str(leetcode.get('frontend_question_id', '')).zfill(4),
                    'title': leetcode.get('title', ''),
                    'url': f"https://codetop.cc/question/{item['id']}",
                    'difficulty': leetcode.get('difficulty', ''),
                    'frequency': item.get('value', 0),
                })
            print(f"已获取第{page}页, 累计{len(problems)}题")
            page += 1
            time.sleep(random.uniform(0.5, 1.5))
        except json.JSONDecodeError as e:
            print(f"JSON解析错误: {e}")
            break
    return problems

def get_problem_detail(problem, headers):
    url = problem['url']
    print(f"正在获取题目详情: {url}")
    resp = requests.get(url, headers=headers, timeout=10)
    print(f"详情页响应状态码: {resp.status_code}")
    soup = BeautifulSoup(resp.text, 'html.parser')
    desc = soup.select_one('.question-describe')
    best = soup.select_one('.question-best-answer')
    desc_text = desc.text.strip().replace('\n', '').replace('\r', '') if desc else ''
    best_text = best.text.strip().replace('\n', '').replace('\r', '') if best else ''
    short_desc = desc_text[:20]
    short_best = best_text[:30]
    return desc_text, best_text, short_desc, short_best

def save_problems_summary(problems):
    os.makedirs('codetop', exist_ok=True)
    with open('codetop/problems_summary.md', 'w', encoding='utf-8') as f:
        f.write('# CodeTop 题目汇总\n\n')
        for prob in problems:
            f.write(f"{prob['number']}. [{prob['title']}]({prob['url']})\n")
            f.write(f"- 难度：{prob['difficulty']}  频率：{prob['frequency']}\n")
            f.write(f"- 题目概述：{prob['short_desc']}\n")
            f.write(f"- 解题思路：{prob['short_best']}\n\n")

def create_problem_file(problem):
    number = problem['number']
    folder = f"codetop/{str(number).zfill(4)[:2]}01-{str(number).zfill(4)[:2]}00"
    os.makedirs(folder, exist_ok=True)
    filename = f"{folder}/{str(number).zfill(4)}.md"
    with open(filename, 'w', encoding='utf-8') as f:
        f.write(f"# {problem['number']}. {problem['title']}\n\n")
        f.write(f"难度：{problem['difficulty']}  频率：{problem['frequency']}\n\n")
        f.write("## 题目描述\n\n")
        f.write(f"{problem['desc']}\n\n")
        f.write("## 最佳解法思路\n\n")
        f.write(f"{problem['best']}\n\n")
        f.write("## 代码实现\n\n")
        f.write("### Python\n```python\n\n```")
        f.write("\n\n### Java\n```java\n\n```")

def main():
    print("开始获取题目列表...")
    problems = get_problems()
    print(f"共获取到{len(problems)}道题目，开始抓取详情...")
    headers = {
        "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36",
        "Accept": "application/json, text/plain, */*",
        "Accept-Language": "zh-CN,zh;q=0.9",
        "Referer": "https://codetop.cc/home",
        "sec-ch-ua": '"Google Chrome";v="135", "Not-A.Brand";v="8", "Chromium";v="135"',
        "sec-ch-ua-mobile": "?0",
        "sec-ch-ua-platform": '"macOS"',
    }
    for i, prob in enumerate(problems):
        desc, best, short_desc, short_best = get_problem_detail(prob, headers)
        prob['desc'] = desc
        prob['best'] = best
        prob['short_desc'] = short_desc
        prob['short_best'] = short_best
        print(f"已抓取详情: {prob['number']} {prob['title']}")
        time.sleep(random.uniform(1, 2))
    print("保存题目汇总...")
    print("全部完成！")

if __name__ == "__main__":
    main() 