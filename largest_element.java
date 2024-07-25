public class largest_element {
    public static void sort(int arr[]){
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(" ");
        }


    }
    public static void main(String[] args) {
        int arr[]={1,4,2,6,2,5,6,43,2,4,56,3,4,56,53};
        int n=arr.length;
        sort(arr);
        System.out.println("the sorted array is: ");
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println(" ");
        System.out.println("and the largest element is: ");
        int largest=arr[n-1];
        System.out.println(largest);
    }
}
//or can be solved how i solved the second largest wala question
