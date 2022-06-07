class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<m;i++)
        {
            pq.add(nums1[i]);
        }
        for(int i=0;i<n;i++)
        {
            pq.add(nums2[i]);
        }
        int index=0;
        while( !pq.isEmpty())
        {
            nums1[index++] = pq.poll();
        }
    }
}
