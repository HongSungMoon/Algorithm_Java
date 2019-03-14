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

		int[] stack = new int[count];

		int idx = -1;

		for (int i = 0; i < count; i++) {

			String input = br.readLine();

			switch (input) {
			case "pop":
				if (idx >= 0)
					bw.write(String.valueOf(stack[idx--]));
				else
					bw.write("-1");
				bw.newLine();
				break;
			case "size":
				bw.write(String.valueOf(idx + 1));
				bw.newLine();
				break;
			case "empty":
				if (idx == -1)
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			case "top":
				if (idx == -1)
					bw.write("-1");
				else
					bw.write(String.valueOf(stack[idx]));
				bw.newLine();
				break;
			default :
				String[] inputs = input.split(" ");
				stack[++idx] = Integer.parseInt(inputs[1]);
				break;
			}
			bw.flush();	
		}
		
		bw.close();
	}

}
