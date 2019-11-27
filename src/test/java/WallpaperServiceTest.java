import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallpaperServiceTest {

    @Test
    void calculatePerimeter() {
        Room room = new Room(400, 500, 260);
        WallpaperService service = new WallpaperService();
        assertEquals(1800, service.calculatePerimeter(room));
    }

    @Test
    void getQuantityCanvases() {
        Room room = new Room(400, 500, 260);
        Wallpaper wallpaper = new Wallpaper(53, 1005, 64);
        WallpaperService service = new WallpaperService();

        int perimeterRoom = service.calculatePerimeter(room);
        int quantityCanvases = service.getQuantityCanvases(perimeterRoom, wallpaper.getWidth());

        assertEquals(34, quantityCanvases);
    }
}