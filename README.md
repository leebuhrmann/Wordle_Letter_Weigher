Takes file input of a word list and counts the number of occurences of each letter in each position of each word that can be a correct guess for the game Wordle.

Example using a small list:

Happy,
Grass,
Names,
Words,
Rusty

position 1: g - 1, h - 1, n - 1, r - 1, w - 1,  all other letters 0
position 2: a - 2, o - 1, r - 1, u - 1,         all other letters 0
position 3: a - 1, m - 1, p - 1, r - 1, s - 1   all other letters 0
position 4: e - 1, d - 1, p - 1, s - 1, t - 1   all other letters 0
position 5: s - 3, y - 2                        all other letters 0

And the program will output the data in this format.

POS| 1 | 2 | 3 | 4 | 5 |
 A | 0 | 2 | 1 | 0 | 0 |
 ...
 E | 0 | 0 | 0 | 1 | 0 |
 ...
 G | 1 | 0 | 0 | 0 | 0 |
 H | 1 | 0 | 0 | 0 | 0 |
 ...
 M | 0 | 0 | 1 | 0 | 0 |
 N | 1 | 0 | 0 | 0 | 0 |
 O | 0 | 1 | 0 | 0 | 0 |
 P | 0 | 0 | 1 | 1 | 0 |
 ...
 R | 1 | 1 | 1 | 0 | 0 |
 S | 0 | 0 | 1 | 1 | 3 |
 ...
 U | 0 | 1 | 0 | 0 | 0 |
 ...
 W | 1 | 0 | 0 | 0 | 0 |
 ...
 Y | 0 | 0 | 0 | 0 | 2 |
