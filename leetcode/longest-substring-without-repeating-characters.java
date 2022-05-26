class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> seen = new HashMap<>(); 
        int maximum_length = 0;
 
        int start = 0;
 
        for(int end = 0; end < s.length(); end++)
        {
          if(seen.containsKey(s.charAt(end)))
          {
            start = Math.max(start, seen.get(s.charAt(end)) + 1);
          }
          seen.put(s.charAt(end), end);
          maximum_length = Math.max(maximum_length, end-start + 1);
        }
        return maximum_length;
        
    }
}
