import java.util.Arrays;

public class SORT{
    public static void main(String[] args) {
        int [] arr = {56,45,34,32,21,89,12,34,1,2,4,12,23,34,56,7,786,4,24,1413,41412,313123,131,313,1,432,4,2432,543,5,4,654,6,3,52,43,1,12,3,13,12,14,3,24,92,35,43,5,43,5,4,5,8484,4,6,5,6,5,6,42,25,2,3,25,1,2,3,25,2,4,3,4,25,5,2,6,5,7,0,8};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    public static int [] mergesort(int [] arr){
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
        
    }
    public static int[] merge(int[] left, int[] right) {
        int [] ans = new int[left.length+right.length];
        int i =0;//for left
        int j =0;//for right
        int r = 0;//for ans
        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                ans[r] = left[i];
                i++;
            }else{
                ans[r] = right[j];
                j++;
            }
            r++;
        }
        while (i<left.length) {
            ans[r] = left[i];
            i++;
            r++; 
        }
        while(j<right.length){
            ans[r] = right[j];
            j++;r++;
        }
        return ans;
    }
}