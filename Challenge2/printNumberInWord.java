package Challenge2;

public class printNumberInWord {
    public static void main(String[] args) {


        int number = 9;

        if (number == 1) {
            System.out.println("ONE");
        }if(number == 2){
            System.out.println("TWO");
        }if (number ==9) {
            System.out.println("NINE");
        }if(number != 1 && number !=2 && number!=9 ){
            System.out.println("OTHER");
        }

        switch(number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
