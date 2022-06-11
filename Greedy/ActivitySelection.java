class Solution
{
    static class Pair implements Comparable<Pair>{
       int first, second;
       Pair(int first, int second){
           this.first = first;
           this.second = second;
       }
       @Override
       public int compareTo(Pair o) {
           return this.second-o.second;
       }
       
   }
   
   public static int activitySelection(int start[], int end[], int n)
   {
       Pair arr[] = new Pair[n];
       
       for(int i = 0; i < n; i++){
           arr[i] = new Pair(start[i], end[i]);
       }
       
       Arrays.sort(arr);
       
       int ans = 1;
       Pair current = arr[0];
       for(int i = 1; i < n; i++){
           if(current.second < arr[i].first){
               ans++;
               current = arr[i];
           }
       }
       
       return ans;
       
   }
}
