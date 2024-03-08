I initially approached this problem by a very simple recursive algorithm where I
checked if the current root was greater than its left child and smaller than its
right child. This proved to not work as it failed to check if any values beyond the
children maintained the same property(left subtree is smaller than root and right
subtree is greater than root). After some examination, I realized that simply checking
the left subchild of the right child of the root, and the right subchild of the left
child of the root was enough to uphold this property of a BST. I added those checks 
along with verification that the nodes existed and finalized my algorithm.
