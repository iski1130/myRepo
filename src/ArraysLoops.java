import java.util.Arrays;

public class ArraysLoops {
    public static void main(String[] args) {
        //1
        int[] arr = {0,0,1,0,1,0,1,1,1,0};
        System.out.println("Решение задачи 1:");
        System.out.println(Arrays.toString(arr));
        inversArray(arr);
        System.out.println();
        System.out.println();
        //1

        //2
        System.out.println("Решение задачи 2:");
        arrayHundred();
        System.out.println();
        System.out.println();
        //2

        //3
        System.out.println("Решение задачи 3:");
        int[] arrayTaskThree = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(arrayTaskThree));
        arrayTaskThree = arrayMultipleSix(arrayTaskThree);
        System.out.println(Arrays.toString(arrayTaskThree));
        System.out.println();
        System.out.println();
        //3

        //4
        System.out.println("Решение задачи 4:");
        int [][] diagonalArray = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        for(int i=0; i<diagonalArray.length;i++){
            System.out.println(Arrays.toString(diagonalArray[i]));
        }
        diagonalsArray(diagonalArray);
        System.out.println();
        System.out.println();
        //4

        //5
        System.out.println("Решение задачи 5:");
        int [] arrayTaskFive;
        arrayTaskFive = fillArrayAndReturn(5,9);
        System.out.println(Arrays.toString(arrayTaskFive));
        System.out.println();
        System.out.println();
        //5

        //6
        System.out.println("Решение задачи 6:");
        int [] arrayTaskSix = {9,4,2,15,-3,88,24};
        minMaxValue(arrayTaskSix);
        System.out.println();
        System.out.println();
        //6

        //7
        System.out.println("Решение задачи 7:");
        int [] arrayTaskSeven = {2,2,2,2,1,2,2,10,1,2};
        boolean result = findBalance(arrayTaskSeven);
        System.out.println(result);
        System.out.println();
        System.out.println();
        //7


    }

    //1.
    public static void inversArray(int[] a){
        for (int i=0; i<a.length; i++){
            if (a[i] == 0)
                a[i] = 1;
            else
                a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }

    //2.
    public static void arrayHundred(){
        int[] arr = new int[100];
        for(int i=0; i<arr.length; i++)
            arr[i]=i+1;
        System.out.println(Arrays.toString(arr));

    }

    //3.
    public static int[] arrayMultipleSix(int[] arr){
        for(int i=0; i<arr.length; i++)
            if(arr[i]<6)
                arr[i] *=2;
        return arr;
    }

    //4.
    public static void diagonalsArray(int[][] arr){
        System.out.println();
        for(int i=0; i<arr.length; i++) {
            for (int j =0; j<arr.length; j++) {
                if(i==j || i+j==arr.length-1)
                    arr[i][j] = 1;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    //5.
    public static int[] fillArrayAndReturn(int len, int initialValue){
        int []arr = new int[len];
        for(int i=0; i<len; i++)
            arr[i] = initialValue;
        return arr;

    }

    //6
    public static void minMaxValue(int [] arr){
        int maxValue=arr[0], minValue=arr[0];
        //!!!!!!!!!!!!!! можно ли так делать?
//        Arrays.sort(arr);
//        maxValue = arr[arr.length-1];
//        minValue = arr[0];
//        System.out.println("Min value:"+minValue+"      Max value: "+maxValue);


        for(int i=0; i<arr.length;i++){
               if (arr[i] > maxValue)
                   maxValue = arr[i];
               if (arr[i]<minValue)
                   minValue = arr[i];
        }
        System.out.println("Min value:"+minValue+"      Max value: "+maxValue);
    }

    //7
    
    public static boolean findBalance(int[] arr) {
        int leftSide = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSide += arr[i];
            int rightSide = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSide += arr[j];

            if (leftSide == rightSide) {
                return true;
            }
        }
        return false;
    }

}
