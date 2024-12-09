// class Armstrong {
//     public static boolean check_armstrong(int n)
//     {
//         int num=n;
//         int sum=0;
//         int noOfdigits = String.valueOf(n).length();
//         while(num>0)
//         {
//             int digit=num%10;
//             sum += Math.pow(digit,noOfdigits);
//             num = num/10;
//         }
//         if(sum==n) 
//         {return true;}
//         else{return false;}
//     }

//     public static void bubbleSort(int arr[], int n)
//     {
//         //code here
//         for(int j=0;j<n-1;j++)
//         {
//         for(int i=0;i<n-1-j;i++)
//         {
//             if(arr[i]>arr[i+1])
//             {
//                 int temp = arr[i];
//                 arr[i]=arr[i+1];
//                 arr[i+1]=temp;
//             }
//         }
//         }
        
        
//         // for(int i:arr)
//         // {
//         //     System.out.print(i+" ");
//         // }
        
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }

//     static int  select(int arr[], int i)
// 	{   int min=i;
//         // code here such that selectionSort() sorts arr[]
//         for(int j=i;j<arr.length;j++)
//         {
//             if(arr[j]<arr[min])
//             {
//                 min=j;
//             }
//         }
//         return min;
// 	}
	
// 	static void selectionSort(int arr[], int n)
// 	{
// 	    //code here
// 	    for(int i=0;i<n;i++)
// 	    {
// 	        int minIndx = select(arr,i);
	        
// 	        int temp = arr[i];
// 	        arr[i]=arr[minIndx];
// 	        arr[minIndx]=temp;
	        
// 	    }
	    
// 	    for(int i:arr)
// 	    {
// 	        System.out.print(i+" ");
// 	    }
// 	}

//     public static void main(String args[])
//     {
//         int arr1[] = {5,4,9,2,1};
//         //bubbleSort(arr,5);

//         selectionSort(arr1,5);
//         System.out.println(check_armstrong(153 ));
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

public class LastOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Read integers until a negative number is encountered
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            numbers.add(number);
        }
        

        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            array[i] = numbers.get(i);
        }
        
        // Find the last odd number
        int lastOdd = 0;
        boolean foundOdd = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                lastOdd = array[i];
                foundOdd = true;
            }
        }
        
        // Print the result
        System.out.println(foundOdd ? lastOdd : 0);
    }
}
