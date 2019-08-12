public class WayToDecodes {
    public int numDecodings(String A) {
        int len= A.length();
        int a[] = new int[len+1];
        if(A.charAt(0)=='0'){
            return 0;
        }
        a[0]=a[1]=1;
        for(int i=2;i<=len;i++){
            a[i] = 0;
            if(A.charAt(i-1)>'0'){
                a[i] = a[i-1];
            }
            if(A.charAt(i-2)=='1' || (A.charAt(i-2)=='2' && A.charAt(i-1)<='6')){
                a[i] += a[i-2];
            }
        }
        
        return a[len];
    }
}
