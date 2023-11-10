class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        String s1=a.toLowerCase();
        String s2=b.toLowerCase();
        int [] x=new int[26];
        int [] y=new int[26];
        for(int i=0;i<s1.length();i++){
            int ch1=s1.charAt(i);
            x[ch1-97]++;
        }
        for(int i=0;i<s2.length();i++){
            int ch2=s2.charAt(i);
            y[ch2-97]++;
        }
        boolean ans=Arrays.equals(x,y);
        return ans;
        
    }
}
