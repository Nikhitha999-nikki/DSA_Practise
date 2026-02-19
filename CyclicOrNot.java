public class CyclicOrNot{
    public void isCyclic(int[][] graph,int n)
    {
        boolean[] visited=new boolean[n];
        System.out.println("");
        for(int start=0;start<n;start++){
            if(!visited[start]){
                if(dfs(graph,visited,start,-1)){
                    System.out.println("Graph is cyclic");
                    return;
                }
            }
        }
    }
    public boolean dfs(int[][] graph,boolean[] visited,int node,int parent){
        visited[node]=true;
        for(int neighbor:graph[node]){
            if(!visited[neighbor]){
                if(dfs(graph,visited,neighbor,node)){
                    return true;
                }
            }else if(neighbor!=parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] graph={{1,2},{0,3},{0,3},{1,2}};
        CyclicOrNot obj=new CyclicOrNot();
        obj.isCyclic(graph,4);
    }
}