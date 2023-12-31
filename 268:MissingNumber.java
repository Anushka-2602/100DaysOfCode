class Solution {
    public int missingNumber(int[] nums) {
        // declare hash set
        Set<Integer> hash = new HashSet<>();
        // iterate over nums
        for(int i = 0; i < nums.length; i++) {
            // store each num in hash set
            hash.add(nums[i]);
        }
        // iterate over hash
        for(int i = 0; i <= hash.size(); i++) {
            // check that current number are missing, if yes we return number
            if(!hash.contains(i)) return i;
        }
        // if all numbers are present, return -1Ha
        return -1;
    }
}
