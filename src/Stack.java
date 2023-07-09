public class Stack {
    private int[] stck;
    private int tos;

    public Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length) {
            System.out.println("стек полон.");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        } else {
            return stck[--tos];
        }
    }
}
