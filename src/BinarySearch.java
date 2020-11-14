public class BinarySearch {
    public static void main(String[] args) {
        int[] massiv = {12,23,43,123,567,345,96,345,754,543} ;

        System.out.println(recursiveBinarySearch(massiv , 543 , 12,345));

    }


    public static int recursiveBinarySearch(int[] arr, int lastElement , int firstElement , int elementToSearch){
        if(lastElement >= firstElement){
            int mid = firstElement + (lastElement - firstElement);

            if (arr [mid] == elementToSearch)
                return mid;

            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr,firstElement ,mid - 1,elementToSearch);

            recursiveBinarySearch(arr, mid + 1 ,firstElement ,elementToSearch);


        }

        return -1;
    }
}

