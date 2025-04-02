import java.util.*;
public class day3
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
        
        
        int right=arr.length-1;
        int left=0;
        
       while(right>left)
       
       {
           int temp = arr[right];
           arr[right]=arr[left];
           arr[left]=temp;
           right=right-1;
           left=left+1;
       }
    
        for (int i = 0 ; i < arr.length ; i ++)
        {
            System.out.print(" "+arr[i]+" ");
        }

    }
}