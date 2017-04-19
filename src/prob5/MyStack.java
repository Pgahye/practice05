package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	public MyStack(int num) {

		String[] temp = new String[num];
		buffer = temp;
		top = -1;

	}

	public void resize(int num) {

		String[] temp1 = new String[num * 2];

		for (int i = 0; i < top; i++) {

			temp1[i] = buffer[i];

		}

		buffer = temp1;
	}

	public void push(String st) {

		if (top == buffer.length - 1) {

			resize(buffer.length);

		}

		top++;
		buffer[top] = st;

	}

	public String pop() throws MyStackException {

		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		String s = buffer[top];
		top--;

		return s;

	}

	public boolean isEmpty() {

		return top == -1;

	}

	// 사이즈 채크가 필요함

}
