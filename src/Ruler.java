public class Ruler extends WritingMaterials {
    private double length;
    private boolean draw = false;
    private boolean wood;


    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public void measure() {
        System.out.println("Сейчас померяем длину");
    }
    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ", Моя длина: " + this.length
                + ", Из дерева: " + this.wood + ", ");
        super.display();
    }


}
