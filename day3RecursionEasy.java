public class day3RecursionEasy {
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sumInArray(new int[]{1,2,3,4,5}, 4));
        System.out.println(sumOfOdd(new int[]{1,2,3,4,5}, 4));
        System.out.println(sumOfEven(new int[]{1,2,3,4,5},0, 4));
        System.out.println(powerOfTwo(5));
        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
    }
    // sum of first n numbers
    private static int sum(int n){
        if(n==0 || n==1){return n;}
        return n+sum(n-1);
    }
    //sum of all number is an array
    private static int sumInArray(int[] arr, int n){
        if(n==0){return arr[n];}
        return arr[n]+sumInArray(arr, n-1);
    }
    //  sum of all odd numbers in an array
    private static int sumOfOdd(int[] arr, int n){
        if(n==0){return arr[n];}
        return arr[n]+sumOfOdd(arr, n-2);
    }
     //  sum of all even numbers in an array
     private static int sumOfEven(int[] arr, int i, int n){
         if (i > n) return 0;
        int sum = (arr[i] % 2 == 0) ? arr[i] : 0;
        return sum + sumOfEven(arr, i + 1, n);
     }
    //  power of two
    private static int powerOfTwo(int n){
        if(n==0){return 1;}
        return 2*powerOfTwo(n-1);
    }
    // factorial of a number
    private static int factorial(int n){
        if(n<=0){return 1;}
        return n*factorial(n-1);
    }
    // fibonacci series
    private static int fibonacci(int n){
        if(n==0 || n==1){return n;}
        return fibonacci(n-1)+fibonacci(n-2);
    }
        
}
