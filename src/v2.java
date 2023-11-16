import java.util.ArrayList;
import java.util.Scanner;

public class v2 {
    static int[] sequence = {1, 1, 2, -16, 52, -152, 464, -1456, 4576, -14336, 44864, -140416, 439552, -1376000, 4307456, -13484032, 42210304, -132134912, 413634560, -1294839808};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueTesting = true;

        while (continueTesting) {
            infoHeader();

            boolean found = false;
            for (int x = -10; x <= 10; x++) {
                for (int y = -10; y <= 10; y++) {
                    for (int z = -10; z <= 10; z++) {
                        ArrayList<Integer> outputSequence = new ArrayList<>();
                        if (checkSequence(x, y, z, outputSequence)) {
                            System.out.println("Output sequence: " + outputSequence);
                            System.out.println("Found multipliers: x=" + x + ", y=" + y + ", z=" + z);
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }

            if (!found) {
                System.out.println("No multipliers found");
                test();
            }

            System.out.println("Would you like to test another sequence? (yes/no)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Please enter the new sequence, separated by commas:");
                String newSequence = scanner.nextLine();
                sequence = parseSequence(newSequence);
            } else {
                continueTesting = false;
            }
        }

        scanner.close();
    }

    public static int[] parseSequence(String newSequence) {
        String[] numbers = newSequence.split(",");
        int[] sequence = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            sequence[i] = Integer.parseInt(numbers[i].trim());
        }

        return sequence;
    }

    public static boolean checkSequence(int x, int y, int z, ArrayList<Integer> outputSequence) {
        outputSequence.add(sequence[0]);
        outputSequence.add(sequence[1]);
        outputSequence.add(sequence[2]);

        for (int i = 3; i < sequence.length; i++) {
            int calculatedValue = x * sequence[i - 1] + y * sequence[i - 2] + z * sequence[i - 3];
            if (sequence[i] == calculatedValue) {
                outputSequence.add(calculatedValue);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void infoHeader() {
        System.out.println("======================================");
        System.out.println(" \t\tStudent Info Header");
        System.out.println("======================================");
        System.out.println("PROGRAMMER: \t" + " Raidel Almeida");
        System.out.println("PANTHER ID: \t" + " 3932877");
        System.out.println();
        System.out.println("CLASS: \t\t\t COP3337");
        System.out.println("SECTION: \t\t " + "RVBB 1238");
        System.out.println("SEMESTER: \t\t " + "FALL 2023");
        System.out.println("CLASS TIME: \t " + "ONLINE");
        System.out.println();
        System.out.println("ASSIGNMENT:  \t " + "Coding Assignment 3");
        System.out.println("GROUP:  \t\t " + "5");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, ");
        System.out.println("and I certify that this work is my own");
        System.out.println("and that none of it is the work of any");
        System.out.println("other person");
        System.out.println("======================================");
        System.out.println();
    }

    public static void test() {
        System.out.println("""
                01101111 01110010 00100000 01101101
                01111001 00100000 01100011 01101111
                01100100 01100101 00100000 01110011
                01110101 01100011 01101011 01110011
                """);
    }
}
