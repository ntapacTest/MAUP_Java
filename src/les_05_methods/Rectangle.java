package les_05_methods;

public class Rectangle {
    int height,width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void print(){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }
}