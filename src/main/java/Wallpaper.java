import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wallpaper {
    private int width;
    private int length;
    private int rapport;

    public Wallpaper(int width, int length, int rapport) {
        this.width = width;
        this.length = length;
        this.rapport = rapport;
    }
}
