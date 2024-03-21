import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static HashMap<Integer, List<Integer>> adjMatrixToAdjList(int[][] adjMatrix) {
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        for (int i = 0; i < adjMatrix.length; i++) {
            List<Integer> adjacent = new ArrayList<>();
            for (int j = 0; j < adjMatrix[i].length; j++) {
                if (adjMatrix[i][j] == 1)
                    adjacent.add(j);
            }
            adjList.put(i, adjacent);
        }
        return adjList;
    }

    public static void main(String[] args) {

    }
}
