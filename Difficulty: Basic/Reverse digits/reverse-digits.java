class Solution {
    public int reverseDigits(int x) {
        // Code here
        int revOrder = 0;
        while(x != 0){
            int lastDigit = x % 10;

            if (revOrder > Integer.MAX_VALUE / 10 ||
                revOrder < Integer.MIN_VALUE / 10) {
                return 0;
            }

            revOrder = (revOrder * 10) + lastDigit;
            
            x = x / 10;
        }
        return revOrder;
    }
}