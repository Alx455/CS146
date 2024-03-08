def isValidBST(root):
    if (root != None):
        if (root.left != None):
            if (root.val < root.left.val):
                return False
            if (root.left.right != None and root.val < root.left.right.val):
                return False
        if (root.right != None):
            if (root.val > root.right.val):
                return False
            if (root.right.left != None and root.val > root.right.left.val):
                return False
        return isValidBST(root.left) and isValidBST(root.right);
    return True;
