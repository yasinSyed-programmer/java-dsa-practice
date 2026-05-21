import java.util.*;

public class MergeSort {
    public static void conquer(int[] arr , int si , int ei){
        int[] merged = new int[arr.length];
        int mid = (si + ei) / 2;
        int i = si , j = mid+1 , k=0;
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                merged[k++] = arr[i++];
            }else{
                merged[k++] = arr[j++];
            }
        }
        
        while(i <= mid){
            merged[k++] = arr[i++];
        }
        while(j <=ei){
            merged[k++] = arr[j++];
        }
        for(int idx1 = 0 , idx2 = si ; idx1 <arr.length ; idx1++ , idx2++ )
            arr[idx2] = merged[idx1];
    }

    public static void divide(int arr[] , int si , int ei){
        if(si>=ei)
            return;

        int mid = (si+ei)/2;
        divide(arr , si , mid);
        divide(arr , mid+1 , ei);
        conquer(arr , si , ei);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("ente the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements into the array");
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        //function call return-tpe(void)
        divide(arr , 0 , size - 1);
        for(int i = 0 ; i<size ; i++)
            System.out.print(arr[i]);
        sc.close();
    }
}
