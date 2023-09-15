package Challenge4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] num = {10, 20, 30, 40, 50, 60, 70, 80};
        double avgNum = average(num);

        System.out.println("The average number is: " + avgNum);

    }

    public static double average(Integer[] numList) {
        // enter your code here
        int sum =0;
        for(int num: numList){
            sum +=num;
        }
        return (double) sum/numList.length;
    }
}
