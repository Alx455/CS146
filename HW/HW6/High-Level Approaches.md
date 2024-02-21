I found this problem significantly harder than the similar twoSum porblem. My initial approach 
was similar to my two sum problem where I stored the array elemetns as Keys in a HashMap with
the purpose of being able to lookup elemtns quickly. Then I had two for loops iterate through
the array. I weould then search the HashMap for a Key that equaled the sum minus the array values
at i and j. While it did give me correct sums, it also gave me duplicates. I kept tweaking my code
in hopes of figuring out the duplicate issue, but could not and therefore scrapped this approach.
I then decided to use brute force. I first sort the input array, this is done with the purpose of
avoiding duplicates later on. Then I use three for loops to iterate throuhg the array and check if
the values at i, j and k sum up to our target value 0. Because the array is sorted, any resulting
triplets are produced in the same order. This allows me to take advantage of the List's contains
function and I can search wether that triplet already exists in my answer List. If it does not exist
The triplet is added, and it is not added if that triplet already exists.

