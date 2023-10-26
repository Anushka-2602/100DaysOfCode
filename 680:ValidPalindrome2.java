class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return isRestOfStringValid(s, left + 1, right) || isRestOfStringValid(s, left, right - 1);
            left++;
            right--;
        }
        return true;
    }
    public boolean isRestOfStringValid(String s, int left,int right) {
        String str = s.substring(left, right + 1);
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
//To determine if a string can be made into a palindrome by deleting at most one character,
//we can compare characters from both ends of the string. If there's a mismatch at some point, we have two options: either delete a character from the left side or from the right side and check if the resulting substring is a palindrome. If either of these options resultsin a palindrome, the original string can be made into a palindrome by deleting at most one character

//Initialize two pointers, left at the beginning of the string and right at the end.
//Iterate through the string, comparing characters at the left and right pointers.
//If s.charAt(left) is not equal to s.charAt(right), this means we have a mismatch. We should check if the string without either the left or right character is a palindrome.
//Create a helper function, isRestOfStringValid, to check if a substring of the string is a palindrome.
//This function takes the input string s, left and right indices, extracts the substring between those indices, and checks if it's equal to its reverse. If it is, it's a palindrome.
//In the main loop, we return true if we find a mismatch after checking both options for deletion. If we don't find any mismatches, we continue comparing characters until we've checked the entire string.
//If we've checked the entire string without finding more than one mismatch,we return true because the string can be made into a palindrome by deleting at most one character.
//If we haven't returned true by the end, it means the string cannot be made into a palindrome by deleting at most one character, so we return false.
