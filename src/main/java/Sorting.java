import java.sql.SQLOutput;
import java.util.Arrays;

public class Sorting {

    void main(){
        System.out.println("Sorting : Selection Sort, Bubble Sort, Insertion Sort");
        int [] array = {10,2,30,4,15};
        System.out.println("Array Before Sorting");
        for(int i:array){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Array After Sorting");

        insertionSort(array);
        for(int i:array){
            System.out.print(i + ", ");
        }
    }

    //Selection Sort: Select minimum and swap
    //Best/Worst/Average Case Time complexity: O(n^2)
    void selectionSort(int [] array){
        for(int i=0; i<=(array.length-2); i++){
            int minIndex = i;
            for(int j = i+1;j<=(array.length-1); j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    //Bubble Sort: Select maximum and shift it to its adjacent place
    //Worst/Average Case Time complexity: O(n^2)
    //Best Case Time complexity: O(n)
    void bubbleSort(int []array){
        for(int i = array.length-1; i >=1 ; i--){
            boolean swapOccured = false;
            for(int j = 0; j<=i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapOccured = true;
                    System.out.println("Swap");
                }
            }
            if(swapOccured == false){
                break;
            }
        }
    }

    //Insertion Sort: Select subarray selecting from 0th index to nth index, and arranging subarrays in collect order
    //Worst/Average Case Time complexity: O(n^2)
    //Best Case Time complexity: O(n)
    void insertionSort(int [] array){
        for(int i = 1; i<= array.length-1; i++){
            int j = i;
            while(j>0 && array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    j--;
            }
        }
    }

}
