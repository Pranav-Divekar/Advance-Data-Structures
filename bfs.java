import java.util.*;
class bfs
{
    public static void bfs_search(int v, boolean[] visited,int[][] A ) 
    {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);
        
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+", ");
            for (int i=0; i<A.length; i++)
             {
            if (!visited[i] && A[v][i] ==1)   
            {
               q.add(i);
               visited[i] = true;
            }
        }
        }
        
}
    public static void main(String args[])
    {   int size=4;
        boolean[] visited = new boolean[size];
        Arrays.fill(visited,false);
        int[][] A = new int[size][size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {   A[i][j]= sc.nextInt();
            }
        }
        System.out.println("BFS of graph is : ");
        bfs_search(0,visited,A);

        
    }
}