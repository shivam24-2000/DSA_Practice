class Solution
{
  static int prec(char c)
  {
    if( c == '^') return 3;
    else if ( c == '*' || c == '/') return 2;
    else if ( c == '+' || c == '-') return 1;
    else return -1;
  }
  
  public static String infixTopostfix( String s )
  {
    Stack<Character> st = new Stack<>();
    String res = " ";
    for(int i=0;i<s.length();i++)
    {
      char c = s.charAt(i);
      
      if( Character.isLetterOrDigit(c))
        res += c;
      else if ( c == '(')
      {
        st.push('(');
      }
      else if ( c == ')')
      {
        while( st.peek() != '(')
        {
          res += st.peek();
          st.pop();
        }
        st.pop();
      }
      else
      {
        while( !st.isEmpty() && prec(c) <= prec(st.peek())
              {
                res += st.peek();
                st.pop();
              }
              st.push(c);
      }
    }
    while( !st.isEmpty)
              {
                res += st.peek();
                st.pop();
              }
    return res;
  }
}
