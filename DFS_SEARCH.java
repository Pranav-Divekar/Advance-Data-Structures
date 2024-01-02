import java.util.*;
class DFS_SEARCH
{
    int size=4;
    int[][] A = new int[size][size]
    boolean[] visited = new boolean[size];
    public static void dfs(int v,boolean visited[])
    {
        Stack<int> stack = new stack<>();
        visited[v] = true;
        System.ou.println(v+", ");
        stack.push(v);
        while(!stack.isEmpty())
        {
            v = stack.pop();
            List<int> n = adj[v];
            for (int i : n)
            {
                visited[i] = true;
                System.out.println(i+", ");
                stack.push(i);
            }
        }

        for(int i=0;i<size;i++)
        {
            if(A[v][i]==1 && !visited[i])
            {
                dfs(i);
            }
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(Sy);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;i++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int startNode = 3; 
        System.out.print("Depth First Traversal");
        dfs(startNode);
    }

}