def solution(cards1, cards2, goal):
    answer = 'Yes'
    
    for text in goal:
        if len(cards1) != 0 and cards1[0] == text:
            cards1.pop(0)
        elif len(cards2) != 0 and cards2[0] == text:
            cards2.pop(0)
        else:
            answer = 'No'
            break
    return answer

cards1 = ["i", "water", "drink"]
cards2 = ["want", "to"]
goal = ["i", "want", "to", "drink", "water"]

print(solution(cards1, cards2, goal))