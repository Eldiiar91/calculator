import java.util.Scanner;
public class calculator {
    private static int value(char r) {...}

    private static int romanToDecimal(String str) {....}

    private static String intToRoman(int num) {....}

    private static int calculate(int number1, int number2, char operation){...}

    public static void main(String[] args) {

        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        Scanner scanner = new Scanner(System.in);
        String[] blocks = scanner.nextLine().split(" ");
        char operation = blocks[1].charAt(0);
        int number1 = 0, number2 = 0;
        boolean flag = false, flaq2 = false;

        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(blocks[0])) {
                flag = true;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(blocks[2])) {
                flaq2 = true;
            }
        }
        if (flag && flaq2) {
            number1 = romanToDecimal(blocks[0]);
            number2 = romanToDecimal(blocks[2]);
            System.out.println(intToRoman(calculate(number1, number2, operation)));

        } else {
            number1 = Integer.parseInt(blocks[0]);
            number2 = Integer.parseInt(blocks[2]);
            System.out.println(calculate(number1, number2, operation));

        }

        if ((number1 > 10 || number1 < 1) || (number2 > 10 || number2 < 1)) {
            throw new IllegalArgumentException();
        }


    }
}