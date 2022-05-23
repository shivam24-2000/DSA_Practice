public static Arraylist<Integer> nextGreater(int arr[], int n)
{
  ArrayList<Integer> v = new ArrayList<>();
  
  Stack<Integer> st = new Stack<>();
  
  st.add(arr[n-1]);
  v.add(-1);
  
  for(int i=n-2;i>=0;i--)
  {
    while( st.isEmpty() == false && st.peek() <= arr[i])
    {
      st.pop();
    }
    int span = st.isEmpty() ? -1 : st.peek();
    v.add(span);
    st.push(arr[i]);
  }
  
  Collections.reverse(v);
  return v;
}
