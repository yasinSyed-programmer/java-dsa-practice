import java.util.*;

public class QuickSort {
    public static int idx = 0;
    public static void partition(int[] arr , int si , int ei){

        int n ;
        int pivot = arr.length - 1 , Lpivot = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] < arr[pivot])
                Lpivot++;
        }
        int[] Lpart = new int[Lpivot];
        int[] Rpart = new int[arr.length -Lpivot -1];
        int k = 0 , l = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]  < arr[pivot])
                Lpart[k++] = arr[i];
            else if (arr[i] > arr[pivot])
                Rpart[l++] = arr[i];
        }
        partition(Lpart , 0 , Lpivot);
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements into the array");
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        //recursive function call return type(void)

        sc.close();
    }
}
