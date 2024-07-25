public class move_zeros_to_end {
    static int[] moveZeros(int []arr, int n){
        int j=-1;//imaginary space create kiye hai
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;//agar koi b element array ka 0 ke equal hai to wo zero imaginary jagah me daal diya jayega
                break;//aur break kr jayega
            }
        }
        if(j==-1)//aur agar equal nai hai zero ke to normal array hi return kr dega
            return arr;//no non-zero elements present in the given array

        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){//agar array element 0 ke equal nai hai to swap kr denge
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;//aur ek aur j ka jagah bana denge
            }
        }
        return arr;//aur return kr denge array
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,0,9,0,8,0,66,9,5,4,6,0,0,0,77};
        int n=arr.length;
        int [] ans= moveZeros(arr, n);//call kr liye
        for(int e: arr){
            System.out.print(e+ " ");

        }
        System.out.println(" ");
    }
}
