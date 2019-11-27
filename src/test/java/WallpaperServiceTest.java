import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallpaperServiceTest {

    @Test
    void calculatePerimeter() {
        Room room = new Room(700,800,300);
        WallpaperService service = new WallpaperService();
        assertEquals(3000,service.calculatePerimeter(room));
    }
}