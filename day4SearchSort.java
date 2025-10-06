import java.util.*;
public class day4SearchSort {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5,6,7,8}, 3));
        System.out.println(linearSearchRecursion(new int[]{1,2,3,4,5,6,7,8}, 0,5));
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8}, 5));
        System.out.println(binarySearchRecursion(new int[]{1,2,3,4,5,6,7,8}, 0, 8, 3));
        System.out.println(Arrays.toString(bubbleSort(new int[]{4,3,2,2,6,8,5,4,0})));
        System.out.println(Arrays.toString(insertionSort(new int[]{4,3,2,2,6,8,5,4,0})));
        System.out.println(Arrays.toString(selectionSort(new int[]{4,3,2,2,6,8,5,4,0})));
    }
    // linear search
    private static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    // using recursion
    private static int linearSearchRecursion(int[] arr, int i, int key){
        int n=arr.length;
        if(n==0|| i==n){return n;}
        if(arr[i]==key){return i;}
        return linearSearchRecursion(arr,i+1, key);
    }
    // binary search
    private static int binarySearch(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==key){return mid;}
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{low=mid+1;}
        }
        return 0;
    }
    // binary search using recursion
    private static int binarySearchRecursion(int[] arr, int low, int high, int key){
        if(low>high){return -1; }
        int mid=low+(high-low)/2;
        if(arr[mid]==key){return mid;}
        else if(arr[mid]>key){
            return binarySearchRecursion(arr, low, mid-1, key);
        }
        else{
            return binarySearchRecursion(arr, mid+1, high, key);
        }
    }
    // bubble sort
    private static int[] bubbleSort(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    // insertion sort
    private static int[] insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
    // selection sort
    private static int[] selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min=i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[min]){
                   int temp=arr[j];
                arr[j]=arr[min];
                arr[min]=temp; 
                }
            }
        }
        return arr;
    }
    // quick sort
    
}
