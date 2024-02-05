import java.util.*;
public class MerjeSort {
    
    public static void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = 0; 
        int[] b = new int[ub - lb + 1]; 
    
        while (i <= mid && j <= ub) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ub) {
            b[k] = arr[j];
            j++;
            k++;
        }
        for (i = 0; i < k; i++) {
            arr[lb + i] = b[i];
        }
    }
    public static void sort_merge(int[] arr,int lb,int ub)
        {
            int mid = (lb+ub)/2;
            if(lb<ub)
            {
                sort_merge(arr, lb, mid);
                sort_merge(arr,mid+1,ub);
                merge(arr,lb,mid,ub);
            }

        }
        public static void main(String[] args)
        {   
            Scanner sc = new Scanner(System.in);
            int n, i;
        
            System.out.println("Enter the size of the array");
            n = sc.nextInt();
        
            int[] a = new int[n];
        
            System.out.println("Enter the elements of the array");
            for (i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.println("Sorted given array using Merge Sort");
            sort_merge(a, 0, n - 1);
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            sc.close();
        }
        
}
