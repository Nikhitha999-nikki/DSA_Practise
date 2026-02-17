public class UnionFind {
    private int[] parent;
    public UnionFind(int n){
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int x)
    {
        if(parent[x]!=x) x=parent[x];
        return x;
    }
    public void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        if(rootX!=rootY) parent[rootY]=rootX;
    }
    public void printParents()
    {
        for(int i=0;i<parent.length;i++){
            System.out.println(i+"->"+parent[i]);
        }
    }
    public static void main(String[] args){
        UnionFind uf=new UnionFind(8);
        uf.union(0,1);
        uf.union(2,3);
        uf.union(0,2);
        uf.union(4,5);
        uf.union(6,7);
        uf.union(4,6);
        uf.union(0,4);
        uf.printParents();
        System.out.println(uf.find(4));
    }
    
}
