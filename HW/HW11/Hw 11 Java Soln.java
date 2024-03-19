public class Main {
    public static void spreadHelper(int[][] image, int x, int y, int current, int color) {
        if (image[x][y] == current && image[x][y] != color) {
            image[x][y] = color;
            if ((x - 1) >= 0)
                spreadHelper(image, x - 1, y, current, color);
            if ((x + 1) <= image.length - 1)
                spreadHelper(image, x + 1, y, current, color);
            if ((y - 1) >= 0)
                spreadHelper(image, x, y - 1, current, color);
            if ((y + 1) <= image[0].length - 1)
                spreadHelper(image, x, y + 1, current, color);
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        spreadHelper(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public static void main(String[] args) {
        
    }
}
