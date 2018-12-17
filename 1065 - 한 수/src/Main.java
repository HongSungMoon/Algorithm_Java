import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		int han_num = 0;
		
		for(int i=1; i<=num; i++) {
			if(checkHanNum(i))
				han_num++;
		}
		
		bw.write(String.valueOf(han_num));
		bw.flush();
		bw.close();
		
	}
	
	public static boolean checkHanNum(int num) {
		
		int pivot;
		String nums = String.valueOf(num);
		int length = nums.length();
		int temp_pivot;
		
		if(length < 3)
			return true;
		
		pivot = nums.charAt(0) - nums.charAt(1);
		
		for(int i=1; i<length - 1; i++) {
			temp_pivot = nums.charAt(i) - nums.charAt(i+1);
			if(pivot != temp_pivot)
				return false;
		}
		
		return true;
	}
}
