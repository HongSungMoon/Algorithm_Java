import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String[] arr = new String[N];
		
		for(int i=0 ; i<N ; i++)
			arr[i] = reader.readLine();
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length())
					return 1;
				else if(o1.length() < o2.length())
					return -1;
				else 
					return o1.compareTo(o2);
			}
		});
		
		StringBuilder builder = new StringBuilder();
		String str = "";
		
		for(int i=0 ; i<arr.length ; i++){
			if(!arr[i].equals(str)){
				builder.append(arr[i]).append("\n");
				str = arr[i];
			}
		}
		
		System.out.println(builder);
	}
}

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>();

		int input_count = Integer.parseInt(br.readLine());

		for (int i = 0; i < input_count; i++) {
			String word = br.readLine();
			int length = word.length();
			if (!map.containsKey(length)) {
				ArrayList<String> array = new ArrayList<String>();
				array.add(word);
				map.put(length, array);
			} else if (!map.get(length).contains(word)) {
				map.get(length).add(word);
			}
		}

		Iterator<Integer> mapIter = map.keySet().iterator();

		while (mapIter.hasNext()) {
			ArrayList<String> value = map.get(mapIter.next());
			if (value.size() > 1) {
				List<String> arrays = value;
				Collections.sort(arrays);
				for (int i = 0; i < arrays.size(); i++) {
					bw.write(arrays.get(i));
					bw.newLine();
				}
			} else {
				bw.write(value.get(0));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();

	}

}
*/