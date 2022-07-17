class Pair
    {
        Node node;
        int hd;
        Pair(Node n, int h)
        {
            node = n;
            hd = h;
        }
    }
class Solution
{
    
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        Queue<Pair> q = new LinkedList<>();
        
        Map<Integer, ArrayList<Integer>> hm = new TreeMap<>();
        q.add(new Pair(root,0) );
        
        while(!q.isEmpty() )
        {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            
            if(hm.containsKey(hd) )
            {
                hm.get(hd).add(curr.data);
            }
            else
            {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                hm.put(hd, al);
            }
            if(curr.left != null)
                q.add(new Pair(curr.left, hd-1) );
            if(curr.right != null)
                q.add(new Pair(curr.right, hd+1 ));
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Integer>> itr: hm.entrySet() )
        {
            ArrayList<Integer> res1 = itr.getValue();
            for(int i=0;i<res1.size();i++ )
                res.add(res1.get(i) );
        }
        return res;
    }
}
