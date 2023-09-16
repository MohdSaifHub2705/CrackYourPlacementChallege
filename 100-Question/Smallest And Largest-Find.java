
class Solution {
    public static void main(String[] args) {
      int[] arr = {23,4,5,2,78,35,867,934,54};
      int smallest = arr[0];
      int largest = arr[0];
      
      for(int i=0; i<arr.length; i++) {
          if(arr[i] > largest) {
              largest = arr[i];
          } else if(arr[i] < smallest) {
              smallest = arr[i];
          }
      }
      System.out.println("Smallest number is : " + smallest);
      System.out.println("Largest number is : " + largest);
    }
}
