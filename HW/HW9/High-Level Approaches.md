My intuition for this approach came to me as an iterative approach rather than a
recursive one. By property of BST nodes, left child nodes are smaller while right
child nodes are greater, so I leveraged this property in order to find the lowest 
common ancestor. I noticed that whenever the values of p and q diverged on the BST, 
in other words, when one was smaller than the current node and the other was greater
than the current node, then I knew that the current node was their lowest common
ancestor. This was my main conditiion for returning from the funciton. Otherwise, I 
traveled down the tree depending on wether our p and q values were both smaller or
both greater than our current node value. This process was carried out iteratively
until our return condition was met.
