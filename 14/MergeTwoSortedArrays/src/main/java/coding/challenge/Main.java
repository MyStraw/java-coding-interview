package coding.challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 0, 0, 0, 0, 0, 0은 p에 q를 추가하는 데 필요한 점입니다.
        int[] p = {-3, -2, 0, 3, 8, 12, 16, 17, 24, 39, 0, 0, 0, 0, 0, 0};
        int[] q = {-4, -2, -1, 1, 4, 36};

        SortArrays.merge(p, q);

        System.out.println("Result: " + Arrays.toString(p));
    }
}