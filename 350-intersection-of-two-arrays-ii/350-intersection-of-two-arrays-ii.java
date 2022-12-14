class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                nums1[count++] = nums1[i];
                i++;
                j++;
            }
        }
        int[] ans = new int[count];
        for (i = 0; i < count; i++) {
            ans[i] = nums1[i];
        }
        return ans;
    }
}
