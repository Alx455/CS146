def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
    it = root
    found = True
    while found:
        if ((p.val >= it.val and q.val <= it.val) or (p.val <= it.val and q.val >= it.val)):
            found = False
        elif (p.val > it.val and q.val > it.val):
            it = root.right
        else:
            it = root.left
    return it
