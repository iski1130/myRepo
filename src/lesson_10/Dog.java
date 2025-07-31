package lesson_10;

public class Dog extends Animal{
    private int runDistance = 500;
    private int swimDistance = 10;

    @Override
    public void run(int distance) {

        if (distance>runDistance) {
            System.out.println("Dog cannot run so fast.");
        }else{
            System.out.println("Dog runs " + distance + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance>swimDistance){
            System.out.println("Dog cannot swim this distance.");
        }else{
            System.out.println("Dog swims " + distance + " meters.");
        }

    }
}
