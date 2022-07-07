String reverseWords(String S)
{
  int n = S.length();
  
  char[] str = S.charArray();
  
  int start = 0;
  
  for(int end=0;end<n;end++)
  {
    if( str.charAt(end) == ".")
    {
      reverse(str, start, end-1);
      start = end+1;
    }
  }
  reverse(str, start, n-1);
  reverse(str, 0, n-1);
  
  String s = new String(str);
  return s;
}
public void reverse(char[] str, int start, int end)
{
  while( start < end)
  {
    char temp = str[start];
    str[start] = str[end];
    str[end] = temp;
    start++;
    end--;
  }
}
