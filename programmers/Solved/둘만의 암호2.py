def solution(s, skip, index):
    answer = ''

    for letter in s:
        nextLet = ''
        cnt = 0
        i = 0
        while i < index:
            cnt+=1
            num = ord(letter)                
            nextLet = chr(num+cnt)
            if ord(nextLet) > ord('z'):
                while ord(nextLet) > ord('z'):
                    nextLet = chr(ord(nextLet) - 26)
            if skip.find(nextLet) != -1:
                i-=1
            i+=1
        answer += nextLet
    
    return answer

s = 'aukks' 
skip = 'wbqd'
index = 5

print(solution(s,skip,index))

# 패스하는 알파벳이 두바퀴를 넘었을 때도 생각해야 한다.