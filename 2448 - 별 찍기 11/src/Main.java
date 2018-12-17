import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {

		int num = Integer.parseInt(br.readLine());

		int floor = 0;
		int tri = 1;

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = num - 1; i >= 0; i--) {

			floor++;
			arr = arraySetting(arr, floor, tri - 1);
			for (int j = 0; j < i; j++)
				bw.write(" ");

			printStar(i % 3);
			for (int j = 0; j < arr.size(); j++) {
				if (floor % 3 == 1)
					printBlank((arr.get(j) * 6) - 1);
				if (floor % 3 == 2)
					printBlank((arr.get(j) * 6) - 3);
				if (floor % 3 == 0)
					printBlank((arr.get(j) * 6) - 5);
				printStar(i % 3);
			}

			if (floor % 3 == 0)
				tri++;

			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

	private static ArrayList<Integer> arraySetting(ArrayList<Integer> arr, int floor, int tri) {
		ArrayList<Integer> new_arr = new ArrayList<Integer>();
		if (floor % 3 == 1 && ((tri & (tri - 1)) == 0) && tri != 0) {
			new_arr.add(tri);
			return new_arr;
		}
		if (floor % 3 == 1) {
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i) == 1)
					new_arr.add(2);
				else if (arr.get(i) % 2 == 1)
					new_arr.add(arr.get(i) - 1);
				else {
					new_arr.add(1);
					new_arr.add(arr.get(i) - 1);
					if(i == arr.size() - 1)
						new_arr.add(1);
				}
				
			}
			return new_arr;
		}
		return arr;

	}

	public static void printStar(int floor) throws IOException {
		switch (floor) {
		case 2:
			bw.write("*");
			break;
		case 1:
			bw.write("* *");
			break;
		case 0:
			bw.write("*****");
			break;
		}
	}

	public static void printBlank(int count) throws IOException {
		for (int i = 0; i < count; i++)
			bw.write(" ");
	}

}
