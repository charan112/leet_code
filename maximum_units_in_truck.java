import java.util.Arrays;
class Main {
    public static void main(String args[]) {
        int a[][]={{1,3},{2,2},{3,1}};
        int res=mt(a,4);
        System.out.println(res);
        
    }
    static int mt(int[][] bt,int ts) {
        Arrays.sort(bt,(a,b)->Integer.compare(a[1],b[1]));
        int ans=0;
        for(int i=bt.length-1;i>=0;i--) {
            if(ts==0)
            return ans;
            if(bt[i][0]<=ts){
                ans+=bt[i][0]*bt[i][1];
                ts-=bt[i][0];
            }
            else {
                ans+=ts*bt[i][1];
                ts=0;
            }
        }
        return ans;
    }
}
