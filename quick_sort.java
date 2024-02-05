import java.util.*;
class QuickSort
{    public static int[] a = new int[5];
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements : ");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        QuickSortArr(0,4);
        System.out.println("Sorted array now !!");
        for(int i=0;i<a.length;i++)
        {
             System.out.print(a[i]+" ");
        }
    }
    public static void QuickSortArr(int l,int h)
    {
        if(l<h)
        {
            int j = partition(l,h);
            QuickSortArr(l,j-1);
            QuickSortArr(j+1,h);
        }
    }
    public static int partition(int l, int h) {
        int pivot = a[l];
        int i = l + 1;  
        int j = h;
    
        while (i <= j) {
            while (i <= j && a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    
        int temp = a[j];
        a[j] = a[l];
        a[l] = temp;
    
        return j;
    }
    
}
