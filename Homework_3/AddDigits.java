//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int returnValue = 0;
        while(num > 9){
            returnValue += num % 10;
            num /= 10;
        }
        return addDigits(returnValue + num);
    }
}
