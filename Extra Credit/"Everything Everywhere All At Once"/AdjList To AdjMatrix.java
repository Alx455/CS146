import java.util.HashMap;
import java.util.List;

public class Main {

    public static int[][] adjListToAdjMatrix(HashMap<Integer, List<Integer>> adjList, int size) {
        int[][] adjMatrix = new int[size][size];
        for (HashMap.Entry<Integer, List<Integer>> current : adjList.entrySet()) {
            int currentVertex = current.getKey();
            List<Integer> adjSubMatrix = current.getValue();
            for (int neighboorVertex : adjSubMatrix) {
                adjMatrix[currentVertex][neighboorVertex] = 1;
            }
        }
        return adjMatrix;
    }

    public static void main(String[] args) {

    }
}
