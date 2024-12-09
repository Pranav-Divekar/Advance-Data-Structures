// // // import java.util.*;
// // // import java.io.*;

// // // public class Main {
    

// // //     public static void main (String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         ArrayList<Integer> arr = new ArrayList<Integer>();
        
// // //         while(sc.hasNextInt()) {
// // //             int num = sc.nextInt();
// // //             if (num < 0) 
// // //                 break;
// // //             arr.add(num);
// // //         }
// // //         int res = processArray(arr);
// // //         System.out.println(res);
// // //     }

// // //     public static int processArray(ArrayList<Integer> array) {
// // //         int l = 0;
// // //         for (int i = 0; i < array.size(); i++) {
// // //             if (array.get(i) % 2 != 0) {
// // //                 l = array.get(i);
// // //             }
// // //         }
// // //         return l;
// // //     }
// // // }


// // import java.util.*;
// // import java.io.*;

// // public class Main {
// //     public static int processArray(ArrayList<Integer> array) {
// //         int i = 0;
        
// //         while (i < array.size()) {
// //             if (array.get(i) % 2 != 0) {
// //                 int start = i;
// //                 int count = 0;
// //                 while (i < array.size() && array.get(i) % 2 != 0) {
// //                     count++;
// //                     i++;
// //                 }
// //                 if (count > 1) {
// //                     // Replace the sequence with its length
// //                     array.set(start, count);
// //                     // Remove the rest of the sequence
// //                     for (int j = start + 1; j < start + count; j++) {
// //                         array.remove(start + 1);
// //                     }
// //                 } else {
// //                     i++;
// //                 }
// //             } else {
// //                 i++;
// //             }
// //         }
// //         return array.size();
// //     }
// //     public static void main (String[] args) {
// //         ArrayList<Integer> arrayList = new ArrayList<Integer>();
// //         Scanner in = new Scanner(System.in);
// //         while(in.hasNextInt()) {
// //             int num = in.nextInt();
// //             if (num < 0) 
// //                 break;
// //             arrayList.add(num);
// //         }
// //         int new_length = processArray(arrayList);
// //         for(int i=0; i<new_length; i++)
// //             System.out.println(arrayList.get(i));
// //     }
// // }


import java.util.*;
import java.io.*;

public class Main {
    public static int processArray(ArrayList<Integer> a) {
        int x = 0;
        int y = 0;
        int z = 0;
        
        while (x < a.size()) {
            if (a.get(x) % 2 != 0) {
                y = x;
                z = 0;
                while (x < a.size() && a.get(x) % 2 != 0) {
                    z++;
                    x++;
                }
                if (z > 1) {
                    a.set(y, z);
                    int m = y + 1;
                    while (z > 1) {
                        a.remove(m);
                        z--;
                    }
                    x = y + 1; 
                }
            } else {
                x++;
            }
        }
        return a.size();
    }
    public static void main (String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int n = s.nextInt();
            if (n < 0) 
                break;
            l.add(n);
        }
        int len = processArray(l);
        for(int i=0; i<len; i++)
            System.out.println(l.get(i));
    }
}


// import java.util.*;
// import java.io.*;

// public class Main {
//     public static int processArray(ArrayList<Integer> z) {
//         ListIterator<Integer> iter = z.listIterator();
        
//         while (iter.hasNext()) {
//             int count = 0;
//             if (iter.next() % 2 != 0) {
//                 iter.previous(); 
//                 int startIdx = iter.nextIndex(); 
                
//                 while (iter.hasNext() && iter.next() % 2 != 0) {
//                     count++;
//                 }
                
//                 if (count > 1) {
                   
//                     z.set(startIdx, count + 1); 
                  
//                     for (int j = 0; j < count; j++) {
//                         iter.previous(); 
//                         iter.remove();
//                     }
//                 }
              
//                 iter = z.listIterator(startIdx + 1);
//             }
//         }
//         return z.size();
//     }

//     public static void main (String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         Scanner scanner = new Scanner(System.in);
//         while(scanner.hasNextInt()) {
//             int num = scanner.nextInt();
//             if (num < 0) 
//                 break;
//             list.add(num);
//         }
//         int newLength = processArray(list);
//         for(int i = 0; i < newLength; i++)
//             System.out.println(list.get(i));
//     }
// }
