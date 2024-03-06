def invertTree(root):
    if root == None:
        return root
    invertTree(root.right)
    invertTree(root.left)
    if (root.left != None or root.right != None):
        temp = root.right
        root.right = root.left
        root.left = temp
    return root
