def spreadHelper(image, x, y, current, color):
    if (image[x][y] == current and image[x][y] != color):
        image[x][y] = color
        if (x-1) >= 0:
            spreadHelper(image, x-1, y, current, color)
        if (x+1) <= (len(image) - 1):
            spreadHelper(image, x+1, y, current, color)
        if (y-1) >= 0:
            spreadHelper(image, x, y-1, current, color)
        if (y+1) <= (len(image[0]) - 1):
            spreadHelper(image, x, y+1, current, color)


def floodFill(image, sr, sc, color):
    if image[sr][sc] == color:
        return image
    spreadHelper(image, sr, sc, image[sr][sc], color)
    return image

