import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        solution(3, 5, 7, 4);
    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c};
        a(arr);
        return answer;
    }

    public static int a(int [] arr) {
        Arrays.sort(arr);

        int min = arr[0], result;
        for (int i = 1; i < 3; i++) {
            if ((arr[i] % min) == 0)
                continue;
            else {
                min--;
                i = 0;
                continue;
            }
        }
        result = min;
        return result;
    }
}


/*
* 4번
*
*  SELECT ID FROM GAME_USERS ORDER BY DISTANCE DESC, TIME_SPENT ASC Limit 50;
* */