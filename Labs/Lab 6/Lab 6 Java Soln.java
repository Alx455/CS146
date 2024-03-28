import java.util.*;

public class Main {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            List<Integer> course = new ArrayList<Integer>();
            graph.add(course);
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegrees = new int[graph.size()];
        for (List<Integer> edges: graph) {
            for (int i = 0; i < edges.size(); i++) {
                indegrees[edges.get(i)]++;
            }
        }

        List<Integer> sorted = new LinkedList();

        Queue<Integer> toBeSorted = new LinkedList<Integer>();
        for (int j = 0; j < indegrees.length; j ++) {
            if (indegrees[j] == 0)
                toBeSorted.add(j);
        }

        while (!toBeSorted.isEmpty()) {
            int current = toBeSorted.poll();
            sorted.add(current);

            List<Integer> outgoing = graph.get(current);
            for (int k = 0; k < outgoing.size(); k++) {
                indegrees[outgoing.get(k)]--;
                if (indegrees[outgoing.get(k)] == 0)
                    toBeSorted.add(outgoing.get(k));
            }
        }


        if (sorted.size() != graph.size()) {
            List<Integer> invalid = new LinkedList();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
