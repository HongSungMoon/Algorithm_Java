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
		int triangle = 0;

		ArrayList<Integer> blank_size = new ArrayList<Integer>();

		for (int i = num - 1; i >= 0; i--) {
			
			floor++;
			
			blank_size = blankSizeSetting(blank_size, floor, triangle);
			
			for (int j = 0; j < i; j++)
				bw.write(" ");

			printStarByFloor(i % 3);
			for (int j = 0; j < blank_size.size(); j++) {
				if (floor % 3 == 1)
					printBlankByNumber((blank_size.get(j) * 6) - 1);
				if (floor % 3 == 2)
					printBlankByNumber((blank_size.get(j) * 6) - 3);
				if (floor % 3 == 0)
					printBlankByNumber((blank_size.get(j) * 6) - 5);
				printStarByFloor(i % 3);
			}
			
			if (floor % 3 == 1)
				triangle++;
			
			for (int j = 0; j < i; j++)
				bw.write(" ");

			bw.write("\n");
			bw.flush();
			
		}
            bw.close();
	}

	private static ArrayList<Integer> blankSizeSetting(ArrayList<Integer> old_blank_size, int floor, int triangle) {
		ArrayList<Integer> new_blank_size = new ArrayList<Integer>();
		
		if (floor % 3 == 1 && ((triangle & (triangle - 1)) == 0) && triangle != 0) {
			new_blank_size.add(triangle);
			return new_blank_size;
		}
		
		if(triangle != 0 && ((triangle / 3) & (triangle / 3) - 1) == 0 && floor % 3 == 1 && triangle % 6 == 0) {
			for(int i=0; i<3; i++) {
				new_blank_size.add(triangle/3);
			}
			return new_blank_size;
		}
		
		
		if (floor % 3 == 1) {
			for (int i = 0; i < old_blank_size.size(); i++) {
				if(old_blank_size.get(i) == 1) {
					int one = 0;
					for(int j=i+1; j<old_blank_size.size(); j++) {
						if(old_blank_size.get(j) == 1)
							one++;
						else
							break;
					}
					if(one != 0) {
						new_blank_size.add((int) (old_blank_size.get(i) * (one+2)));
						i += one;
					} else
						new_blank_size.add(2);
				}
				else if (old_blank_size.get(i) % 2 == 1)
					new_blank_size.add(old_blank_size.get(i) - 1);
				else {
					new_blank_size.add(1);
					new_blank_size.add(old_blank_size.get(i) - 1);
					if(i == old_blank_size.size() - 1)
						new_blank_size.add(1);
				}
				
			}
			return new_blank_size;
		}
		return old_blank_size;

	}


	public static void printStarByFloor(int floor) throws IOException {
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

	public static void printBlankByNumber(int count) throws IOException {
		for (int i = 0; i < count; i++)
			bw.write(" ");
	}
	
}
