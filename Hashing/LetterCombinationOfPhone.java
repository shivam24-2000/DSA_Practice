class Solution {
    public void solve(int i, String digit,String temp, List<String> list, Map<Character,String> hm )
    {
        if(i == digit.length())
        {
            list.add(temp);
            return;
        }
        String str = hm.get(digit.charAt(i));
        
        for(int j=0;j<str.length();j++)
        {
            char ch = str.charAt(j);
            solve(i+1, digit, temp+ch, list, hm);
        }
        
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        
        Map<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        
        int n = digits.length();
        
        if(  n == 0) return list;
        
        String temp = "";
        solve(0, digits,temp,  list, hm);
        
        return list;
    }
}