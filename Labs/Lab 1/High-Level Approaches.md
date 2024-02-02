I first approached this problem by brute force when it was introduced during class. 
I had two nested for loops that added every combination of array elments until it added up
to the target.
Then when data strucutres were mentioned in class, I decided to use a hashmap, storing the
array element as the key and the index as the value. I did this in one for loop. Then I wrote
a seperate for loop where i find the answer pair by subtracting the current element from
target and searching for the result as a key in the hashmap. When the pair is found, I assigned
the indicies to the answer array and wait for the loop to finish iterating before returning
the funciton
