

import java.util.Arrays;

public class Activity1_4 {
public static void main(String[] args) {
	int data[]= {1,12,0,1,2};
	int size=data.length;
	System.out.println("Size of array is: "+size);
	System.out.println("Array before sort: "+Arrays.toString(data));
	insertionSort(data);
System.out.println("Array after sort: "+Arrays.toString(data));
}

 static void insertionSort(int[] array) {
	 int size = array.length, i;
 
	 for (i = 1; i < size; i++) {
         int key = array[i];
         int j = i - 1;
         
         while (j >= 0 && key < array[j]) {
             array[j + 1] = array[j];
             --j;
         }
         array[j + 1] = key;
     }
 }}
