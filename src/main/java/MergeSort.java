import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSort {
     void main(){
         System.out.println("Sorting : Merge Sort");
         int [] array = {10,2,30,4,15};
         System.out.println("Array Before Sorting");
         for(int i:array){
             System.out.print(i + ", ");
         }
         System.out.println();
         System.out.println("Array After Sorting");

         mergeSort(array, 0, array.length-1);
         for(int i:array){
             System.out.print(i + ", ");
         }
     }
    //Insertion Sort: Select maximum and shift it to its adjacent place
    //Best/Worst/Average Case Time complexity: O(N log N)
    //Space Complexity: O(N)
    void mergeSort(int [] array, int low, int high){
         if (low >= high) {
             return ;
         }
         else{
             int mid=(low+high)/2;
             System.out.println(mid);
             mergeSort(array,low,mid);
             mergeSort(array,mid+1,high);
             merge(array,low,mid,high);
         }
     }
     void merge(int [] array, int low, int mid, int high){
         ArrayList temp = new ArrayList();
         int right = mid+1;
         int left = low;

         while(left<=mid && right<=high){
             if(array[left] <= array[right]){
                 temp.add(array[left]);
                 left++;
             }else{
                 temp.add(array[right]);
                 right++;
             }
         }
         while(left<=mid){
             temp.add(array[left]);
             left++;
         }
         while(right<=high){
             temp.add(array[right]);
             right++;
         }
         for(int i = low; i<=high;i++){
             int j = Integer.valueOf(temp.get(i-low).toString());
             array[i] = j;
         }
     }
}
