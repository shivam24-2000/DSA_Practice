class Pair 
    {
        int start,end;
        Pair(int start, int end)
        {
            this.start = start;
            this.end = end;
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public  int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Pair arr[] = new Pair[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(arr, new Comparator<Pair>()
        {
            public int compare(Pair p1, Pair p2)
            {
                return p1.end - p2.end;
            }
        });
        Pair current = arr[0];
        int ans=1;
        for(int i=1;i<n;i++)
        {
            if(current.end < arr[i].start)
            {
                ans++;
                current = arr[i];
            }
        }
        return ans;
       
        
    }
