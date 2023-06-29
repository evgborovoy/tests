public class Insect extends Animal {
    private int wingCount;
    private boolean likeJesus;
    {
        name = "noName";
        type = "Insect";
    }

    public Insect() {
        this.setWalk(true);
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }

    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ", Количество крыльев: " + this.wingCount
                + ", Хожу по воде: " + this.likeJesus + ", ");
        super.display();
    }
}
