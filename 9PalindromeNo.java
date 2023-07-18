class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
		return false;
	
	int reverse = 0;
	int temp = x;
	while (temp != 0) {
		int reminder = temp % 10;
		temp /= 10;
		reverse = reverse * 10 + reminder;
	}
	if (x == reverse)
		return true;
	return false;
}
        
    }
