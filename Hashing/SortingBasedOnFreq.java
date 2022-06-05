static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if( hm.containsKey(arr[i]) )
            {
                hm.put(arr[i], hm.get(arr[i]) +1);
            }else
            {
                hm.put(arr[i], 1);
            }
        }
        
        // hm.forEach((k,v) -> System.out.println(k+v) );
        Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
        
        List<Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>()
        {
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)
            {
                if(o1.getValue() > o2.getValue())
        			return -1;
        		else if(o1.getValue() == o2.getValue()){
        			if(o2.getKey() < o1.getKey())
        			    return 1;
        			else
        			    return -1;
		    
        		}
        		else if(o1.getValue() < o2.getValue())
        			return 1;
        		
        		return Integer.MIN_VALUE;
            }
        });
        ArrayList<Integer> asd = new ArrayList<>();
        list.forEach( s->
        {
            int val  = s.getValue();
            
            for(int i=0;i<val;i++)
            {
                asd.add(s.getKey());
            }
        });
        
        return asd;
    }
