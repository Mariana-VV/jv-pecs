package core.mate.academy.model;

public class Truck extends Machine {
    private int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

