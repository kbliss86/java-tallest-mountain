public class Mesa implements Formation {

    private int height;
    private String name;
    private double area;

    // Constructor
    public Mesa(int height, String name, double area) {
        this.height = height;
        this.name = name;
        this.area = area;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return "Mesa Name: " + name + ", Height: " + height + " meters, Area: " + area + " square kilometers";
    }
}
