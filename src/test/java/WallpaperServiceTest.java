import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallpaperServiceTest {
    @Test
    void checkCalculatePerimeter() {
        Room room = new Room(400, 500, 260);
        WallpaperService service = new WallpaperService();
        assertEquals(1800, service.calculatePerimeter(room));
    }

    @Test
    void checkCalculateQuantityCanvasesPerPerimeter() {
        Room room = new Room(400, 500, 260);
        Wallpaper wallpaper = new Wallpaper(53, 1005, 64);
        WallpaperService service = new WallpaperService();

        int perimeterRoom = service.calculatePerimeter(room);
        int quantityCanvases = service.getQuantityCanvasesPerPerimeter(perimeterRoom, wallpaper.getWidth());

        assertEquals(34, quantityCanvases);
    }

    @Test
    void checkCalculateHeightCanvas() {
        Room room = new Room(400, 500, 260);
        Wallpaper wallpaper = new Wallpaper(53, 1005, 64);
        WallpaperService service = new WallpaperService();

        int heightCanvas = service.getHeightCanvas(room.getHeight(), wallpaper.getRapport());

        assertEquals(324, heightCanvas);
    }

    @Test
    void checkCalculateQuantityWholeCanvasesInRoll() {
        Room room = new Room(400, 500, 260);
        Wallpaper wallpaper = new Wallpaper(53, 1005, 64);
        WallpaperService service = new WallpaperService();

        int heightCanvas = service.getHeightCanvas(room.getHeight(), wallpaper.getRapport());
        int quantityCanvasesInRoll = service.getQuantityWholeCanvasesInRoll(wallpaper.getLength(), heightCanvas);

        assertEquals(3, quantityCanvasesInRoll);
    }

    @Test
    void checkCalculateQuantityRoll() {
        Room room = new Room(400, 500, 260);
        Wallpaper wallpaper = new Wallpaper(53, 1005, 64);
        WallpaperService service = new WallpaperService();

        assertEquals(12, service.calculateQuantityRolls(room, wallpaper));
    }
}