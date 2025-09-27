public class ReverseAnArray {
   
    public static void main(String[] args) {
         int[] arr={24,13,23,4,5,6,77,12};
         reverseArray(arr);
    }
    public static void reverseArray(int[] arr) {
        // code here
        //reversing an array using recursion
       
        int idx=arr.length-1;
          recursionReverse(arr,0, idx);
      
    }
    
    public static  void recursionReverse(int[] arr, int left,int right){
        
         if(left>=right)  return; 
         
        swap(arr, left,right);
      
         recursionReverse(arr,left+1,right-1);
       
    }
    public static void swap(int arr[], int left, int right){  
          int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
            System.out.println(arr);     
        
    }
}

