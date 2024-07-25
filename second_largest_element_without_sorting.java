public class second_largest_element_without_sorting {
    public static void main(String[] args) {
        int arr[]={3,5,34,5,5,2,51,53,51,51,35,5,15,1,5,5,5,};
        int n=arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("the second largest element in the array is: "+ arr[n-2]);
    }
}
