import java.util.*;
public class day4
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
        System.out.println("Enter the number of rotations");
        int d = scan1.nextInt();
        int n = arr.length;
        d = d % n; 
        
        int start = 0, end = d - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

       
        start = d;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

       
        start = 0;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0 ; i < arr.length ; i ++)
        {
            System.out.print(" "+arr[i]+" ");
        }
        
    }
}