package Task11Array;
import java.util.*;
public class ArrayLesson {
    //Arrays in Java are powerful data structures that store a collection of elements of the same data type. Starts  from 0.
/**
 * Key Characteristics
 * Fixed Size: Once declared, the size of an array cannot be changed.
 * Homogeneous Elements: All elements in an array must be of the same data type.
 * Indexing: Elements are accessed using their index, which starts from 0.
 * Memory Allocation: Arrays are allocated in contiguous memory locations.
 */



/**
 * Declaration: dataType[] arrayName;
 * Direct Initialization: int[] numbers = {1, 2, 3, 4, 5};
 * 
 * Indirect initialization: int[] numbers = new int[5];
 * numbers[0] = 1;
 * numbers[1] = 2;
 * 
 * Accessing Elements: int firstElement = numbers[0];
 * Iterating Over Arrays: for (int i = 0; i < numbers.length; i++) {System.out.println(numbers[i]);}
 * 
 * Enhanced for Loop: for (int number : numbers) {System.out.println(number);}
 * Array Length: int arrayLength = numbers.length;
 * Multidimensional Arrays: int[][] matrix = new int[3][4];
 * 
 */

 public static void main(String... args) {
    int[] numbers2 = new int[]{42,55,99};
    System.out.println(numbers2[2]);

    String[] birds = new String[6];
        System.out.println(birds.length);

    int[] numbers3 = {42,55,99,11,54,66,78,36,45,11,7005,225,2255,2,4,5};
    Arrays.sort(numbers3);
    for (int i : numbers3) {
        System.out.print(i+",");

 }
}
}
