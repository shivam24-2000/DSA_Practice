// Top View of Binary Tree
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


// Bottom View of Binary Tree;
class Pair
{
    Node node;
    int hd;
    Pair(Node node, int hd)
    {
        this.node= node;
        this.hd = hd;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        Map<Integer, ArrayList<Integer>> hm = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0) );
        
        while( !q.isEmpty() )
        {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            
            if( hm.containsKey(hd) )
            {
                hm.get(hd).add(curr.data);
            }else
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(curr.data);
                hm.put(hd, list);
            }
            if(curr.left != null) q.add(new Pair(curr.left, hd-1) );
            if(curr.right != null) q.add(new Pair(curr.right, hd+1) );
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(Map.Entry<Integer, ArrayList<Integer>> itr : hm.entrySet() )
        {
            ArrayList<Integer> al = itr.getValue();
            int n = al.size();
            res.add(al.get(n-1) );
        }
        return res;
    }
}
