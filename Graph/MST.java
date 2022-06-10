static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        int[][] graph = new int[V][V];
        
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<adj.get(i).size(); j++ )
            {
                graph[i][adj.get(i).get(j).get(0)] = adj.get(i).get(j).get(1);
            }
        }
        int key[] = new int[V];
        int res = 0;
        Arrays.fill(key, Integer.MAX_VALUE);
        
        boolean mSet[]  = new boolean[V];
        
        key[0] = 0;
        
        for(int count=0; count<V;count++)
        {
            int u = -1;
            
            for(int i=0;i<V;i++)
                if( mSet[i]== false && (u==-1 || key[i] < key[u]) )
                    u = i;
                
            mSet[u] = true;
            res += key[u];
            
            for(int v=0;v<V;v++)
            {
                if(mSet[v]== false && graph[u][v] != 0 )
                    key[v] = Math.min(key[v], graph[u][v] ); 
            }
        }
        return res;
    }

