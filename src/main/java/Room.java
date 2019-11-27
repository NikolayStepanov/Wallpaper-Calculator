import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Room {
    private int width;
    private int length;
    private int height;

    public Room(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
}
