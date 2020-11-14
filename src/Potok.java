
import java.util.Arrays;
import java.util.Scanner;

public class Potok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
       String[] words = name.trim().split(" ");
       return words.length == 3;
    }
    private static String formatName(String name) {
        String gg = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        return gg;
    }

    private static void sortByLength(String[] words) {
        boolean  isProv = true;
        while(isProv) {
            isProv = false;
            for (int i = 0; i < words.length ; i++) {
                if (words[i].length() > words[i + 1].length()){
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    isProv = true;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}