import java.util.*;
public class day2
 {
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
        
        int count=0;
        for (int i =0 ; i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for (int i = 0 ; i < arr.length ; i ++)
        {
            System.out.print("Result Elements are "+arr[i]+" ");
        }

    }
}