import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		boolean check = true;
		int value = 0;
		int length = input.length();
		Stack stack = new Stack(length);

		StringBuilder sb = new StringBuilder();
		StringBuilder operator = new StringBuilder();

		char last = ' ';
		for (int j = 0; j < length; j++) {
			if (input.charAt(j) == '(') {
				stack.push('(');
				sb.append("2");
				if (last == '(' || last == '[') {
					operator.append("*");
				} else if (last == ')' || last == ']') {
					sb.append("+");
				}
			} else if (input.charAt(j) == ')') {
				if (last == ')' || last == ']') {
					int idx = operator.length() - 1;
					if (idx != -1) {
						sb.append(operator.charAt(idx));
						operator.deleteCharAt(idx);
					}
				}
				char pop = stack.pop();
				if (pop != '(') {
					check = false;
					break;
				}
				int idx = operator.length() - 1;
			} else if (input.charAt(j) == '[') {
				stack.push('[');
				sb.append("3");
				if (last == '(' || last == '[') {
					operator.append("*");
				} else if (last == ')' || last == ']') {
					sb.append("+");
				}
			} else {
				if (last == ')' || last == ']') {
					int idx = operator.length() - 1;
					if (idx != -1) {
						sb.append(operator.charAt(idx));
						operator.deleteCharAt(idx);
					}
				}
				char pop = stack.pop();
				if (pop != '[') {
					check = false;
					break;
				}
			}

			// if(stack.isEmpty()) {
			// for(int i=operator.length() - 1; i>=0; i--) {
			// sb.append(operator.charAt(i));
			// }
			// operator = new StringBuilder();
			// }
			last = input.charAt(j);
		}

		bw.write(sb.toString() + "\n");
		int sbLength = sb.length();
		Calc calc = new Calc(sbLength);
		for (int i = 0; i < sbLength; i++) {
			char target = sb.charAt(i);
			int a = 0;
			int b = 0;
			switch (target) {
			case '+':
				a = calc.pop();
				b = calc.pop();
				calc.push(a + b);
				break;
			case '*':
				a = calc.pop();
				b = calc.pop();
				calc.push(a * b);
				break;
			default:
				calc.push(target - '0');
			}

		}

		value = calc.pop();

		if (check && stack.isEmpty()) {
			bw.write(String.valueOf(value));
			bw.newLine();
		} else
			bw.write("0\n");

		bw.flush();
		bw.close();

	}

}

class Stack {

	char arr[];
	int idx;

	Stack(int size) {
		arr = new char[size];
		idx = -1;
	}

	public void push(char c) {
		arr[++idx] = c;
	}

	public char pop() {
		if (idx == -1)
			return ' ';
		return arr[idx--];
	}

	public char top() {
		if (idx == -1)
			return ' ';
		return arr[idx];
	}

	public boolean isEmpty() {
		if (idx == -1)
			return true;
		return false;
	}

}

class Calc {

	int arr[];
	int idx;

	Calc(int size) {
		arr = new int[size];
		idx = -1;
	}

	public void push(int c) {
		arr[++idx] = c;
	}

	public int pop() {
		if (idx == -1)
			return -1;
		return arr[idx--];
	}

	public int top() {
		if (idx == -1)
			return -1;
		return arr[idx];
	}

	public boolean isEmpty() {
		if (idx == -1)
			return true;
		return false;
	}

}