import heapq

def canFinish(numCourses, prerequisites):
    graph = [[] for i in range(numCourses)]

    for i in range (0, len(prerequisites)):
        graph[prerequisites[i][1]].append(prerequisites[i][0])

    indegrees = [0] * len(graph)
    for i in range (0, len(graph)):
        for j in range (0, len(graph[i])):
            indegrees[graph[i][j]] += 1;

    sorted = []

    toBeSorted = []
    for i in range (0, len(indegrees)):
        if (indegrees[i] == 0):
            toBeSorted.append(i)

    while len(toBeSorted) > 0:
        current = toBeSorted.pop(0)
        sorted.append(current)

        outgoing = graph[current]
        for i in range (0, len(outgoing)):
            indegrees[outgoing[i]] -= 1
            if (indegrees[outgoing[i]] == 0):
                toBeSorted.append(outgoing[i])

    if len(sorted) != len(graph):
        return False

    return True


pre = [[1,0], [0,1]]
if canFinish(2, pre):
    print("Can finish")
else:
    print ("Cannot finish")
