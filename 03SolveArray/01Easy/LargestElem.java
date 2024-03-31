import java.util.Scanner;

public class LargestElem {

    public static int findLargest(int arr[]) {
        int maxElem = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }

        return maxElem;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int ans = findLargest(arr);
        System.out.println(ans);
        s.close();
    }
}