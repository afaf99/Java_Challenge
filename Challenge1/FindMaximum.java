package Challenge1;

import java.util.Arrays;
import java.util.List;

public class FindMaximum {

    public static void main(String[] args) {

        Integer[] num  = {1, 2, 3, 4, 5, 6,7, 8, 9, 10};
        Integer maxNum = maximum(num);
        System.out.println("The Maximum num is " +maxNum);

    }

    public static Integer maximum(Integer[] numList) {
        int max = numList[0];

        for (int i = 1; i < numList.length; i++) {
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        return max;
    }
}


