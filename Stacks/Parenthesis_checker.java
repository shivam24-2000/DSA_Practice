// created by @shivam24-2000

public static boolean matching(char a, char b)
{
  return ((a=='[' && b==']') || (a=='(' && b==')') || (a=='{' && b=='}') );
}

public static boolean Parenthesis( String str)
{
  Deque<Character> s = new ArrayDeque<>();
  
  for(int i=0;i<s.length();i++)
  {
    if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') 
      s.push(s.charAt(i);
    else{
      if(s.isEmpty() == true)
        return false;
      elseif( matching(s.peek(), str.charAt(i) ) == false)
        return false;
      else
        s.pop();
    }
  }
  return (s.isEmpty() == true);
}
