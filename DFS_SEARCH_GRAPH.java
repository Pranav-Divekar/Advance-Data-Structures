import java.util.*;

public class DFS_SEARCH_GRAPH {
    public static void dfs(int vertex,int[][] graph,boolean visited[])
    {
    visited[vertex] = true;
    System.out.print(vertex+",");
    for(int i = 1;i<visited.length;i++)
    {
        if(graph[vertex][i]==1 && !visited[i])
        {
            dfs(i,graph,visited);
        }
    }
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of vertices : ");
    int size = sc.nextInt();
    int[][] graph = new int[size+1][size+1];
    boolean visited[] = new boolean[size + 1];
    for(int i=1;i<=size;i++)
    {
        for(int j=1;j<=size;j++)
        {
            graph[i][j]=sc.nextInt();
        }
    }
    System.out.println("DFS Traversal : ");
    for(int i=1;i<=size;i++)
    {
        if(!visited[i])
        {
            dfs(i,graph,visited);
        }
    }
    sc.close();
     
    }
}
