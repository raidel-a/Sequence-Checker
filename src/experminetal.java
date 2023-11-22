import java.util.Arrays;
import java.util.Scanner;

public class experminetal {

    //    no sequence test
    //  static int[] sequence = {1,4,5,8,4,7,4,78,9,4567,45,457,45698,35678658};

    //    group 3 for testing algo
    //  static int[] sequence = {1, 1, 2, -5, 22, -106, 475, -2171, 9893, -45080, 205453, -936304, 4267030, -19446179, 88622237, -403878935, 1840601122, 201746431, -427139774, 1878826890}

    //    group 5
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
                        int[] outputSequence = checkSequence(x, y, z);
                        if (outputSequence != null) {
                            System.out.println("Given sequence " + Arrays.toString(sequence));
                            System.out.println("Output sequence: " + Arrays.toString(outputSequence));
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

            System.out.println("Would you like to test another sequence? yes / no");
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

    public static int[] checkSequence(int x, int y, int z) {
        // Create a new array to store the output sequence
        int[] outputSequence = new int[sequence.length];

        // Add the base cases to the output sequence
        for (int i = 0; i < 3; i++) {
            outputSequence[i] = sequence[i];
        }

        int prev = sequence[2];     // temporary variable to store the previous value

        for (int i = 3; i < sequence.length; i++) {
            int calculatedValue = x * prev + y * sequence[i - 2] + z * sequence[i - 3];
            if (sequence[i] == calculatedValue) {
                outputSequence[i] = calculatedValue;
                prev = calculatedValue;     // update the previous value
            } else {
                return null;
            }
        }
        return outputSequence;
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
