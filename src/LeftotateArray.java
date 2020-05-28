import java.util.*;

public class LeftotateArray {
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("number of element in an array");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the element");
    for(int i = 0; i<arr.length;i++){
        arr[i] = s.nextInt();
    }
    System.out.println("Number of times");
    int t = s.nextInt();

    System.out.println("The original array");
    for(int i=0 ;i< arr.length;i++){
        System.out.print(arr[i] + "");
    }
    for(int i = 0; i < n; i++){
        int j, first;
        first = arr[0];
        for(j = 0; j< arr.length-1; j++){
            arr[j] = arr[j+1];

        }
        arr[j] = first;
    }
        System.out.println();
        //Displays resulting array after rotation
        System.out.println("Array after left rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
