package Array.Hard;

public class Missing_And_Repeating {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        int i=0;
        while(i<n){
            int curr = arr[i]-1;
            if(arr[i]!=arr[curr]){
                int temp = arr[i];
                arr[i] = arr[curr];
                arr[curr] = temp;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(arr[k]!=k+1){
                ans[0]=arr[k];
                ans[1]=k+1;
            }
        }
        return ans;
    }
}
