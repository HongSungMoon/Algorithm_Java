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
		
		int arr[] = new int [num_count];
		
		double average = 0;
		
		for(int i=0; i<num_count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			average += arr[i];
		}
		
		average /= num_count;
		average = Math.round(average);
		
		Arrays.sort(arr);
		
		int arr_idx[] = new int [num_count];
		arr_idx[0]++;
		for(int i=1, j=0; i<num_count; i++) {
			if(arr[i] == arr[i-1])
				arr_idx[j]++;
			else {
				arr_idx[++j]++;
			}
		}
		
		int max_freq_idx = 0;
		int sum = 0;
		boolean check = false;
		
		for(int i=1; i<num_count; i++) {
			if(arr_idx[i] > arr_idx[max_freq_idx]) {
				max_freq_idx = i;
				check = false;
				sum = 0;
				for(int j=0; j<i; j++)
					sum += arr_idx[j];
			}
			else if(arr_idx[i] == arr_idx[max_freq_idx] && check == false) {
				check = true;
				max_freq_idx = i;
				sum = 0;
				for(int j=0; j<i; j++)
					sum += arr_idx[j];
			}
		}
		
		int median;
		if(num_count % 2 == 0)
			median = arr[(num_count / 2) + 1];
		else 
			median = arr[(num_count / 2)];
		
		bw.write(String.format(String.valueOf("%.0f"), average));
		bw.newLine();
		
		bw.write(String.valueOf(median));
		bw.newLine();
		
		bw.write(String.valueOf(arr[sum]));
		bw.newLine();
		
		bw.write(String.valueOf(arr[num_count - 1] - arr[0]));
		bw.newLine();
		
		bw.flush();
		bw.close();
		
	}

}
