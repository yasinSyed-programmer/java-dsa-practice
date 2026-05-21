package DSA_in_Java;

import java.util.*;

public class bubble_sort {
    public static void createarr(int[] arr , int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values in array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void printarr(int[] arr , int n){
        System.out.print("the array is ------------> ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        createarr(arr , n);
        System.out.println();
        //bubble sort
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarr(arr , n);
        sc.close();
    }
}
