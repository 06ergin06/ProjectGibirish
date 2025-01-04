import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.replace(" ", "");
        String[] array = new String[input.length()];
        // boolean haveZ = input.contains("ZERO");
        // boolean haveO = input.contains("ONE");
        int arrIndex = 0;
        for (int i = 0; i < (input.length() - 1); i++) {
            int startZero = input.indexOf("ZERO", i);
            int startOne = input.indexOf("ONE", i);
            if (startZero == i) {
                System.arraycopy(addArrayZero(startZero, (startZero + 4), input), 0, array, arrIndex, 1);
                arrIndex++;
            }
            if (startOne == i) {
                System.arraycopy(addArrayOne(startOne, (startOne + 3), input), 0, array, arrIndex, 1);
                arrIndex++;
            }
        }
        for (String arr : array) {
            if (arr != null) {
                System.out.println(arr);
            }
        }

    }

    public static String[] addArrayZero(int startZero, int end, String input) {
        String[] arr2 = new String[1];
        arr2[0] = input.substring(startZero, end);
        return arr2;
    }

    public static String[] addArrayOne(int startOne, int end, String input) {
        String[] arr2 = new String[1];
        arr2[0] = input.substring(startOne, end);
        return arr2;
    }
}