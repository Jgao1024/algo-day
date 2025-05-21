import requests
import json
import time
import random
import os

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
    count = 1
    needCount = 400
    
    while True:
        url = f"{base_url}?page={page}&search=&ordering=-frequency"
        print(f"正在获取第{page}页...")
        
        try:
            resp = requests.get(url, headers=headers, cookies=cookies, timeout=10)
            if resp.status_code != 200:
                print(f"请求失败: {resp.status_code}")
                break
                
            data = resp.json()
            results = data.get('list', [])
            
            if not results:
                print("没有更多数据")
                break
                
            for item in results:
                leetcode = item.get('leetcode', {})
                problem = {
                    'number': str(count).zfill(3),
                    'title': leetcode.get('frontend_question_id', '') + '.' + leetcode.get('title', ''),
                    'url': f"https://leetcode.cn/problems/{leetcode.get('slug_title', '')}",
                    'difficulty': leetcode.get('level', ''),
                    'frequency': item.get('value', 0)
                }
                problems.append(problem)
                count += 1
            if count > needCount:
                    break
            print(f"已获取{len(problems)}题")
            page += 1
            time.sleep(random.uniform(0.5, 1.5))
            
        except Exception as e:
            print(f"发生错误: {str(e)}")
            break
            
    return problems

def save_problems(problems):
    # 保存为Markdown格式
    with open('题目列表.md', 'w', encoding='utf-8') as f:
        f.write('# CodeTop 题目汇总\n\n')
        f.write('| 题号 | 标题 | 难度 | 频度 |\n')
        f.write('|------|------|------|------|\n')
        difficulty_map = {
            1: '简单',
            2: '中等',
            3: '困难'   
        }
        for prob in problems:
            f.write(f"| {prob['number']} | [{prob['title']}]({prob['url']}) | {difficulty_map[prob['difficulty']]} | {prob['frequency']} |\n")
    
    # 保存为JSON格式（方便后续处理）
    with open('problems.json', 'w', encoding='utf-8') as f:
        json.dump(problems, f, ensure_ascii=False, indent=2)
    
    print(f"已保存{len(problems)}道题目到 problems.md 和 problems.json")

def main():
    print("开始获取题目列表...")
    problems = get_problems()
    print(f"共获取到{len(problems)}道题目")
    save_problems(problems)
    print("完成！")

if __name__ == "__main__":
    main() 