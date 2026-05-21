package reincarnation_of_java;

import java.util.*;

public class reincarnation_with_deadly_addition_of_complex_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the real value of first complex number : ");
        int ar = sc.nextInt();
        System.out.print("enter the imaginary value of first complex number : ");
        int ai = sc.nextInt();
        System.out.print("enter the real value of second complex number : ");
        int br = sc.nextInt();
        System.out.print("enter the imaginary value of second complex number : ");
        int bi = sc.nextInt();
        int cr = ar+br, ci = ai+bi ;
        System.out.print("the addition of these two complex numbers is "+cr+" +i"+ci);
        sc.close();
    }

}