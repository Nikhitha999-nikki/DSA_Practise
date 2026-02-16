public class BinaryBackTrack{
    public static void main(String[] args)
    {
        System.out.println();
        backtrack("",3);

    }
    public static void backtrack(String str,int n){
        
        if(str.length()==n){
            System.out.println(str);
            return;
        }
        backtrack(str+"0",n);
        backtrack(str+"1",n);
    }
}
//rain water harvesting(prblm statement) : https://www.youtube.com/watch?v=ZI2z5pq0TqA&t=0s