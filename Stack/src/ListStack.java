import java.util.ArrayList;

public class ListStack {
	ArrayList<Integer> list = new ArrayList<>();

	public void push(int i) {
		list.add(i);
	}

	public int pop() {
		int i = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return i;
	}

	public int peek() {
		return list.get(list.size() - 1);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

}
