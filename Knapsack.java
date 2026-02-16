//T.C :O(n)
//S.C :O(n^2)
import java.util.*;
public class Knapsack{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int W= sc.nextInt();
        int[] weights={0,3,2,5,4,1};
        int[] profits={0,45,20,30,50,25};
        int n=sc.nextInt();
        int[][] dp=new int[n+1][W+1];
        for(int i=1;i<=n;i++){
            for(int w=0;w<=W;w++){
                if(weights[i]<=w){ //capacity is greater than or equal to the weight of the item, so we can include that item
                    dp[i][w]=Math.max(profits[i]+dp[i-1][w-weights[i]],dp[i-1][w]);  //explanation in notes
                }
                else{  //capacity is less than the weight of the item, so we can't include that item
                    dp[i][w]=dp[i-1][w];
                }
                
            }
        }
        sc.close();
        System.out.println(dp[n][W]);
        for(int i=n;i>0 && W>0;i--){
            if(dp[i][W]!=dp[i-1][W]){  //if the value is not same as the value of the previous item, then it means that the item is included in the knapsack
                System.out.print(i+" ");
                W=W-weights[i];  //we will reduce the capacity of the knapsack by the weight of the item included in the knapsack
            }
        }
    }
} 