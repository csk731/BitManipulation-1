// TC: O(log(n)^2)
// SC: O(1)

public class LC29 {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor) return 1;
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        boolean sign = true;
        if((dividend>=0 && divisor<0) || (dividend<0 && divisor>=0)) sign = false;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans = 0;
        while(n>=d){
            int cnt = 0;
            while(n>=(d<<cnt)){
                cnt++;
            }
            ans += (1<<(cnt-1));
            n -= (d<<(cnt-1));
        }
        return (int) ((sign) ? ans : -ans);
    }
}
