public class Fish extends Animal {
    private String squama;
    private boolean upStreamSwim;

    public Fish() {
        this.setSwimm(true);
    }

    public void bulBul() {
        System.out.println("Bul-bul");
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    @Override
    public void display() {
        System.out.print("I am " + this.getClass().getSimpleName() + ", Моя чешуя: " + this.squama
                + ", Плыву против течения: " + this.upStreamSwim + ", ");
        super.display();
    }
}
