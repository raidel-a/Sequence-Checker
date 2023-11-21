# Sequence Multiplier Finder

This Java program finds the multipliers of a sequence of numbers. It checks combinations of three numbers (x, y, z), each ranging from -10 to 10, against a predefined sequence. If a match is found, it prints the output sequence and the values of x, y, and z. If no match is found, it prints "No multipliers found" and calls a test function.

## Code Explanation

The `main` method starts by creating a Scanner object for user input and a boolean variable `continueTesting` to control the main loop. The program then enters a loop where it checks all combinations of x, y, and z against the sequence. If a match is found, it prints the output sequence and the multipliers, and breaks the loop. If no match is found, it prints "No multipliers found" and calls a test function.

After each run, the program asks the user if they want to test another sequence. If the user enters "yes", it prompts them to enter a new sequence, which replaces the old sequence. If the user enters "no", it exits the loop and ends the program.

The `parseSequence` method is used to convert the user's input into an array of integers. The `checkSequence` method checks a sequence of numbers against a calculation involving three variables (x, y, z), and stores the output sequence when a match is found.

## Note

This is a brute force recursive solution

Multiplier: x, y, z
--------------------------------------
X -> is the multiplier of the recursive call of the (n-1) term 

Y -> is the multiplier of the recursive call of the (n-2) term

Z -> is the multiplier of the recursive call of the (n-3) term

Group 5 Sequence
---------------------------------------------
1, 1, 2, -16, 52, -152, 464, -1456, 4576, -14336, 44864, -140416, 439552, -1376000, 4307456, -13484032, 42210304, -132134912, 413634560, -1294839808