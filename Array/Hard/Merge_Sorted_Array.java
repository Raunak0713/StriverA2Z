package Array.Hard;

public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp1 = new int[m];
        for(int i=0; i<m; i++){
            temp1[i] = nums1[i];
        }
        int[] temp2 = new int[n];
        for(int i=0; i<n; i++){
            temp2[i] = nums2[i];
        }
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<temp1.length && j<temp2.length){
            if(temp1[i] <= temp2[j]){
                nums1[k++] = temp1[i++];
            }else{
                nums1[k++] = temp2[j++];
            }
        }

        while(i < temp1.length){
            nums1[k++] = temp1[i++];
        }

        while(j < temp2.length){
            nums1[k++] = temp2[j++];
        }
    }
}
