double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double res = 0.0;
        Arrays.sort(arr,new Comparator<Item>(){
          public int compare(Item a,Item b){
              double r1 = (a.value )/a.weight;
              double r2 = (b.value )/b.weight;
              if(r1<r2)
                   return 1;
              else if(r1==r2)
                   return 0;
              else
                   return -1;
               
          }
      });
        for(int i=0;i<n;i++)
        {
            if( arr[i].weight <= W)
            {
                res += arr[i].value;
                W = W- arr[i].weight;
            }
            else
            {
                res += arr[i].value*(double)W/(double)(arr[i].weight);
                break;
            }
        }
        return res;
    }
