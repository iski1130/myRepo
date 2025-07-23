import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] values = new int[10];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(10);
        }

        System.out.println("before shaker sort: " + Arrays.toString(values));

        int temp, leftIndex = 0, rightIndex = values.length - 1;

        do {
            int lastChange = -1;
            for (int j = leftIndex; j < rightIndex; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    lastChange = j + 1;
                }
            }
            if (lastChange == -1)
                break;
            rightIndex = lastChange;


            for (int j = rightIndex - 1; j >= leftIndex; j--) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    lastChange = j + 1;
                }
            }

            leftIndex = lastChange;

        } while (rightIndex >= leftIndex);

        System.out.println("after shaker sort: " + Arrays.toString(values));

        arrayCopy(values);

    }


    public static void arrayCopy(int []source){

        System.out.println("array source: " + Arrays.toString(source));    //array before the method
        Random random = new Random();
        int targetLength = random.nextInt(10);
        int []target = new int[targetLength];
        if(targetLength>0){
            for (int i = 0; i < target.length; i++) {
                target[i] = random.nextInt(10);
            }
        }
        System.out.println("array target: " + Arrays.toString(target));

        int[] result = new int[targetLength+source.length];
        int j = 0;
        for (int element : target) {
            result[j++] = element;
        }

        for (int element : source) {
            result[j++] = element;
        }

        System.out.println("array result: " + Arrays.toString(result));
    }

}
