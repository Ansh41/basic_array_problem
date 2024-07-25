public class number_that_appears_once {
    public static int appearance_once(int arr[]){
        int xor=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            xor= xor^arr[i];
        }
        return xor;
    }



    //for sorted array
    public static void main(String[] args) {
        int arr[]= {1,1,2,3,3,4,4};
       // int n=arr.length;
        System.out.println("the once appearing digit is: ");
        int ans=appearance_once(arr);
        System.out.println(ans);
    }
}
