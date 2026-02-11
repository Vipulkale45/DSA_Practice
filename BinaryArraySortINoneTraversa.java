package DSA_Practice;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 0};

        int j = 0;   // position to place 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // print array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
