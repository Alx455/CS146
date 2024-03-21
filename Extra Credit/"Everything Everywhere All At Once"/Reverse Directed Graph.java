public class Main {

    public static int[][] reverseGraph(int[][] adjMatrix) {
        int size = adjMatrix.length;
        int[][] reversedAdjMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                reversedAdjMatrix[j][i] = adjMatrix[i][j];
            }
        }
        return reversedAdjMatrix;
    }

    public static void main(String[] args) {

    }
}
