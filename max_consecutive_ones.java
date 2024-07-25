public class max_consecutive_ones {
   public static int consecutive(int arr[], int n){
       int count=0;// ye agar one appear huwa hai to count ++ kr  dena
       int maximum_appeared=0;//ye count krte jate huwe abhi tk jitna max number of ones encounter huwa hai uske liye hai
       for(int i=0; i<n; i++){
           if(arr[i]==1) {
               count++;
               maximum_appeared = Math.max(maximum_appeared, count);//maximum appeared ko store kr dena
           }
           else{
               count=0;
           }
       }
       return maximum_appeared;
   }

    public static void main(String[] args) {
        int arr[]= {1,0,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,1,1};
        int n=arr.length;
        System.out.println("the maximum number of consecutive one in the array is: ");
        int maxx= consecutive(arr,n);
        System.out.println(maxx);
    }

}
