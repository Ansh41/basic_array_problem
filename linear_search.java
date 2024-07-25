public class linear_search {
   static void linear(int []arr, int n){
       int key=33;
       for(int i=0; i<n; i++){
           if(arr[i]==key){
               System.out.println("the element is present in the "+ i+" index");
               break;
           }
       }
   }

    public static void main(String[] args) {
        int arr[]={1,33,4,5,6,3,4,5,3,3,4,4};
        int n=arr.length;
        linear(arr, n);
    }
}
//time complexity 0(N)