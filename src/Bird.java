public class Bird extends Animal {
    private String area;
    private boolean winterFly;

    public Bird() {
        this.setFly(true);
    }

    public void chirikChirik() {
        System.out.println("Chirik-Chirik");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ", Зона обитания: " + this.area
                + ", Улетаю на зимовку: " + this.winterFly + ", ");
        super.display();
    }

}
