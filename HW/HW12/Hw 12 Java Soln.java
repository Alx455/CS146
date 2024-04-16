import java.util.*;

class disjointSet {
    int[] parent;
    int[] rank;

    public disjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int dsFind(int x) {
        if (parent[x] != x)
            parent[x] = dsFind(parent[x]);
        return parent[x];
    }

    public void dsUnion(int a, int b) {
        int parentA = dsFind(a);
        int parentB = dsFind(b);

        if (parentA != parentB) {
            if (rank[parentA] < rank[parentB]) {
                parent[parentA] = parentB;
            } else if (rank[parentA] > rank[parentB]) {
                parent[parentB] = parentA;
            } else {
                parent[parentB] = parentA;
                rank[parentA]++;
            }
        }
    }
}


public class Main {

    public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int minCost = 0;
        disjointSet connected = new disjointSet(n + 1);

        int numPipes = pipes.length;
        int[][] allCosts = new int[numPipes + n][3];
        for (int i = 0; i < numPipes; i++) {
            allCosts[i] = pipes[i];
        }
        for (int i = numPipes; i < allCosts.length; i++) {
            allCosts[i][0] = 0;
            allCosts[i][1] = i - numPipes + 1;
            allCosts[i][2] = wells[i - numPipes];
        }

        // sorting all costs
        for (int i = 1; i < allCosts.length; i++) {
            int j = i;
            while (j > 0 && allCosts[j-1][2] > allCosts[j][2]) {
                int[] temp = allCosts[j-1];
                allCosts[j-1] = allCosts[j];
                allCosts[j] = temp;
                j -= 1;
            }
        }

        for (int i = 0; i < allCosts.length; i++) {
            int from = allCosts[i][0];
            int to = allCosts[i][1];

            if (connected.dsFind(from) != connected.dsFind(to)) {
                connected.dsUnion(from, to);
                minCost += allCosts[i][2];
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        
    }
}
