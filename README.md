# Sequence Checker codingAssignment_3 COP3337

This Java program checks if a given sequence follows a specific pattern. The pattern is defined by three multipliers (x, y, z) that are applied to previous elements in the sequence to calculate the next element.

## Code Overview

The `main` function iterates over a range of potential multipliers, and for each combination, it checks if the sequence follows the pattern defined by these multipliers. If a valid sequence is found, it prints the sequence and the multipliers. If no valid sequence is found, it prints "No multipliers found".

The `checkSequence` function takes three multipliers (x, y, z) as input and checks if the sequence follows the pattern defined by these multipliers. It returns the output sequence if it's valid, or null otherwise.

## Usage

To run the program, simply compile and run the Java file. The sequence to be checked is hardcoded in the program.
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
