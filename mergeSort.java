class mergeSort{
    public static void merge(int[] arr,int l,int m,int r){
        int i=l;
        int j=m+1;
        int k=0;
        int[] temp=new int[r-l+1];
        while(i<=m && j<=r){
            if(arr[i]<arr[j]) temp[k++]=arr[i++];
            else temp[k++]=arr[j++];
        }
        while(i<=m) temp[k++]=arr[i++];
        while(j<=r) temp[k++]=arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);
    }
    public static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,7,8};
        mergesort(arr,0,arr.length-1);
        for(int i:arr) System.out.print(i+" ");
    }
    
}