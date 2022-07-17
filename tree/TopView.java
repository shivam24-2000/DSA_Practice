class Pair
{
    Node node;
    int hd;
    Pair(Node node, int hd)
    {
        this.node = node;
        this.hd = hd;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<Pair> q = new LinkedList<>();
        
        Map<Integer, Integer> hm = new TreeMap<>();
        
        q.add(new Pair(root, 0) );
        
        while( !q.isEmpty() )
        {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            
            if( !hm.containsKey(hd) )
            {
               
                hm.put(hd, curr.data);
            }
            if(curr.left != null) q.add(new Pair(curr.left, hd-1) );
            if(curr.right != null) q.add(new Pair(curr.right, hd+1) );
        }
        ArrayList<Integer> res = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> itr: hm.entrySet())
        {
            res.add(itr.getValue() );
        }
        return res;
    }
}
