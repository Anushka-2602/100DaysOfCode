class Solution {
    public int findComplement(int num) {
        int c=0;
        c=(int)(Math.log(num)/Math.log(2));
        num=~num; 
        num =num & (int)((Math.pow(2,c))-1); 
        return(num);
    }
}
