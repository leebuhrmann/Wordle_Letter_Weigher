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

stores these values in 5 integer arrays (one for each position), index 0 representing the number of occurences of 'a' and index 25 the number of occurences of 'z'.
