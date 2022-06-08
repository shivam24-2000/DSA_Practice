class Solution {
    public boolean DFS(ArrayList<ArrayList<Integer>> adj, int s,boolean[] visited, int parent )
    {
        visited[s] = true;
        
        for(int v : adj.get(s) )
        {
            if( visited[v] == false)
            {
                if(DFS(adj, v, visited, s) ) return true;
            }
            else if( v != parent) return true;
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean[] visited = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i] == false)
            {
                if(DFS(adj, i, visited, -1) )
                    return true;
            }
        }
        return false;
    }
}
