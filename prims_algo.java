import java.util.*;
public class prims_algo
{
   public static class Edge
    {
        int src;
        int des;
        int wt;
        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.des=d;
            this.wt =w;
        }
    }
        static void creategraph(ArrayList<Edge> graph[])
        {
            for(int i=0;i<graph.length;i++)
            {
                graph[i]=new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1, 10)); 
            graph[0].add(new Edge( 0,  2,  15)); 
            graph[0].add(new Edge( 0,  3,  30));

            graph [1].add (new Edge( 1,  0,  10)); 
            graph [1].add (new Edge( 1,  3,  40));

            graph [2].add (new Edge( 2,  0,  15)); 
            graph [2].add (new Edge( 2,  3,  50));

            graph [2].add (new Edge( 3,  1,  40)); 
            graph [2].add (new Edge( 3,  2,  50));
        }


        static class Pair implements Comparable<Pair>
        {
            int v;
            int cost;
            public Pair(int c,int v)
            {
                this.v=v;
                this.cost=c;
            }

            @Override
            public int compareTo(Pair p2)
            {
                return this.cost-p2.cost; //for internal sorting in priority queue
            }
        }


        public static void prims(ArrayList<Edge> graph[])
        {
            boolean visited[] = new boolean[graph.length];
            PriorityQueue<Pair> p = new PriorityQueue<>();
            p.add(new Pair(0,0));
            int finalcost = 0; // maintain this or create arraylist for edges that will be in mst

            while(!p.isEmpty())
            {
                Pair cur = p.remove();
                if(!visited[cur.v])
                {
                    visited[cur.v]=true;
                    finalcost += cur.cost;
                    //for adding corresponding edges 
                    for(int i=0;i<graph[cur.v].size();i++)
                    {   Edge e = graph[cur.v].get(i);
                        //for adding only edges to unvisited vertices
                        if (!visited[e.des]) {
                            p.add(new Pair(e.wt, e.des));
                        }
                    }
                }

            }
            System.out.println(finalcost);
        }


    public static void main(String args[])
    {
        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);

        prims(graph);
    }
    
    
}