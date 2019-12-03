import java.util.HashSet;
import java.util.Set;

public class Solution {

    static boolean[] idxs;
    static int num = 0;
    static int count = 0;
    static String str;
    static int result = 0;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(solution("011"));
    }

    public static int solution(String numbers) {
        str = numbers;
        idxs = new boolean[str.length()];
        func();
        return result;
    }

    public static void func() {

        if(isSosu(num)) {
            if(!set.contains(num)) {
                result++;
                set.add(num);
            }
        }

        for(int i=0; i<idxs.length; i++)  {
            if(!idxs[i]) {
                idxs[i] = true;
                count++;
                num *= 10;
                num += str.charAt(i) - '0';
                func();
                count--;
                idxs[i] = false;
                num /= 10;
            }
        }

    }

    static boolean isSosu(int num) {
        if(num == 0 || num == 1)
            return false;

        for(int i=2; i<=num/2; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

}