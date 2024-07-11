package Array.Easy;

public class Check_Sorted {
    public static void main(String[] args){
        int[] arr = {10, 54, 430};
        System.out.println(arraySortedOrNot(arr));
    }
    public static boolean arraySortedOrNot(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
