import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=1; i<=10000; i++) {
			if(!checkSelfNum(i)) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		
	}
	
	public static boolean checkSelfNum(int num) {
		
		int constructor = num - 1;
		
		while(constructor > 0) {
			if(sumNum(constructor) == num)
				return true;
			constructor--;
		}
		
		return false;
			
	}
	
	public static int sumNum(int num) {
		
		int temp_num = num;
		int sum = 0;
		
		while(true) {
			
			if(temp_num == 0)
				break;
			sum += (temp_num % 10); 
			temp_num /= 10;
			
		}
		
		sum += num;
		return sum;
		
	}
}
