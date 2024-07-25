public class missing_n_in_array {
    public static int missingNumber(int []a, int N) {
        for (int i = 1; i <= N; i++) {

            int flag = 0;

            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {

                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = {1, 2,3, 4, 5,6,7,9,10};
        int N = a.length;

        int ans = missingNumber(a, N);
        System.out.println("The missing number in the array is: " + ans);
    }

}
