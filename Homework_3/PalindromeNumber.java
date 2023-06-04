//Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) return false;

        int reversedNumber = 0;
        int givenNumber = x;
        while(givenNumber > 9){
            reversedNumber += givenNumber % 10;
            givenNumber /= 10;
            reversedNumber *= 10;
        }
        reversedNumber += givenNumber % 10;
        return x == reversedNumber;
    }
}
