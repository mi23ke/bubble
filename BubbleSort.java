/**
* A simple bubble sort application
* Author: Mike Urbano
**/
import java.util.Arrays;
import java.io.*;
public class BubbleSort{

  public static void main(String args[]){
    //declare input data
    int[] input1 = new int[]{ 5, 15, 1, 20, 15, 11, 8, 19 };
    int[] input2 = new int[]{ 14, 23, -2, 4, -10, 10, 15};
    int[] input3 = new int[]{ -3, -5, -1, -20, -4, -8, -2};
    //calling function on input data
    bubbleSort(input1);
    bubbleSort(input2);
    bubbleSort(input3);
  }
  public static void bubbleSort(int[] input){
    //print unsorted array
    System.out.println("Unsorted array: " + Arrays.toString(input));
    //implement bubble sort algorithm, moves largest element to end
    //of array during each iteration
    for( int i = 0; i < input.length - 1; i++ ){
      for( int j = 1; j < input.length - i; j++){
        if( input[j-1] > input[j]){
          int temp = input[j];
          input[j] = input[j-1];
          input[j-1] = temp;
        }
      }
    }
    //print sorted array
    System.out.println("Sorted array: " + Arrays.toString(input) + "\n");
  }
}
