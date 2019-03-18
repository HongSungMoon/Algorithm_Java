import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] infos = br.readLine().split(" ");

		int vertexCount = Integer.parseInt(infos[0]);
		int edgesCount = Integer.parseInt(infos[1]);
		int startVertex = Integer.parseInt(infos[2]);

		boolean[][] dfsGraph = new boolean[vertexCount][vertexCount];
		boolean[][] bfsGraph = new boolean[vertexCount][vertexCount];

		for (int i = 0; i < edgesCount; i++) {
			String[] edgeStr = br.readLine().split(" ");
			dfsGraph[Integer.parseInt(edgeStr[0]) - 1][Integer.parseInt(edgeStr[1]) - 1] = true;
			dfsGraph[Integer.parseInt(edgeStr[1]) - 1][Integer.parseInt(edgeStr[0]) - 1] = true;
			bfsGraph[Integer.parseInt(edgeStr[0]) - 1][Integer.parseInt(edgeStr[1]) - 1] = true;
			bfsGraph[Integer.parseInt(edgeStr[1]) - 1][Integer.parseInt(edgeStr[0]) - 1] = true;
		}

		// DFS
		String dfs = dfs(dfsGraph, startVertex, vertexCount);

		// DFS
		String bfs = bfs(bfsGraph, startVertex, vertexCount);

		bw.write(dfs);
		bw.newLine();
		bw.write(bfs);
		
		bw.flush();
		bw.close();

	}

	public static String dfs(boolean graph[][], int startVertex, int vertexCount) {

		Stack stack = new Stack(graph.length);
		stack.push(startVertex);

		for (int i = 0; i < vertexCount; i++) {
			graph[i][startVertex - 1] = false;
		}

		StringBuilder sb = new StringBuilder();

		while (true) {

			if (stack.isEmpty())
				break;

			int vertex = stack.pop();
			sb.append(String.valueOf(vertex) + " ");
			for (int i = 0; i < vertexCount; i++) {
				if (graph[vertex - 1][i]) {
					stack.push(i + 1);
					for(int j=0; j<vertexCount; j++) {
						graph[j][i] = false;
					}
					break;
				}
			}

		}

		return sb.toString();

	}

	public static String bfs(boolean graph[][], int startVertex, int vertexCount) {

		Queue queue = new Queue(vertexCount);
		queue.add(startVertex);

		for (int i = 0; i < vertexCount; i++) {
			graph[i][startVertex - 1] = false;
		}

		StringBuilder sb = new StringBuilder();

		while (true) {

			if (queue.isEmpty())
				break;

			int vertex = queue.poll();
			sb.append(String.valueOf(vertex) + " ");
			for (int i = 0; i < vertexCount; i++) {
				if (graph[vertex - 1][i]) {
					queue.add(i + 1);
					for(int j=0; j<vertexCount; j++) {
						graph[j][i] = false;
					}
				}
			}

		}

		return sb.toString();

	}

}

class Stack {

	int arr[];
	int idx;

	public Stack(int size) {
		arr = new int[size];
		this.idx = -1;
	}

	public void push(int data) {
		arr[++idx] = data;
	}

	public int pop() {
		return arr[idx--];
	}

	public boolean isEmpty() {
		if (idx == -1)
			return true;
		return false;
	}

}

class Queue {

	List<Integer> arr;

	public Queue(int size) {
		arr = new ArrayList<Integer>();
	}

	public void add(int data) {
		arr.add(data);
	}

	public int poll() {
		return arr.remove(0);
	}

	public boolean isEmpty() {
		return arr.isEmpty();
	}

}
