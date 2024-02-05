import java.util.*;

public class BFS_SEARCH {
    public static void bfs(int startVertex, int[][] graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.offer(startVertex);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + ",");
            for (int i = 1; i < visited.length; i++) {
                if (graph[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices : ");
        int size = sc.nextInt();
        int[][] graph = new int[size + 1][size + 1];
        boolean[] visited = new boolean[size + 1];
        System.out.println("Enter the adjacency matrix : ");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        System.out.println("BFS Traversal : ");
        for (int i = 1; i <= size; i++) {
            if (!visited[i]) {
                bfs(i, graph, visited);
            }
        }
        sc.close();
    }
}
