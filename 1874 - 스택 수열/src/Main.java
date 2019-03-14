import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		
		Stack stack = new Stack(count);
		StringBuilder sb = new StringBuilder();
		
		int max = 1;
		
		for(int i=0; i<count; i++) {

			int input = Integer.parseInt(br.readLine());
			int lastNum = stack.top();
			
			if(lastNum > input) {
				bw.write("NO");
				bw.flush();
				bw.close();
				return;
			}

			if(lastNum < input) {
				for(int j=max; j<=input; j++) {
					stack.push(j);
					sb.append("+\n");
					max++;
				}
			} 
			stack.pop();
			sb.append("-\n");
			
		}		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	
}

class Stack {
	
	int arr[];
	int idx;
	
	Stack(int size) {
		arr = new int [size];
		idx = -1;
	}
	
	public void push(int num) {
		arr[++idx] = num;
	}
	
	public int pop() {
		if(idx == -1)
			return -1;
		return arr[idx--];
	}
	
	public int top() {
		if(idx == -1)
			return -1;
		return arr[idx];
	}
	
}