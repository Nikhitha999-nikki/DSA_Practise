class strassens{
    public static void main(String[] args){
        int[][] A={{2,1},{1,2}};
        int[][] B={{1,2},{2,1}};
        int[][] C=new int[2][2];
        for(int i=0;i<2;i++){
            System.out.println();
            for(int j=0;j<2;j++){
                System.out.print(A[i][j]+" ");
            }
        }
        for(int i=0;i<2;i++){
            System.out.println();
            for(int j=0;j<2;j++){
                System.out.print(B[i][j]+" ");
            }
        }
        int m1=(A[0][0]+A[1][1])*(B[0][0]+B[1][1]);
        int m2=(A[1][0]+A[1][1])*B[0][0];
        int m3=A[0][0]*(B[0][1]-B[1][1]);
        int m4=A[1][1]*(B[1][0]-B[0][0]);
        int m5=(A[0][0]+A[0][1])*B[1][1];
        int m6=(A[1][0]-A[0][0])*(B[0][0]+B[0][1]);
        int m7=(A[0][1]-A[1][1])*(B[1][0]+B[1][1]);
        C[0][0]=m1+m4-m5+m7;
        C[0][1]=m3+m5;
        C[1][0]=m2+m4;
        C[1][1]=m1-m2+m3+m6;
        for(int i=0;i<2;i++){
            System.out.println();
            for(int j=0;j<2;j++){
                System.out.print(C[i][j]+" ");
            }
            
        }

    }
}