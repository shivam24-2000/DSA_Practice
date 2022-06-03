	static void BFS(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited) 
	{ 
    	Queue<Integer> q=new LinkedList<>();
    	
    	visited[s] = true; 
    	q.add(s); 
    
    	while(q.isEmpty()==false) 
    	{ 
    		int u = q.poll(); 
    		System.out.print(u + " "); 
    		 
    		for(int v:adj.get(u)){
    		    if(visited[v]==false){
    		        visited[v]=true;
    		        q.add(v);
    		    }
    		} 
    	} 
	} 
	
	static void BFSDin(ArrayList<ArrayList<Integer>> adj, int V){
	    boolean[] visited=new boolean[V]; 
    	for(int i = 0; i < V; i++) 
    		visited[i] = false;
    	for(int i=0;i<V;i++){
            if(visited[i]==false)
                BFS(adj,i,visited);
        }
	}
