

public class Puzirik {
    public static void main(String[] args) {
        boolean IsProverka = false;
        int[] array = {12,23,43,123,567,345,96,345,754,543} ;

        while(!IsProverka){
            IsProverka = true;
                 for (int i = 1 ; i < array.length ; i ++) {
                     if (array[i - 1] > array[i]) {
                         int temp = array[i];
                         array[i] = array[i - 1];
                         array[i - 1] = temp;
                         IsProverka = false;
                     }
                 }

        }
        for (int i = 0; i < array.length ; i ++){
            System.out.print(array[i] + " ,");
        }
    }
}
