package Challenge3;

public class Main {
    public static void main(String[] args) {

        checkOddEven(2);
        checkOddEven(5);


    }

    public static void checkOddEven(int num){
        int n = num % 2;
        if(n == 0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }
    }
}
