class disjointSet(object):
    def __init__(self, n):
        self.parent = []
        for i in range(0, n):
            self.parent.append(i)
        self.rank = [0] * n

    def dsFind(self, x):
        if (self.parent[x] != x):
            self.parent[x] = self.dsFind(self.parent[x])
        return self.parent[x]

    def dsUnion(self, a, b):
        parentA = self.dsFind(a)
        parentB = self.dsFind(b)

        if (parentA != parentB):
            if (self.rank[parentA] < self.rank[parentB]):
                self.parent[parentA] = parentB
            elif (self.rank[parentA] > self.rank[parentB]):
                self.parent[parentB] = parentA
            else:
                self.parent[parentB] = parentA
                self.rank[parentA] += 1


def minCostToSupplyWater(n: int, wells: list[int], pipes: list[list[int]]) -> int:
    minCost = 0
    connected = disjointSet(n + 1)

    numPipes = len(pipes)
    allCosts = []
    for i in range(0, numPipes):
        allCosts.append(pipes[i])
    for i in range(0, n):
        well = [0, i + 1, wells[i]]
        allCosts.append(well)

    for i in range(1, len(allCosts)):
        j = i
        while (j > 0 and allCosts[j-1][2] > allCosts[j][2]):
            temp = allCosts[j-1]
            allCosts[j-1] = allCosts[j]
            allCosts[j] = temp
            j -= 1

    for i in range(0, len(allCosts)):
        fromCity = allCosts[i][0]
        toCity = allCosts[i][1]

        if (connected.dsFind(fromCity) != connected.dsFind(toCity)):
            connected.dsUnion(fromCity, toCity)
            minCost += allCosts[i][2]

    return minCost
