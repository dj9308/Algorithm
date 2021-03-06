# 피드백 및 알게된 것

## Stack-queue 

- #### [주식가격](https://programmers.co.kr/learn/courses/30/lessons/42584)

  - 배열은 깊은 복사, 얕은 복사가 있다. 

  - ```java
    Queue<Integer> queue1 = new LinkedList<Integer>();
    // 얕은 복사. = 연산자는 주소를 이어준다는 의미이기 때문에 값이 같이 변경된다.
    queue2 = queue1;  
    //깊은 복사. LinkedList는 addAll(), Array는  clone{}을 사용한다.
    queue2.addAll(queue1);
    array2 = array1.clone();
    ```

  - 끝이 0일 경우 for문에 초기값이 안넣어질 경우를 생각해보자.

  - 피드백 : 문제를 제대로 안보고 하는 경향이 있음.
  
    - 가격이 떨어질 경우, 시간이 리셋되고 다시 시작하는 줄 앎.
    - 입출력 예를 봤으면 틀리지 않았을 것.
    - 스택, 큐를 쓰지 않아도 배열로 푸는 것이 더 속도가 빠를 수 있음.
  
- #### [기능개발](https://programmers.co.kr/learn/courses/30/lessons/42586)

  - 배열의 경우, index에 맞춰 배열과 변수가 어떻게 달라지며 흘러가는지 써보자.
  - 잘한 것: 되도록 for문 안에 해결하려고 했던 것. (효율성 상승), 시간 복잡도를 생각하며 코드를 짠 것.
  - 피드백 : 문제 이해하는데 약 15분 소요(너무 느림)
    - 많이 풀면 속도가 빨라질 듯
    - 그렇다고 넘겨짚지 말 것.(주식가격때 폭망한거 생각할 것)
  
- #### [다리를 지나는 트럭](https://programmers.co.kr/learn/courses/30/lessons/42583) 

  - 경과시간 : 약 1:15

  - 시간복잡도 : O(N*j)

  - 코드의 흐름을 그리며 하는 것이 도움이 됨.

  - 문제에 표가 있어 참고하기 좋았다. -> 표가 없으면 그리고 하는 것이 도움이 될 듯.

  - 잘한 것 : 처음과 끝을 생각하면서 코드를 짠 것. -> 오류 없이 한큐에 성공했다.

  - 피드백 : 중간에 다른 생각을 많이 한 것. / 막힐 경우 몇분동안 머리가 안돌아 가는 것.

    - 문제를 다시 읽고 표를 다시 보는걸로 생각정리 후 다시 풀음.

  - ```java
    import java.util.*;
    import java.util.ArrayList;
    // 왜 Arraylist를 따로 import해야하는지 의문. *은 전부를 뜻하는 것이 아닌가?
    Queue<Integer> on_bridge = new LinkedList<Integer>();
    ArrayList<Integer> time = new ArrayList<Integer>();
    
    //Queue의 요소를 변경하는 법을 찾지 못해서(없을수도?) ArrayList를 사용함.
    //LinkedList,ArrayList는 set함수로 변경이 가능한데, Queue는 LinkedList로 초기화를 하는데도 set함수가 없는걸로 보니 변경을 못하는 것 같다.
    ```

- #### [프린터](https://programmers.co.kr/learn/courses/30/lessons/42587)

  - 우선순위큐를 생각했지만, 적용방법도 제대로 모를 뿐더러 그것만 집착해서 다른 방법을 생각하지 못했다. 
  - 문제 자체는 어렵지 않지만 이해하지 않고 바로 풀려고하니 시간이 오래걸린 듯.
  - 문제를 다 읽고 어떻게 풀지 생각을 할 것.

  ## Hash

  - ### [완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)
    
    - 정확성은 맞지만 효율성에서 문제가 생김
    - 시간복잡도: O(n)
    - contain 함수를 쓰려고 했으나 시도 경로 자체를 잘못한듯
    - Hash라는 힌트를 줬다고 해서 꼭 그것을 쓸 필요는 없다.
    - != 와 equal 함수를 햇깔리지 말자. !=의 경우, 참조값만 비교하는 것이고, equals는 내용까지 비교하는 것이다.
  
- ### [전화번호 목록](https://programmers.co.kr/learn/courses/30/lessons/42577)
  
    - String 부분 표현 관련 함수를 외워두면 편할 것 같다.
  - Arrays.sort()를 할 경우, length와는 상관없이 정렬된다. 
  
    - ```java
              for(int i=0;i<phone_book.length;i++) {
              	for(int j=0;j<phone_book.length;j++) {
              		if(i==j) continue;
                      //indexof: 해당 String이 들어있으면 해당 index를 반환한다.
              		if(phone_book[j].indexOf(phone_book[i])==0) {
                          //if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                          // startWith함수를 써도 된다.
              			answer = false;
              		}
              	}
              	if(!answer) break;
              }
      ```
    
  - ### [위장](https://programmers.co.kr/learn/courses/30/lessons/42578)
  
    - 경우의 수를 이해해야 함
    - Hash의 사용 목적을 분명히 해야 할듯
    - 경우의 수를 이용해 수를 세야 함 - 각 종류마다 갯수를 세야함 - Hash를 이용해 key를 종류, value를 갯수로 정하고 세기 - key의 종류에 맞춰 경우의 수 식 세우고 값 도출하기


## 알게된 함수

### String 관련

- indexOf(String) : 파라미터 string이 있을경우 index를 반환한다.
- startwith(String) : 파라미터의 string으로 시작할 경우 true를 반환한다.

