public class Animal {
    protected String type;
    protected String name;
    protected int age;
    protected double weight;
    protected boolean isFly;
    protected boolean isWalk;
    protected boolean isSwim;
    private static String description = "Животные. Некоторых едим мы, а кто-то может съесть и нас";
    static void description(){
        System.out.println(description);
    }

    {
        name = "noName";
        type = "Animal";
    }

    public Animal (){
    }
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No name";
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public void display() {
        System.out.println("Тип:" + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight
                + ", Умеет летать: " + isFly + ", Умеет ходить: " + isWalk + ", Умеет плавать: " + isSwim + ".");

    }

    public void reName(String newName) {
        name = newName;
    }

    public void holiday() {
        weight += 0.1;
    }

    public void holiday(int days) {
        weight += days * 0.1;
    }
    public void holiday(double m) {
        this.weight += m;
    }
    public void holiday(double m, int n) {
        this.weight += m * n;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwimm() {
        return isSwim;
    }

    public void setSwimm(boolean swim) {
        isSwim = swim;
    }
}
