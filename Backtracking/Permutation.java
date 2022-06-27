public List<String> find_permutation(String S) {
        // Code here
        ArrayList<String> list = new ArrayList<>();
        int n = S.length();
        permute(S,0,n-1,list);
        
        HashSet<String> h1 = new HashSet<>(list);
       List<String> arr1 = new ArrayList<>(h1);
        Collections.sort(arr1, new Comparator<String>()
        {
            public int compare(String a, String b)
            {
                return a.compareTo(b);
            }
        });
        
        return arr1;
    }
    public static void permute(String S, int l, int r, ArrayList<String> list)
    {
        if( l == r)
        {
            list.add(S);
            return;
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                S = new String(swap(S, i, l) );
                permute(S,l+1,r,list);
                S = new String(swap(S,i,l) );
            }
        }
    }
    public static char[] swap(String S, int i, int j)
    {
        char[] ch = S.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
