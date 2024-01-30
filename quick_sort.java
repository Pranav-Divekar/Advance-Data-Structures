import java.util.*;
public class quick_sort
{
    public static int partition(int[] a,int l,int h)
    {
        System.out.println("Before sort : ");
        int pivot = a[l];
        int i=l+1;
        int j=h;
        while(i<=j)
        {
            while(i<=j && a[i]<=pivot) i++;

           
            while(i<=j && a[j]>pivot) j--;

            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
                int temp=a[l];
                a[l]=a[j];
                a[j]=temp;

                return j;
    }

    public static void display(int[] a)
    {   for(int i : a)
        {
            System.out.println(i);
        }
    }

    public static void quicksort(int[] a,int l,int h)
    {
        if(l<h)
        {
            int k =partition(a,l,h);
            quicksort(a,l,k-1);
            quicksort(a,k+1,h);
        }
    }
    public static void main(String args[])
    {   int n=5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Entervalues inside array : ");
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Before sort : ");
        display(arr);
        quicksort(arr,0,n-1);
        System.out.println("\nSorted Array is:");
        display(arr);
    
    }
}