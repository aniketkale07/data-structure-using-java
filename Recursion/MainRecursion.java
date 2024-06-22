// Recursive Method: O(2^n) time complexity due to the exponential growth of function calls.
// Iterative Method: O(n) time complexity due to the linear iteration through the loop.

package Recursion;

public class MainRecursion {
    public static void main(String[] args) {
        int n=12;
System.out.println(fibonacci(n));
System.out.println(fibonacci_single_loop(n));
    }

    private static int fibonacci(int count) {
        if (count <= 0) {
            return 0;
        }
        if (count == 1) {
            return 1;
        }
        return fibonacci(count - 1) + fibonacci(count - 2);
    }
private static int fibonacci_single_loop(int n){
    int a=0;
    int b=1;
    for(int i=2;i<=n;i++){
        int next=a+b;
        a=b;
        b=next;
    }
    return b;
}
}
