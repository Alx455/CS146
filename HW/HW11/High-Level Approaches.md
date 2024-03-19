My idea to solve this problem was initially a recursive helper function. I recognized
immediately that this problem was a BFS/DFS problem so I spent some time trying to 
figure out how to icorporate a queue into my recursive helper fuciton. After some though
I thought about simply applying the logic of BFS/DFS without the actual specific use of a
queue or stack. My initial solution was to create a second 2D array of the same size as
our input image array. It would be intialized to 0 and would keep track of tho corresponding
indeicies visited. I marked the initial index [sr][sc] as 1 and used my recursive funciton
to explore the rest of the image array based on my visited 2D array. This was done by 
decrementing and incrementing both the x and y coordinates individually. This solution worked,
though halfway through I realized my 2d array that kept track of visited inticies was not necessary
as I did not have to explore every node, just adjacent ones. Because of this, I was able to
substitute the 2d array with a simple if statement that checked if the current node was 
the same as the original color ot be overriden while also checking if it had not already been
overriden to avoid redundant visits. This worked same as my first version and was more simple.
