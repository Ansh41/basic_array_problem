public class sorted_or_not {
    public static boolean issorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i-1])
                    return false;
            }
        return true;
    }
    public static void main(String[] args) {
        int arr[]= {1,6,4,5,6,6,7,7};
        int  n=arr.length;// previously was written here n=5;
        System.out.println(issorted(arr, n));
    }
}
//optimal approach