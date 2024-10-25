

public class Mountain implements Formation {
    private int height;
    private String name;

    public Mountain(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return "Mountain Name: " + name + ", Height: " + height + " meters";
    }

}