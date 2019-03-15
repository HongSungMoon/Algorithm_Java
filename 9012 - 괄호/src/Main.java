import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			
			String input = br.readLine();
			int length = input.length();
			
			Stack stack = new Stack(length);
			boolean check = true;
			
			for(int j=0; j<length; j++) {
				
				if(input.charAt(j) == '(') {
					stack.push('(');
				} else {
					char pop = stack.pop();
					if(pop != '(') {
						check = false;
						
						break;
					}
				}
			}
			
			if(check && stack.isEmpty())
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		
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