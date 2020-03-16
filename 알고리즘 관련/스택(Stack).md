# 스택(Stack)

- LIFO(Last In First Out) / 후입선출의 자료구조

## function

- top(): 스택의 가장 윗 data를 반환
- pop(): 스택의 가장 윗 data를 삭제
- push() : 스택의 가장 윗 data로 가리키는 자리위에 메모리를 생성후, data를 넣는다.
- empty() : 스택이 비었다면 1을 반환하고, 그렇지 않으면 0을 반환한다.
- peek() :  top이 가리키는 data를 읽는 작업.

## 응용

- 재귀함수가 스택에 기반을 두고 있다.

## java로 구현

```java
public class stack {
	
	int top;
	int[] stack;
	int size;
	
	public stack(int size) {
		top = -1;
		stack = new int[size];
		this.size= size;
	}
	
	public int peek() {
		return stack[top];
	}
	
	public void push(int value) {
		stack[++top] = value;
		System.out.println(stack[top]+"PUSH!");
	}
	
	public int pop() {
		System.out.println(stack[top]+" POP!");
		return stack[top--];
	}
	
	public void printStack() {
		System.out.println("--Stack List--");
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
		System.out.println("--End Of List--");
	}

}

// top-- 이나 ++top으로 메모리 할당 및 추가를 구현한 것.
```

