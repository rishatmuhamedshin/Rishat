

import java.util.Arrays;


public class Vibor {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 123, 543,765,37,3458345,34631,235,46,523};
        choiceSort(unsortedArray);
    }
    public static void choiceSort(int[] arrayToSort){
        int MinIndex;
        for (int i = 0; i < arrayToSort.length - 1 ; i++) {
             MinIndex = i;
            for (int indexToScan = i; indexToScan < arrayToSort.length ; indexToScan++) {
                if (arrayToSort[MinIndex] > arrayToSort[indexToScan]){
                    MinIndex = indexToScan;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[MinIndex];
            arrayToSort[MinIndex] = temp;


        }
        System.out.println(Arrays.toString(arrayToSort));
    }

    }


