import java.util.PriorityQueue;

public class Main {
    public static int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer> runtimes = new PriorityQueue<Integer>();
        runtimes.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if ((intervals[i][0] >= runtimes.peek())) {
                runtimes.poll();
                runtimes.add(intervals[i][1]);
            } else {
                runtimes.add(intervals[i][1]);
            }
        }
        return runtimes.size();
    }


    public static void main(String[] args) {
        
    }
}
