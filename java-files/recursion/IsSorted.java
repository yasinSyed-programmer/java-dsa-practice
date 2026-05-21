import java.util.*;

public class IsSorted {
    public static boolean isSorted(int[] arr , int i ,int n){
        if(i == n){
            return true;
        }
        if(arr[i] > arr[i-1]){
            if (isSorted(arr , i+1 , n))
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entr the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in the array ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        //function call return-type(boolean)
        if(isSorted(arr , 1 , n))
            System.out.println("array is sorted");
        else
            System.out.println("array is not sorted");
        sc.close();
    }
}
