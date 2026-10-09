package CSE3;

public class stack_array {  
	private int[] stack;
	private int top;
	private int capacity;
	
	stack_array(int capacity) {
		this.capacity = capacity;
		stack = new int[capacity];
		top = -1;
	}
	
	void push(int value) {
		if (top == capacity - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		
		stack[++top] = value;
	}
	
	int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return stack[top--];
	}
	int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return-1;
		}
		return stack[top];
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	void display() {
		
		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		
		stack_array stack = new stack_array(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.display();
		
		System.out.println("Top: " + stack.peek());
		System.out.println("Popped: " + stack.pop());
		
		stack.display();
	}

}
