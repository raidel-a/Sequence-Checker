import java.util.ArrayList;

public class v1 {

//    no sequence test
//  static int[] sequence = {1,4,5,8,4,7,4,78,9,4567,45,457,45698,35678658};

//    group 3
//  static int[] sequence = {1, 1, 2, -5, 22, -106, 475, -2171, 9893, -45080, 205453, -936304, 4267030, -19446179, 88622237, -403878935, 1840601122, 201746431, -427139774, 1878826890};

//    group 5
   static int[] sequence = {1, 1, 2, -16, 52, -152, 464, -1456, 4576, -14336, 44864, -140416, 439552, -1376000, 4307456, -13484032, 42210304, -132134912, 413634560, -1294839808};

   public static void main(String[] args) {
        infoHeader();

        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                for (int z = -10; z <= 10; z++) {
                    ArrayList<Integer> outputSequence = new ArrayList<>();
                    if (checkSequence(x, y, z, outputSequence)) {
                        System.out.println("Output sequence: " + outputSequence);
                        System.out.println("Found multipliers: x=" + x + ", y=" + y + ", z=" + z);
                        return;
                    }
                }
            }
        }
        System.out.println("No multipliers found");
        test();
    }

    public static boolean checkSequence(int x, int y, int z, ArrayList<Integer> outputSequence) {
        // Add base cases to output sequence
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

        public static void infoHeader(){

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

    public static void test(){
        System.out.println("""
                01101111 01110010 00100000 01101101
                01111001 00100000 01100011 01101111
                01100100 01100101 00100000 01110011
                01110101 01100011 01101011 01110011
                """);
    }

}

