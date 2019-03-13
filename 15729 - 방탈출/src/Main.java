import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(br.readLine());
		String str = br.readLine().replaceAll(" ", "");

		List<String> strArr = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			strArr.add(str.charAt(i) + "");
		}

		if (length == 1 || length == 2) {
			int returnValue = 0;
			switch (str) {
			case "1":
				returnValue = 1;
				break;
			case "10":
				returnValue = 2;
				break;
			case "11":
				returnValue = 1;
				break;
			case "01":
				returnValue = 1;
				break;
			}
			bw.write(String.valueOf(returnValue));
			bw.flush();
			bw.close();
			return;
		}

		boolean[] change = new boolean[2];
		Arrays.fill(change, false);

		// System.out.println(str);

		int count = 0;
		int idx = 0;

		while (true) {

			String block = strArr.get(idx) + strArr.get(idx + 1) + strArr.get(idx + 2);
			// System.out.println(block);
			idx += 3;

			switch (block) {
			case "100":
				count += 2;
				change[0] = true;
				break;
			case "010":
				count += 2;
				change[1] = true;
				break;
			case "001":
				count += 1;
				change[0] = true;
				change[1] = true;
				break;
			case "110":
				count += 2;
				change[0] = true;
				break;
			case "101":
				count += 3;
				change[1] = true;
				break;
			case "011":
				count += 1;
				change[0] = true;
				break;
			case "111":
				count += 1;
				break;
			}
			int tmp_idx = 0;
			if (length - idx < 3) {
				if (!(change[0] == false && change[1] == false)) {
					for (int i = 0; i < length - idx; i++) {
						String tmp = null;
						if (change[i]) {
							tmp = "1";
							if (!strArr.get(idx + i).equals(tmp)) {
								if (strArr.get(idx + i).equals("0")) {
									strArr.set(idx + i, "1");
								} else {
									strArr.set(idx + i, "0");
								}
							} else {
								tmp_idx++;
							}
						}
					}

					idx += tmp_idx;
				}

				String lastStr = "";

				for (int i = idx; i < length - 1; i++) {
					lastStr += strArr.get(i);
				}

				switch (lastStr) {
				case "1":
					count += 1;
					break;
				case "01":
					count += 1;
					break;
				case "10":
					count += 2;
					break;
				case "11":
					count += 1;
					break;
				}
				break;
			} else {
				if (!(change[0] == false && change[1] == false)) {
					for (int i = 0; i < 2; i++) {
						String tmp = null;
						if (change[i]) {
							tmp = "1";
							if (!strArr.get(idx + i).equals(tmp)) {
								if (strArr.get(idx + i).equals("0")) {
									strArr.set(idx + i, "1");
								} else {
									strArr.set(idx + i, "0");
								}
							} else {
								tmp_idx++;
							}
						}
					}

					idx += tmp_idx;
				}
			}

			Arrays.fill(change, false);

		}

		bw.write(String.valueOf(count));

		bw.flush();
		bw.close();

	}

}