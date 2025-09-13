class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                if (nums1.length == 0 && nums2.length == 0) {
            throw new IllegalArgumentException("Both arrays are empty");
        }
        int res []=new int [nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) {
                res[k]=nums1[i];
                i++;
                k++;

            } else {
                res[k]=nums2[j];
                j++;
                k++;

                  }
        }
         while(i<nums1.length) {
          res[k]=nums1[i];
            i++;
            k++;
             }

        while(j<nums2.length){
          res[k]=nums2[j];
          j++;
          k++;
        }

        int totalLength = res.length;
         if (totalLength % 2 == 1) {
             return (double) res[totalLength / 2];

        } else {

            return (res[totalLength / 2 - 1] + res[totalLength / 2]) / 2.0;
        }

    }
}