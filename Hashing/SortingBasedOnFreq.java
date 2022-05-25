class solution
{
  static ArrayList<Integer> sortByFreq(int arr[], int n)
  {
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    for(int i=0;i<n;i++)
    {
      if( hm.containsKey(arr[i]) )
        hm.put( arr[i], hm.get(arr[i]) +1);
      else
        hm.put(arr[i], 1);
    }
    
    Set<Map.Entry<Integer, Integer>> entryset = hm.entrySet<>();
    
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entryset);
    
    Collections.sort( list, new Comparator( Map.Entry<Integer, Integer>>()
                                           {
                                             public int compare( Map.Entry<Integer, Integer> o1,  Map.Entry<Integer, Integer> o2)
                                             {
                                               if( o1.getValue() > o2.getValue() )
                                                 return -1;
                                               else if (o1.getValue() == o2.getValue())
                                               {
                                                 if( o1.getValue() > o2.getValue() )
                                                   return 1;
                                                 else 
                                                   return -1;
                                               }
                                               else if (o1.getValue() < o2.getValue())
                                                 return 1;
                                               
                                               return Integer.MIN_VALUE;
                                                 
                                             }
                                           });
    ArrayList<Integer> Last1 = new ArrayList<Integer>();
    list.forEach( s->
                 {
                   int val = s.getvalue();
                   
                   for(int i=0;i<val;i++)
                     Last1.add(s.getKey());
                 }
    
    return Last1;
  }
}
