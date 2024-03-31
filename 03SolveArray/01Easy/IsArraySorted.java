import java.util.Scanner;

public class IsArraySorted {

    public static boolean checkSorted(int arr[], int size) {
        if(size == 1 || size == 0) {
            return true;
        }

        if(arr[size - 1] < arr[size - 2]) {
            return false;
        }

        return checkSorted(arr, size - 1);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        boolean ans = checkSorted(arr, size);
        System.out.println(ans);
        s.close();
    }
}
