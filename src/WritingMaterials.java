public class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean isDraw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public void setDraw(boolean draw) {
        isDraw = draw;
    }

    public WritingMaterials() {
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        this.color = "No color";
    }

    public WritingMaterials(int price, double length, boolean isDraw) {
        this.price = price;
        this.length = length;
        this.isDraw = isDraw;
        this.name = "No name";
        this.color = "No color";
    }

    public WritingMaterials(String name, String color, int price, double length, boolean isDraw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.isDraw = isDraw;
    }

    public void display() {
        System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price
                + ", Умеет рисовать: " + isDraw + ".");
    }

    public void replaceRod(String color) {
        this.color = color;
    }

    public void priceUp(int price) {
        this.price += price;
    }

    public void priceDown(int price) {
        this.price -= price;
    }

    public void draw() {
        if (isDraw) {
            System.out.println(name + " провёл линию. Её цвет - " + color + ".");
        }else {
            System.out.println(name + " не может ничего рисовать");
        }
    }
}
