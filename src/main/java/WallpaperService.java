public class WallpaperService {
    public int calculatePerimeter(Room room) {
        return (room.getWidth() + room.getLength()) * 2;
    }

    public int getQuantityCanvasesPerPerimeter(int perimeterRoom, int widthWallpaper) {
        int result = (int) Math.ceil(perimeterRoom / (double) widthWallpaper);
        return result;
    }

    public int getHeightCanvas(int heightRoom, int rapportWallpaper) {
        int result = heightRoom + rapportWallpaper;
        return result;
    }

    public int getQuantityWholeCanvasesInRoll(int lengthWallpaper, int heightCanvas) {
        int result = (int) Math.floor(lengthWallpaper / (double) heightCanvas);
        return result;
    }

    public int calculateQuantityRolls(Room room, Wallpaper wallpaper) {
        int perimeterRoom = calculatePerimeter(room);
        int quantityCanvasesPerPerimeter = getQuantityCanvasesPerPerimeter(perimeterRoom, wallpaper.getWidth());
        int heightCanvas = getHeightCanvas(room.getHeight(), wallpaper.getRapport());
        int quantityWholeCanvasesInRoll = getQuantityWholeCanvasesInRoll(wallpaper.getLength(), heightCanvas);
        int resultQuantityRolls = (int) Math.ceil(quantityCanvasesPerPerimeter / (double) quantityWholeCanvasesInRoll);
        return resultQuantityRolls;
    }
}
