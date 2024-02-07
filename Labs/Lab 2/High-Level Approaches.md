Initially I planned to approach this problem by creating a Hashmap that 
assigned each letter of the alphabet to an according index position(A = 0, B = 1, C = 3, etc).
Then I was going to iterate over each input string with for loops and I would
populate an integer array with the count of each letter, using the HashMap to
facilitate this. Before I continued implementing it this way, I realized I could
just cast the character as an integer and subract its asscii value such that all
letters would be adjusted to reflect the according index number. Afterwards, I
compared both arrays for equality. If they were unequal, then the two input strings
are not anagrams, and the funciton returns false. If the arrays are equal, the function
returns true.
