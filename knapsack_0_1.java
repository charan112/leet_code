class Main {
    public void Sort(int[] arr,int lb,int ub) {
        if(lb<ub){
            int loc=partition(arr,lb,ub);
            Sort(arr,lb,loc-1);
            Sort(arr,loc+1,ub);
        }
    }
    public int partition(int[] a,int lb,int ub) {
        int pivot=lb;
        int start=lb;
        int end=ub;
        while(start<end) {
            while(a[start]<=a[pivot]) {
                start++;
            }
            while(a[end]>a[pivot]) {
                end--;
            }
            if(start<end) {
                int t=a[end];
                a[end]=a[start];
                a[start]=t;
            }
            
        }
        int t=a[end];
        a[end]=a[lb];
        a[lb]=t;
        return end;
        
    }
    public void printarray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.printf(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int arr[]={1,2,5,3,9,7,5,1,4};
        Main s=new Main();
        s.Sort(arr,0,arr.length-1);
        s.printarray(arr);
        
    }
}
