import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int nums[] = new int[3];
		
		nums[0] = Integer.valueOf(st.nextToken());
		nums[1] = Integer.valueOf(st.nextToken());
		nums[2] = Integer.valueOf(st.nextToken());
		
		Arrays.sort(nums);
		
		bw.write(String.valueOf(nums[1]));
		bw.flush();
		bw.close();
		
	}

}
