import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num_count = Integer.parseInt(br.readLine());
		int array[] = new int [num_count];
		
		for(int i=0; i<num_count; i++) {
			array[i] = (Integer.parseInt(br.readLine()));
		}
		
		Arrays.sort(array);
		
		for(int i=0; i<num_count; i++) {
			bw.write(String.valueOf(array[i]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}
	
	/* Counting Sort 
	 * 
	 * public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		for (int i = 1; i <= n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		for (int j = 1; j <= 10000; j++) {
			if (arr[j] != 0) {
				for (int k = 1; k <= arr[j]; k++) {
					bw.write(j + "\n");
				}
			}
		}
		bw.flush();
	}
}
	 * 
	 * */

}
