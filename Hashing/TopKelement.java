class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        int n = nums.length;
        
        for(int i=0;i<n;i++)
        {
            if( !hm.containsKey(nums[i])) hm.put(nums[i], 1);
            else hm.put(nums[i], hm.get(nums[i]) +1);
        }
        Set<Map.Entry<Integer,Integer>> entrySet = hm.entrySet();
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(entrySet);
        
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>()
                         {
                             public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)
                             {
                                 return o2.getValue() - o1.getValue();
                             }
                             
                         });
        int[] res = new int[k];
        ArrayList<Integer> res1 = new ArrayList<>();
        
        list.forEach(s->
                     {
                         int key = s.getKey();
                         res1.add(key);
                     });
        int j = 0;
    
        for(int i=0;i<res1.size();i++)
        {
            if( j < k) res[j++] = res1.get(i);
        }
        
        
        return res;
    }
}