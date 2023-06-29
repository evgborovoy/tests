public class Main {
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.setArea("На югах");
        b.setWinterFly(false);
        b.display();
//        System.out.println(b.getArea());
//        System.out.println(b.isWinterFly());
        b.chirikChirik();

        Fish f = new Fish();
        f.setName("Сельд");
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        f.display();
//        System.out.println(f.getSquama());
//        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.display();
//        System.out.println(i.getWingCount());
//        System.out.println(i.isLikeJesus());
        i.ggggg();
    }

}
