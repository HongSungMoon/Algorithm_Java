import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 1, 4 , 2, 1, 3};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int result = 100000;
        for (int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                if(result > i - map.get(arr[i])) {
                    result = i - map.get(arr[i]);
                }

            }
            map.put(arr[i], i);
        }

        if(result == 100000)
            return -1;

        return result;
    }

}
