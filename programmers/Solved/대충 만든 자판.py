def solution(keymap, targets):
    answer = []
    
    for target in targets:
        sum = 0
        noneChk = False
        for letter in target:
            min = 101
            for key in keymap:
                if key.count(letter) != 0:
                    cnt = key.index(letter)+1
                    if cnt < min:
                        min = cnt
            if min == 101:
                noneChk = True
                break
            sum += min
        if noneChk:
            answer.append(-1)
        else:
            answer.append(sum)
    return answer
        
keymap = ["AA"]
targets = ["B"]
# keymap = ["AGZ", "BSSS"]
# targets = ["ASA","BGZ"]
print(solution(keymap, targets))