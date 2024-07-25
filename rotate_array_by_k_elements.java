public class rotate_array_by_k_elements {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        int n = 3;// jitna me rotate krna hai array ko utna n liye
        int l=arr.length;//l ko array length denote kr de

        System.out.println("Original array: ");
        for (int i = 0; i < l; i++) {// normal printing of array elements in an array
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int last = arr[l-1];// last element ko last ke andr daal diye

            for(int j = l-1; j > 0; j--){
                arr[j] = arr[j-1];// shifts each element to the right by one place jabtk loop hai
            }
            arr[0] = last;// first element ke jagah last element ko daal dena
        }

        System.out.println();

        System.out.println("Array after right rotation: ");
        for(int i = 0; i< l; i++){
            System.out.print(arr[i] + " ");// elements ko print krwa dena
        }
    }
}

