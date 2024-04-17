def findTheCity(n: int, edges: list[list[int]], distanceThreshold: int) -> int:
    ans = -1
    shortestPaths = [[float('inf') for col in range(n)] for row in range(n)]
    for i in range(0, n):
        shortestPaths[i][i] = 0
    for i in range (0, len(edges)):
        shortestPaths[edges[i][0]][edges[i][1]] = edges[i][2]
        shortestPaths[edges[i][1]][edges[i][0]] = edges[i][2]
    for k in range(0, n):
        for i in range(0, n):
            for j in range(0, n):
                if (shortestPaths[i][j] > shortestPaths[i][k] + shortestPaths[k][j]):
                        shortestPaths[i][j] = shortestPaths[i][k] + shortestPaths[k][j]
    currentMin = n
    for i in range(0, n):
        citiesVisitable = 0
        for j in range(0, n):
            if (shortestPaths[i][j] <= distanceThreshold):
                citiesVisitable += 1
        if (currentMin >= citiesVisitable):
            currentMin = citiesVisitable
            ans = i
    return ans

