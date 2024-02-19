package oldPackage;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
