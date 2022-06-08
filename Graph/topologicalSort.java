static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] inDegree = new int[V];
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int u=0;u<V;u++)
        {
            for(int x : adj.get(u) )
                inDegree[x]++;
        }
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<V;i++)
        {
            if(inDegree[i] == 0) q.add(i);
        }

        while( !q.isEmpty() )
        {
            int u = q.poll();
            ans.add(u);
            
            for(int x: adj.get(u) )
            {
                if(--inDegree[x] == 0 ) q.add(x);
            }
        }
        int res[]=new int[ans.size()];
        int a=0;
        for(int i=0;i<ans.size();i++){
            res[a++]=ans.get(i);
        }
        return res;
    }

