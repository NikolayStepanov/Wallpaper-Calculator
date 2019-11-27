public class WallpaperService {
    public int calculatePerimeter(Room room) {
        return (room.getWidth() + room.getLength()) * 2;
    }

    public int getQuantityCanvases(int perimeterRoom, int widthWallpaper) {
        int result = (int) Math.ceil(perimeterRoom / (double) widthWallpaper);
        return result;
    }


}
