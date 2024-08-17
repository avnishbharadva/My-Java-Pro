package MyPac;

import java.util.Scanner;

public class Demo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("ENter Age : ");
        int age = sc.nextInt();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

        int[] arr = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.print("ENter val : ");
            arr[i] = sc.nextInt();
        }
        for(int i:arr)
        {
            System.out.println("Val : " + i);
        }
    }    
}
