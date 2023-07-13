ANS 1
		import java.io.*;
import java.util.*;


public class Main
{   static int func(int n)
{
    if (n == 0)
    return 0;
    return (n % 10 + func(n / 10));
}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans = func(n);
		System.out.println(" Sum of digits in " + n
       + " is " + ans );
	}
}

ANS 2
		public class alternateSum {
    public static  int alter(int n){
        if (n==0){
            return 0;
        }
        else {
         if (n%2==0){
          return alter(n-1)-n;
         }
         else {
             return alter( n-1)+n;
         }
        }

    }
    public static void main(String[] args) {
        int n=5;
       int result= alter(n);
        System.out.println(result);
    }
}

	
ANS 3
		import java.io.*;
import java.util.*;
public class Main{
    public static int maxValue(int arr[], int n, int idx){
        if(idx == n - 1)
        return arr[n - 1];
        int maxOfLaterIndices = maxValue(arr, n,idx + 1);
        int maxVal = Math.max(arr[idx], maxOfLaterIndices);
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr={13,1,-3,22,5};
        int n=arr.length;
        System.out.println("The max value is : " + maxValue(arr,n,0));
    }
}

ANS 4

		
public class Main{
    public static int totalSum(int []arr , int idx){
        if(idx == 0)return arr[idx];

        int max= arr[idx] + totalSum(arr , idx - 1);
        return max;
    }
    public static void main(String[] args){
        int arr[] = {92,23, 15, -20, 10};
        int n = arr.length;

        int e=totalSum(arr , n - 1);
        System.out.println(e);
    }
}

ANS 5
		import java.util.*;
import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the number n: ");
                int n = scn.nextInt();
                int digits = 0;
                int temp = n;
                while(temp > 0){
                        digits++;
                        temp/=10;
                }
                if(n == isArmstrong(n , digits))
                        System.out.println("yes");
                else
                        System.out.println("no");
        }
        public static int power(int a, int b){
                if(b == 0)return 1;
                if(b%2 == 0)return power(a , b/2) * power(a , b/2);
                return a * power(a  , b/2) * power(a , b/2);
        }
        public static int isArmstrong(int n , int digits){
                if(n == 0)return 0;
                return power(n%10 , digits) + isArmstrong(n/10 , digits);
        }
}