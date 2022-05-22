
public class ArrayStack {
	int[] arr;
	int top;
	int cap;

	ArrayStack(int size) {
		top = -1;
		cap = size;
		arr = new int[cap];
	}

	public void push(int i) {
		if (top == cap - 1)
			System.out.println("Stack is Overflow/Full...");
		else {
			top++;
			arr[top] = i;
		}
	}

	public int pop() {
		if (top == -1) {
			// System.out.println("Stack is Underflow/Empty...");
			return 0;
		}

		int res = arr[top];
		top--;
		return res;

	}

	public int peek() {
		if (top == -1) {
			//System.out.println("Stack is Underflow/Empty...");
			return 0;
		}
		return arr[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}
}
