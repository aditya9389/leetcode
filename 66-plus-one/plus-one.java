class Solution {
    public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
	    if (digits[i] < 9) {
		    digits[i]++;
		    return digits;
	    }
	    digits[i] = 0;
    }
    digits = new int[digits.length + 1];    //we will come accorss this in only 999 cases
    digits[0] = 1;
    return digits;
    }
}
//thought diff this one is copeied but understood