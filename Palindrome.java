package leetcode;

public class Palindrome {
	public static boolean isPalindrome(int x) {
        int temp = x;
        int rev=0;
        if(x<0)
        return false;
        while(x!=0)
        {
            int rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        return temp==rev;
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

}
