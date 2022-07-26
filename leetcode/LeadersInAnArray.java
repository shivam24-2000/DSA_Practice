class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int current_leader = arr[n-1];
        list.add(current_leader);
        
        for(int i=n-2;i>=0;i--)
        {
            if(current_leader <= arr[i])
            {
                current_leader = arr[i];
                list.add(current_leader);
                
            }
        }
        Collections.sort(list,  Collections.reverseOrder());
        return list;
       
    }
}
