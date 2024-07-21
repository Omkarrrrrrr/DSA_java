import java.util.Scanner;

public class SearchingPract {

  // --------------------------------------------------------------------------------------------------------------------------------------------------------------
  // q2) FD
  // //Function defining
  // public static int findLastOccurence(int []arr, int target){
  // int low = 0,high = arr.length-1;
  // int result = -1; //initially, indicating the target hasn't been found yet.

  // while(low<=high){
  // int mid = low + (high-low)/2;
  // if(arr[mid]==target){
  // result = mid;
  // //Traverse to the left side of array
  // low = mid + 1; // Main diff bw first and last occurence code
  // }
  // else if(arr[mid]> target){
  // high = mid -1;
  // }
  // else{
  // low = mid+1;
  // }
  // }
  // return result;
  // }
  // -----------------------------------------------------------------------------------------------------------------------------------------------------------

  // q3) fd

  // public static int numberOf1s(int [] arr, int n){
  // int low = 0,high = arr.length-1;
  // while(low <= high){
  // int mid = low + (high - low)/2;

  // if(arr[mid] == 0){
  // low = mid + 1;
  // }
  // else { // key diff is here we dont need to use else if condition
  // high = mid - 1;
  // }
  // }
  // return (n - low); // size of array - low
  // }

  // --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  // q4) FD

  // public static int lastOccurence(int [] arr, int target){
  // int low = 0, high = arr.length-1;
  // int result = -1;

  // while(low<=high){
  // int mid = low + (high-low)/2;

  // if(arr[mid]==target){
  // result = mid;
  // low = mid+1;
  // }
  // else if(arr[mid] > target){
  // high = mid-1;
  // }
  // else low = mid +1; //Move to right to find last occurence

  // }

  // return result;
  // }

  // public static int firstOccurence(int[]arr, int target){
  // int low =0,high = arr.length-1;
  // int result = -1;

  // while(low<=high){
  // int mid = low + (high-low)/2;

  // if(arr[mid]==target){
  // result = mid;
  // high = mid -1; // Move to the left half to find the first occurrence
  // }
  // else if(arr[mid]> target){
  // high = mid -1;
  // }
  // else{
  // low = mid +1;
  // }
  // }

  // return result;
  // }

  // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  // q5) FD

 
  public static boolean isPerfectSquare(int num) {
    if(num == 1) return true ;  // edge case

    long start = 0 ;   // Take Long as the inputs have large value
    
    long end = num /2 ;
     while(start <= end ){
         long mid = start + ( end - start ) / 2 ;
         if (mid * mid > num)   end = mid - 1 ; // Mid is greater than the squareroot of the number
         else if (mid * mid < num) start = mid + 1 ;  // Mid is less than our required number
         else  return true;     // we found our squareroot number
         }
     return false ;
 }

  public static void main(String[] args) {

    // --------------------------------------------------------------------------------------------------------------------------------------------------------
    /*
     * Q1. Given an array. Find the number X in the array. If the element is
     * present, return the index of the element,else print “Element not found in
     * array”.Input the size of array,
     * array from user and the element X from user. Use Linear Search to find the
     * element.
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no of elements in array: ");
    // int n = sc.nextInt();

    // System.out.println("Enter the no of elements of the array: ");
    // int [] arr = new int[n];
    // for(int i=0; i<n; i++){
    // arr[i] = sc.nextInt();
    // }

    // System.out.println("The target element is: ");
    // int x = sc.nextInt();

    // //Implementation of linear search
    // int index = -1;
    // for(int i=0;i<n; i++){
    // if(arr[i]== x){
    // index = i;
    // break;
    // };

    // }

    // if(index ==-1){
    // System.out.println("Element not found in array");
    // }
    // else{
    // System.out.println("The target element found is at location: " +index);
    // }

    /*
     * //---------------------------------------------------------------------------
     * -----------------------------------------------------------------------------
     * -------------
     * 
     * 
     * Q2. Given an array and an integer “target”, return the last occurrence of
     * “target” in the array. If the target is not present return -1.
     * Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4 Output 1: 6
     * Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15 Output 2: -1
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no of elements in an array :");
    // int n = sc.nextInt();

    // int arr[] = new int[n];

    // System.out.println("Enter the array elements");
    // for(int i=0;i<n;i++)
    // {
    // arr[i] = sc.nextInt();

    // }

    // System.out.println("Enter the target element:");
    // int target = sc.nextInt();

    // System.out.println("The last occurence of target is at index: " +
    // findLastOccurence(arr,target) );

    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*
     * Q3. Given a sorted binary array, efficiently count the total number of 1’s in
     * it.
     * Input 1: arr = [^ ^ ^ ^ 1 1 1 1 1 1] Output 1: 6
     * Input 2: arr = [ ^ ^ ^ ^ ^ 1 1]
     * Output 2: 2
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number of elements you want to add: ");
    // int n = sc.nextInt();

    // int[] arr = new int[n];

    // System.out.print("Enter the elements of the array: ");
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }

    // System.out.println("The number of one's in the given array is/are: " +
    // numberOf1s(arr,n));
    // }

    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /*
     * Q4. Given a sorted integer array containing duplicates, count occurrences of
     * a given number. If the element is
     * not found in the array, report that as well.
     * Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9] target = 5
     * Output: Target 5 occurs 3 times
     * Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9] target = 6
     * Output: Target 6 occurs 2 times
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no of elememts present in array: ");
    // int n = sc.nextInt();

    // int arr[] = new int [n];

    // System.out.println("Enter the elements of array: ");
    // for(int i=0;i<n;i++)
    // {
    // arr[i] = sc.nextInt();
    // }

    // System.out.println("Enter the target element: ");
    // int target = sc.nextInt();

    // int first = firstOccurence(arr,target);
    // int last = lastOccurence(arr,target);

    // if(first==last && first ==-1){
    // System.out.println("the target does not exist in array");
    // }
    // else{
    // System.out.println("The frequency of target in given array is " +
    // (last-first+1) + " times");
    // }

    // ---------------------------------------------------------------------------------------------------------------------------------------------

/* Q5. Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of another integer. In other words, it is the product of some integer with itself.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4×4=16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742×3.742=14 and 3.742 is not an integer.*/


  Scanner sc =  new Scanner(System.in);
  System.out.println("Enter the no of which you want square root: ");
  int num = sc.nextInt();

  System.out.println("The given number is a perfect square: " + isPerfectSquare(num));



  }
}



