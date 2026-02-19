import java.util.*;
public class DFS{
    public void DFS(int[][] graph,int start,int n){
        boolean[] visited=new boolean[n];
        Stack<Integer> stack=new Stack<>();
        stack.push(start);
        if(stack.isEmpty()){
            return;
        }
        while(!stack.isEmpty()){
            int node=stack.pop();
            if(!visited[node]){
                visited[node]=true;
                System.out.println(node+"");
                for(int j=n-1;j>=0;j--){
                    if(graph[node][j]==1 && !visited[j]){
                        stack.push(j);
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] graph={
            {0,1,1,0,0},
            {1,0,0,1,0},
            {1,0,0,1,1},
            {0,1,1,0,1},
            {0,0,1,1,0}
        };
        int start=0;
        int n=graph.length;
        DFS dfs=new DFS();
        dfs.DFS(graph,start,n);
        
    }
}