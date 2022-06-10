static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)
    {
        // Write your code here
        int[][] graph = new int[V][V];
        for(int i=0; i<V; i++)
            for(int j=0; j<adj.get(i).size(); j++)
                graph[i][adj.get(i).get(j).get(0)] = adj.get(i).get(j).get(1);
        
      int[] dist=new int[V];int res=0; 
    	Arrays.fill(dist,Integer.MAX_VALUE);dist[s]=0;
    	boolean[] fin=new boolean[V]; 
    
    	for (int count = 0; count < V-1 ; count++) 
    	{ 
    		int u = -1; 
    
    		for(int i=0;i<V;i++)
    		    if(!fin[i]&&(u==-1||dist[i]<dist[u]))
    		        u=i;
    		fin[u] = true; 
    		
    		for (int v = 0; v < V; v++) 
    
    			if (graph[u][v]!=0 && fin[v] == false) 
    				dist[v] = Math.min(dist[v],dist[u]+graph[u][v]); 
    	} 
        return dist;
    }
