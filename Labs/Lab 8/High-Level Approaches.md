My approach was tabulation. I found the minimum amount of coins necessary to complete all 
amounts building up to our target amount. I did this by having an array that stored these counts.
Each index of the array represented the amount and its value at that index is the minimum amount of
coins necessary to make that amount. Under the assumption that the array is sorted, I can iterate
through the coin denominations and check if the current amount  minus a given coin is already present
in our counts array. If it is, then I could input that as another valid optimal solution to our array.
This process is repeated until it leads us to the optimal solution to the final target amount or in
the case that there is no solution, the final index of our counts array will be a max integer, which
denotes no solution is possible and returns -1.
