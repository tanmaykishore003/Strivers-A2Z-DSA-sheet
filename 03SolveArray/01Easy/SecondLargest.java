import java.util.Scanner;

public class SecondLargest {

    public static int[] getSecondOrderElements(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax && secondMax < max) {
                secondMax = arr[i];
            }

            if(arr[i] < min && secondMin > min) {
                secondMin = arr[i];
            }
        }

        return new int[]{secondMax, secondMin};
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
    }
}