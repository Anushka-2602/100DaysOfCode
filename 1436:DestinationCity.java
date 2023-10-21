import java.util.*;
class Solution {
    public String destCity(List<List<String>> paths) {
        int n = paths.size();
        if(n==1){
            return paths.get(0).get(1);
        }
        Hashtable<String,Integer> ans = new Hashtable<>();
        for(int i=0;i<n;i++){
            String a = paths.get(i).get(0);
            String b = paths.get(i).get(1);
            ans.put(a,2);
            if(ans.get(b)!=null){
                ans.put(b,2);
            }else{
                ans.put(b,1);
            }
        }
        for(String key : ans.keySet()){
            if(ans.get(key)==1){
                return key;
            }
        }
        return "";
    }
}
	
