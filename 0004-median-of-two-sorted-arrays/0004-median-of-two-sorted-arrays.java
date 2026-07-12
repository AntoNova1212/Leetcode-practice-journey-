class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] arr = new int[n + m];
        int idx_1 = 0;
        int idx_2 = 0;


        for(int i = 0; i < (n+m); i++){
            int count = 0;
            if(idx_1 != n && idx_2 != m){
                if(nums1[idx_1] < nums2[idx_2]){
                    arr[i] = nums1[idx_1];
                    count++;
                    idx_1++;
                }
                else{
                    arr[i] = nums2[idx_2];
                    count++;
                    idx_2++;
                }
            }
            else if(idx_1 == n && idx_2 !=m){
                arr[i] = nums2[idx_2];
                idx_2++;
            }
            else{
                arr[i] = nums1[idx_1];
                idx_1++;
            }
        }

        int A = arr.length;

        if(A % 2 == 0){
            double mid1 = arr[A/2];
            double mid2 = arr[(A/2) - 1 ];

            double median = (mid1 + mid2) / 2;

            return median;
        }
        else{
            double median = arr[(A/2)];

            return median;
        }

    }
}