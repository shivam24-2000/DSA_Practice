    long maxProduct(int[] arr, int n) {
        // code here
        long minVal = arr[0], maxVal = arr[0], prod = arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i] < 0)
            {
                long temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
            
            maxVal = Math.max(arr[i], arr[i] * maxVal);
            minVal = Math.min(arr[i], arr[i] * minVal);
            
            prod = Math.max(prod, maxVal);
        }
        return prod;
    }
