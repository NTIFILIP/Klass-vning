public class Dörr {
    double height;
    double width;
    double thickness;
    double weight;
    String material;
    String color;
    boolean open = false;

    public Dörr(double height, double width, double thickness, double weight, String material, String color) {
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
        this.material = material;
        this.color = color;
    }

    public void Open() {
        this.open = true;
    }

    public void Close() {
        this.open = false;
    }

    public boolean IsOpen() {
        return open;
    }
}
