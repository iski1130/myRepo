package lesson_10;

public class Cat extends Animal{
    private int runDistance = 200;

    @Override
    public void run(int distance) {
        if(distance>runDistance){
            System.out.println("Cats cannot run this distance");
        }else{
            System.out.println("Cat runs " + distance + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat doesn't swim");
    }
}
