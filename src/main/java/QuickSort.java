public class QuickSort {
    void main(){
        System.out.println("Sorting : Quick Sort");
        int [] array = {10,2,30,4,15};
        System.out.println("Array Before Sorting");
        for(int i:array){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Array After Sorting");

        quickSort(array, 0, array.length-1);
        for(int i:array){
            System.out.print(i + ", ");
        }
    }

    void quickSort(int [] array,int low, int high){
        if(low < high){
            int pIndex = partitionIndex(array, low, high);
            quickSort(array,low,pIndex - 1);
            quickSort(array, pIndex+1, high);
        }
    }

    int partitionIndex(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;
        while(i<j){
            while(array[i] <= pivot && i<=high-1){
                i++;
            }
            while(array[j] > pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = array[i];
                array[i]=array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }
}
