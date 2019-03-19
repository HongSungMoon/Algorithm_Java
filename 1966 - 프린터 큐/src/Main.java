import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {

			Queue<Print> queue = new LinkedList<Print>();

			String[] infos = br.readLine().split(" ");
			String[] priorities = br.readLine().split(" ");
			int target = Integer.parseInt(infos[1]);

			for (int j = 0; j < priorities.length; j++) {
				queue.add(new Print(j, Integer.parseInt(priorities[j])));
			}
			
			int count = 0;
			
			boolean flag = true;
			
			while(flag) {
				
				int maxPriority = getMaxPriority(queue);
				
				while(true) {
					
					Print print = queue.poll();
					
					if(maxPriority == print.getPriority()) {
						
						count++;
						
						if(print.getDoc() == target) {
							bw.write(String.valueOf(count));
							bw.newLine();
							flag = false;
						}
						
						break;
					}
					
					queue.add(print);
					
				}
				
			}

		}
		
		bw.flush();
		bw.close();

	}

	public static int getMaxPriority(Queue<Print> queue) {
		
		Iterator<Print> it = queue.iterator();
		
		int maxPriority = 0;
		while (it.hasNext()) {
			Print print = it.next();
			if(maxPriority < print.getPriority())
				maxPriority = print.getPriority();
		}

		return maxPriority;
	}

}

class Print {

	int priority;
	int doc;

	public Print(int doc, int priority) {
		this.priority = priority;
		this.doc = doc;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getDoc() {
		return doc;
	}

	public void setDoc(int doc) {
		this.doc = doc;
	}

}