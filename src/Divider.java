public class Divider extends WritingMaterials {
    private String dividerType;
    private boolean draw = true;
    private boolean metal;


    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public void drawCircle() {
        System.out.println("Нарисован круг");
    }

    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ", Мой тип: " + this.dividerType
                + ", Из метала: " + this.metal + ", ");
        super.display();
    }

}
