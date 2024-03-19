import java.util.*;
class dijkstras
{
   
    public static void dijkstras_algo(int[] d,int[][] w,boolean[] visited,int n)
    {
        int k=0,u=0,min;
        while(k<n)
        {   min=999;
            for(int i=0;i<n;i++)
            {
                if(d[i]<min && !visited[i])
                {
                    min=d[i];
                    u=i;
                }
            }
            visited[u]=true;
            for(int v=0;v<n;v++)
            {
                if(w[u][v]!=999)
                {
                    if((d[u]+w[u][v])<d[v])
                    {
                        d[v] = d[u]+w[u][v];
                    }
                }
            }
            k++;

        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Cost of "+i+"is :"+d[i]+" ");
        }
    }

    public static void main(String args[])
    {    int n = 5;
    int[] d = new int[n];
    int[][] w = new int[n][n];
    boolean[] visited = new boolean[n];
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the weight matrix where unreachable and cost of same vertes is 999 ");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            w[i][j] = sc.nextInt();
        }
    }
    d[0]=0;
    for(int i=1;i<n;i++)
    {
        d[i] = 999;
    }

    dijkstras_algo(d,w,visited,n);

    }

}