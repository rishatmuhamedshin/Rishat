import java.util.Random;


public class Max_Min_Sred {

    static int[] random = new int[100];


    public static void main(String[] args) {

        Random randomno = new Random();

        for (int i = 0; i < 100; i ++){
            random[i] = randomno.nextInt(100000);
        }
        insertionSort();
        Sytem_out();

    }

    public static void insertionSort() {
        for (int i = 1; i < random.length;i ++){

            int currect = random[i];
            int j = i - 1;

            while (j >= 0 && currect < random[j]){
                random[j + 1] = random[j];
                j--;
            }
            random[j + 1] = currect;
        }
    }
    public static void Sytem_out(){
        System.out.println("Макс равен = " + random[99]);
        System.out.println("Миним равен = " + random[0]);
        System.out.println("Середина = " + random[49]);
    }

}
