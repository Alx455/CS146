My approach to this problem was immediately to use a queue. From the in class demonstration
that our classmate presented, I thought of checking if the root is null in order to deal
with the case of an empty BST. Otherwise, I enter an outer while loop that is responsible for
creating the list for the current BST level. An inner while loop takes care of
adding the current level node values into our sublist while simultaneously adding the nodes
of the next level to the queue. The inner loop is dependednt on the amount of nodes that were
added in the previous iteration, so it hnadles only the nodes of that current level.
