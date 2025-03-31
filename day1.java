import java.util.*;
public class day1 {
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the number of elements to enter in the array: ");
        int x = scan1.nextInt();
        int [] arr = new int [x];
        System.out.println("Enter the elements below: ");
        for (int i = 0 ; i < x ; i ++)
        {
            arr [i]=scan1.nextInt();
        }
        int a = arr.length;
        if (a<2)
        {
            System.out.println("-1");
            return ;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i =0 ; i <a ; i ++)
        {
            if (arr[i]>first)
            {
               second = first; 
               first = arr[i];
            }
            else if (arr[i]>second && arr[i]!=first )
            {
                second=arr[i];
            }
        }
        if (second==Integer.MIN_VALUE)
        {
            System.out.println("-1");

        } 
        else 
        {
            System.out.print("Second Largest element is ");
            System.out.println(second);
        } 
        
        
        
    }
    
}
