public class RgbColor {
    private int red;
    private int green;
    private int blue;
    private double alpha;
    private String colorName;

    // big constructor
    public RgbColor(int red, int green, int blue, double alpha, String colorName) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
        this.colorName = colorName;
    }


    public RgbColor(int red, int green, int blue) {
        this(red, green, blue, 1.0);
    }


    public RgbColor(int red, int green, int blue, double alpha) {
        this(red, green, blue, alpha, "");
    }

    public int getRed(){
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String toString() {
        return "r=" + red + " g=" + green + " b=" + blue + " alpha=" + alpha;
    }
}