import java.util.ArrayList;

public class BFSEx{
    public void bfs(int[][] matrix, int start,int nodes) {
        boolean[] visited = new boolean[matrix.length];
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.remove(0);
            System.out.print(current + " ");
            
            for (int i = 0; i < matrix[current].length; i++) {
                if (matrix[current][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{0,1,0},
                        {0,0,1},
                        {1,0,0}};
        BFSEx bfsEx = new BFSEx();
        bfsEx.bfs(matrix, 0, matrix.length);
    }
}