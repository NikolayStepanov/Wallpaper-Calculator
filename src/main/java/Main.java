public class Main {
    public static void main(String[] args) {
        Room room = new Room(700,800,300);
        WallpaperService service = new WallpaperService();
        System.out.println(service.calculatePerimeter(room));
    }
}
