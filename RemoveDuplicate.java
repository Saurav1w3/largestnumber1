package jdbc;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array size: ");
        int arraySize = sc.nextInt();
        int[] arrayNum = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            arrayNum[i] = sc.nextInt();
        }
        Arrays.sort(arrayNum);
        removeduplicate(arrayNum, arraySize);
    }
    public static void removeduplicate(int[] array, int size){
        int[] temp = new int[size];
        int j = 0;
        for(int i  = 0; i < size - 1; i++){
            if(array[i] != array[i +1])
                temp[j++] = array[i];

        }
        temp[j++] = array[size - 1];

        for(int k = 0; k < j; k++){
            System.out.print(temp[k] + " ");
        }
    }
}
