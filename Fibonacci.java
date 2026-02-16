// class Fibonacci{
//     public static int fibonacci(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         int n1=0,n2=1,n3;
//         for(int i=0;i<n;i++){       //T.C : O(n)  S.C : O(1)
//             n3=n1+n2;
//             n1=n2;
//             n2=n3;

//         }
//         return n1;
//     }
//     public static void main(String[] args)
//     {
//         int n=10;
//         for(int i=0;i<=n;i++) System.out.println("\n"+fibonacci(i));
    
//     }
    
// }
class Fibonacci{
    
    public static void main(String[] args)
    {
        int n=10;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];   //T.C : O(n)  S.C : O(n)
            System.out.println("\n"+dp[i]);
        }
        
    
    }
    
}
//GOOD SPACE:TABULATION APPROACH
//GOOD+FAST: RECURSIVE
