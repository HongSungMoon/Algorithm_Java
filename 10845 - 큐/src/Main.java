import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());
		
		Queue queue = new Queue(count);

		for (int i = 0; i < count; i++) {

			String instruction = br.readLine();

			switch (instruction) {
			case "pop":
				sb.append(String.valueOf(queue.pop()) + "\n");
				break;
			case "size":
				sb.append(String.valueOf(queue.size()) + "\n");
				break;
			case "empty":
				sb.append(String.valueOf(queue.empty()) + "\n");
				break;
			case "front":
				sb.append(String.valueOf(queue.front()) + "\n");
				break;
			case "back":
				sb.append(String.valueOf(queue.back()) + "\n");
				break;
			default:
				String [] instructions = instruction.split(" ");
				queue.push(Integer.parseInt(instructions[1]));
				break;
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

}

class Queue {
	
	List<Integer> arr;
	
	public Queue(int size) {
		arr = new ArrayList<Integer>();
	}
	
	public void push(int data) {
		arr.add(data);
		
	}
	
	public int pop() {
		if(arr.isEmpty()) {
			return -1;
		}
		return arr.remove(0);
	}
	
	public int empty() {
		if(arr.isEmpty()) {
			return 1;
		}
		return 0;
	}
	
	public int size() {
		if(arr.isEmpty()) {
			return 0;
		}
		return arr.size(); 
	}
	
	public int front() {
		if(arr.isEmpty()) {
			return -1;
		}
		return arr.get(0); 
	}
	
	public int back() {
		if(arr.isEmpty()) {
			return -1;
		}
		return arr.get(arr.size() - 1); 
	}
	
	
	/*
	 * push X: 정수 X를 큐에 넣는 연산이다. pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는
	 * 정수가 없는 경우에는 -1을 출력한다. size: 큐에 들어있는 정수의 개수를 출력한다. empty: 큐가 비어있으면 1, 아니면
	 * 0을 출력한다. front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 */
	
	
}
