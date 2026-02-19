import java.util.ArrayList;

public class Graph{
    public static void main(String[] args) {
        int[][] matrix={{0,1,0},{0,0,1},{1,0,0}};
        int n=matrix.length;
    ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        graph.add(new ArrayList<>());
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(matrix[i][j]==1)
            {
                graph.get(i).add(j);
            }
        }

    }
    for(int i=0;i<n;i++)
    {
        System.out.print(i+"->"+graph.get(i));
        for(int node:graph.get(i))
        {
            System.out.print(node+" ");
        }
        System.out.println();
    }
    
    }
}   