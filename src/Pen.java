public class Pen extends WritingMaterials {
    private int countColor = 1;

    private boolean draw = true;

    private boolean auto;

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }


    @Override
    public boolean isDraw() {
        return draw;
    }

    @Override
    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public void writeMyName() {
        System.out.println("Your name is SUPERMAN");
    }
    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ", Мои цвета: " + this.countColor
                + ", Автоматическая: " + this.auto + ", ");
        super.display();
    }
}
