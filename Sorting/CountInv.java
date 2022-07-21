static long convergeMerge(long arr[], long l, long mid, long h)
    {
        long p1=l,p2=mid,p3=0;
        long[] temp =new long[(int)(h-l+1)];
        long count = 0;
        while(p1 < mid && p2 <= h)
        {
            if(arr[(int)p2] < arr[(int)p1])
            {
                count += mid-p1;
                temp[(int)p3++] = arr[(int)p2++];
            }else
            {
                temp[(int)p3++] = arr[(int)p1++];
            }
        }
        
        while( p1 < mid )
        {
            temp[(int)p3++] = arr[(int)p1++];
        }
        while( p2 <= h)
        {
            temp[(int)p3++] = arr[(int)p2++];
        }
        for(long i =0; i<(h-l+1); i++ )
        {
            arr[(int)(i+l)] = temp[(int)i];
        }
        return count;
    }
    static long converge(long arr[], long l, long h)
    {
        long res = 0;
        
        if( l < h)
        {
            long mid = l + (h-l)/2;
            
            res += converge(arr,l,mid);
            res += converge(arr, mid+1, h);
            
            res += convergeMerge(arr, l, mid+1, h);
        }
        return res;
        
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return converge(arr,0, N-1);
    }