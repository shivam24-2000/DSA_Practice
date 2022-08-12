class Pair
    {
        int start, end;

        Pair(int start, int end)
        {
            this.start = start;
            this.end = end;
        }
    }
class Solution {
    
    public int[][] merge(int[][] intervals) {
        
        Pair[] arr = new Pair[intervals.length];
        
        for(int i=0;i<intervals.length;i++)
        {
            arr[i] = new Pair(intervals[i][0], intervals[i][1]);
        }
        
        Arrays.sort(arr, new Comparator<Pair>()
                    {
                        public int compare(Pair o1, Pair o2)
                        {
                            return o1.start - o2.start;
                        }
                    });
        Stack<Pair> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<intervals.length;i++)
        {
            Pair current = st.pop();
            if(arr[i].start <= current.end)
            {
                st.push(new Pair(current.start, Math.max(current.end, arr[i].end)));
            }else
            {
                st.push(current);
                st.push(new Pair(arr[i].start, arr[i].end));
            }
        }
        
        int[][] output = new int[st.size()][2];
        
        // Stack st1 = new Stack(st)÷;
        for(int i=st.size()-1;i>=0;i--)
            {
                Pair current = st.pop();
                output[i][0] = current.start;
                output[i][1] = current.end;
            }
        return output;
    }
}