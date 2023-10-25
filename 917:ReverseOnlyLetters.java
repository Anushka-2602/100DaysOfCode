class Solution {
    public String reverseOnlyLetters(String s) {
        // declare left pointer and set it to start of the string
        int left = 0;
        // declare right pointer and set it to end of the string
        int right = s.length() - 1;
        // declare StringBuilder and pass initial string into it, so we could use setCharAt() method to place chars at appropriate indicies
        StringBuilder reversed = new StringBuilder(s);
        // iterate in while loop until pointers are not meet in middle of our string
        while(left < right) {
            // get left char from word
            char lword = reversed.charAt(left);
            // get right char from word
            char rword = reversed.charAt(right);
            // check that left char is not letter
            if(!Character.isLetter(lword)) {
                // if left char is not letter then just increment left pointer
                left++;
            // check that right char is not letter
            } else if(!Character.isLetter(rword)) {
                // if right char is not letter then just decrement left pointer
                right--;
            // if both left and right char are letters then:
            } else {
                // reverse position for right char
                reversed.setCharAt(left, rword);
                // reverse position for left char
                reversed.setCharAt(right, lword);
                // increment left pointer
                left++;
                // decrement right pointer
                right--;
            }
        }
        // return string by calling toString() on StringBuilder
        return reversed.toString();
    }
}
