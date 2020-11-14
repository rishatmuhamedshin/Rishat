import java.util.Scanner;



public class Fibonachi {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Input a number : ");
        int num = in.nextInt();

        int[] number = new int[num];
        number[0] = 0;
        number[1] = 1;

        for (int i = 2; i < num ; i ++) {
            number[i] = number[i - 1] + number[i - 2];
            if (number[i] >= num){
                break;
            }
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0){
                System.out.print(number[i] + " ");
            }
        }

    }
}
