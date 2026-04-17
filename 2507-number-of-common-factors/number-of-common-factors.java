class Solution {
    public int commonFactors(int a, int b) {
        int x=x(a ,b);
        int count =0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        return count;
    }
    private int x(int a, int b){
        while(b !=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
}