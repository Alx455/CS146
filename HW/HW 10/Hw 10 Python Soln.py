def levelOrder(root) -> list[list[int]]:
    levels = []
    if (root == None):
        return None
    nodes = []
    nodes.append(root)
    while not nodes:
        level = []
        x = len(nodes)
        i =0
        while i < x:
            n = nodes.pop()
            if n.left != None:
                nodes.append(n.left)
            if n.right != None:
                nodes.append(n.right)
            level.append(n.val)
            i += 1
        levels.add(level)
    return levels
