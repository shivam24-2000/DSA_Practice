public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] inDegree = new int[V];
        
        for(int i=0;i<V;i++)
        {
            for( int v : adj.get(i) )
            {
                inDegree[v]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        
        for(int i=0;i<V;i++)
        {
            if(inDegree[i] == 0)
                q.add(i);
        }
        int count=0;
        while( !q.isEmpty() )
        {
            int u = q.poll();
            
            for(int v : adj.get(u) )
            {
                if(--inDegree[v] == 0)
                    q.add(v);
            }
            count++;
        }
        if(count != V) return true;
        else return false;
    }
