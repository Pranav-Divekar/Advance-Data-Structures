import java.util.Scanner;
public class merge_sort 
{
    public static void merge(int arr[], int l, int mid, int u) 
    {
        int i, j, k;
        int n1 = mid - l + 1;
        int n2 = u - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++) 
        {
            L[i] = arr[l + i];
        }

        for (j = 0; j < n2; j++) 
        {
            R[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            } 
            else 
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int l, int u) 
    {
        if (l < u) 
        {
            int mid = (l + u) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, u);
            merge(arr, l, mid, u);
        }
    }

    public static void printArray(int a[]) 
    {
        int size = a.length;
        for (int i = 0; i < size; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many element do you want to sorts ?");
        int n=sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of Array :");
        for(int i=0; i<n; i++)
        {
            int x=sc.nextInt();
            arr[i]=x;
        }
        int size = arr.length;
        int l = 0;
        int u = size - 1;

        System.out.println("\nGiven Array :");
        printArray(arr);

        mergeSort(arr, l, u);

        System.out.println("\nSorted Array :");
        printArray(arr);

        sc.close();
    }
}