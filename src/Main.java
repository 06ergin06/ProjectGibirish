import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.replace(" ", "");
        String[] array = new String[input.length()];
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
        int[] binaryArr = new int[arrIndex];
        int arrayIndexB = 0;
        for (int i = 0; i < arrIndex; i++) {
            if (array[i].equals("ZERO")) {
                binaryArr[arrayIndexB] = 0;
                arrayIndexB++;
            } else if (array[i].equals("ONE")) {
                binaryArr[arrayIndexB] = 1;
                arrayIndexB++;
            }
        }
        int decimal = toDecimal(binaryArr);
        System.out.println(decimal);
        scan.close();
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
    public static int toDecimal(int[] binaryArr){
        String binary = "";
        for (int arr:binaryArr){
            binary += arr;
        }
        int decimal=Integer.parseInt(binary,2);
        return decimal;
    }

}