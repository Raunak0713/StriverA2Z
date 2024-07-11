package Array.Easy;

public class Largest_Element_in_Array {
    public static void main(String[] args){
        int[] arr = {10, 13, 54, 9, 55};
        System.out.println(largest(arr));
    }
    public static int largest( int[] arr) {
        int a = arr[0];
        for(int b : arr){
            if(b > a){
                a = b;
            }
        }
        return a;
    }
}
