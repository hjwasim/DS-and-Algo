
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack stack = new ArrayStack(5);
//		stack.push(21);
//		stack.push(39);
//		System.out.println(stack.peek());
//		stack.pop();
//		stack.pop();
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.peek());
//		System.out.println(stack.size());
		
		
		ListStack stack1 = new ListStack();
		System.out.println(stack1.isEmpty());
		stack1.push(23);
		System.out.println(stack1.peek());
		stack1.push(21);
		stack1.push(39);
		System.out.println(stack1.pop());
		System.out.println(stack1.size());
	}

}
