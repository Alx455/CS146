import heapq

class solution:
    def minMeetingRooms(self, intervals: list[list[int]]) -> int:   
        runtimes = []
        runtimes.append(intervals[0][1])
        for i in range (1, len(intervals)):
            if (intervals[i][0] >= runtimes[0]):
                heapq.heappop(runtimes)
                heapq.heappush(runtimes, intervals[i][1])
            else:
                heapq.heappush(runtimes, intervals[i][1])
        return len(runtimes)
