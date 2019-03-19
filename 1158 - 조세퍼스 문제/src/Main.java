import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputs = br.readLine().split(" ");
		
		int personCount = Integer.parseInt(inputs[0]);
		int pivotNum = Integer.parseInt(inputs[1]);
		
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder("<");
		
		for(int i=0; i<personCount; i++) {
			queue.add(i+1);
		}
		
		int temp = 0;
		
		while(true) {
			
			if(queue.size() == 1) {
				temp = queue.poll();
				sb.append(String.valueOf(temp) + ">");
				break;
			}
			
			for(int i=0; i<pivotNum - 1; i++) {
				temp = queue.poll();
				queue.add(temp);
			}
			
			temp = queue.poll();
			sb.append(String.valueOf(temp) + ", ");
			
		}
		
		bw.write(sb.toString());;
		bw.flush();
		bw.close();
		
	}

}
