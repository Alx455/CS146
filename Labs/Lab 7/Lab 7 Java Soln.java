import java.util.*;

public class Main {

    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int ans = -1;
        int citiesVisitable;
        int currentMin;

        int[][] shortestPaths = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                shortestPaths[i][j] = Integer.MAX_VALUE;
                if (i == j)
                    shortestPaths[i][j] = 0;
            }
        }
        for (int i = 0; i < edges.length; i++) {
            shortestPaths[edges[i][0]][edges[i][1]] = edges[i][2];
            shortestPaths[edges[i][1]][edges[i][0]] = edges[i][2];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (shortestPaths[i][k] != Integer.MAX_VALUE && shortestPaths[k][j] != Integer.MAX_VALUE) {
                        if (shortestPaths[i][j] > shortestPaths[i][k] + shortestPaths[k][j])
                            shortestPaths[i][j] = shortestPaths[i][k] + shortestPaths[k][j];
                    }
                }
            }
        }

        currentMin = n;
        for (int i = 0; i < n; i++) {
            citiesVisitable = 0;
            for (int j = 0; j < n; j++) {
                if (shortestPaths[i][j] <= distanceThreshold)
                    citiesVisitable++;
            }
            if (currentMin >= citiesVisitable) {
                currentMin = citiesVisitable;
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
    }
}
