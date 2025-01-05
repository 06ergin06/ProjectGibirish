import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] array = new String[input.length()];
        int arrIndex = 0;
        for (int i = 0; i < (input.length() - 1); i++) {
            int startZero = input.indexOf("ZERO", i);
            int startOne = input.indexOf("ONE", i);
            if (startZero == i) {
                System.arraycopy(addArray(startZero, (startZero + 4), input), 0, array, arrIndex, 1);
                arrIndex++;
            }
            if (startOne == i) {
                System.arraycopy(addArray(startOne, (startOne + 3), input), 0, array, arrIndex, 1);
                arrIndex++;
            }
        }
        int[] binaryArr = new int[arrIndex];
        int arrayIndexB = 0;
        int i = arrIndex - 1;
        int j = 0;
        int kat = 1;
        while (i > 0) {
            while (j < (8 * kat)) {
                if (array[j].equals("ZERO")) {
                    binaryArr[arrayIndexB] = 0;
                    arrayIndexB++;
                } else if (array[j].equals("ONE")) {
                    binaryArr[arrayIndexB] = 1;
                    arrayIndexB++;
                }
                j++;
            }
            char ascii = (char) toDecimal(binaryArr, kat);
            kat++;
            i = i - 8;
            System.out.print(ascii);
        }

    }

    public static String[] addArray(int start, int end, String input) {
        String[] arr2 = new String[1];
        arr2[0] = input.substring(start, end);
        return arr2;
    }

    public static int toDecimal(int[] binaryArr, int kat) {
        String binary = "";
        int i = 0;
        i = (kat * 8) - 8;
        while (i < (8 * kat)) {
            binary += binaryArr[i];
            i++;
        }
        return Integer.parseInt(binary, 2);
    }
}