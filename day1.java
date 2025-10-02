// functions if-
import java.util.*;
public class day1{
    // 1-sum of two integers
    public static void main(String[] args) {
        System.out.println(add(5,3));
        System.out.println(toVote(18));
        System.out.println(square(5));
        System.out.println(evenOrOdd(5));
        System.out.println(printEven(new int[]{1,2,3,4,5}));
        System.out.println(countNegative(new int[]{-1,-2,-9,-6,1,2,3,4,5}));
        System.out.println(largestAndSmallest(new int[]{1,2,3,4,5})); //if i'll print the array of min and max like this shows its type and hashcode, not its contents.
        System.out.println(Arrays.toString(largestAndSmallest(new int[]{1,2,3,4,5})));//that's why you use this method
        System.out.println(secondlargest(new int[]{1,2,3,4,5}));
        System.out.println(countDigits(1234));
        System.out.println(pallindrome(12321));
    }
//here all the functions outside main are defined as static because main function is of static type and static members and methods can only access static member/variables
    private static int add(int a, int b){
    return a+b;
}

// 2-square of a number
private static int square(int a){
    return a^2;
}
// 3- check voting elegibility
 private static String toVote(int age){
    if(age>=18){return "vote";}
    else return "can't vote";
}
// 4-even or odd number
private static String evenOrOdd(int num){
    if(num%2==0){return "even";}
    else return "odd";
}


// LOOPS
// print all even numbers in an array
private  static int printEven(int[]arr){
    for(int i=0; i<arr.length; i++){ 
        if(arr[i]%2==0){ //here condition for a num. to be even if that is divided by 2 and the remainder is 0
            return arr[i];
        }
    }
    return 0;
}
// count negative numbers in an array
private static int[] countNegative(int[] arr){
    for(int i=0; i<arr.length; i++){
        if(arr[i]<0){System.out.println(arr[i]);}

    }
   return new int[0];
}
// find largest and smallest number in ana array
private  static int[] largestAndSmallest(int[] arr){
    int max=arr[0];
    int min=arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){max=arr[i];}
        if(arr[i]<min){min=arr[i];}
    }
    return new int[]{max,min};
}
// find secondlargest number in an array
private static int secondlargest(int[] arr){
    int max=arr[0];
    int secondmax=arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            secondmax=max; //which before moving to max first store the value of max and then update max
            max=arr[i];
        }
    }
    return secondmax;
}
// count digits in a number
private static int countDigits(int num){
    int count=0;
    while(num>0){
        num/=10;
        count++;
    }
    return count;
}
// pallindrome of a number= when a reverse of a number is equal to the original number exp:121, reverse=121
private static boolean pallindrome(int num){
    int rem, rev=0;
    while(num>0){
        rem=num%10;
        rev=rev*10+rem;
        num/=10;
    }
    return rev==num? true:false;
}

}
