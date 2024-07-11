package Array.Easy;

import java.util.ArrayList;
import java.util.TreeSet;

public class Union_Of_Arrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> arr = new ArrayList<>();
        TreeSet<Integer> st = new TreeSet<>();
        for(int i = 0; i <arr1.length; i++){
            st.add(arr1[i]);
        }
        for(int i = 0; i <arr2.length; i++){
            st.add(arr2[i]);
        }
        for(int a:st){
            arr.add(a);
        }
        return arr;
    }
}
