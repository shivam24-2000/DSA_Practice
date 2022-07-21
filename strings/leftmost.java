// Leftmost Repeating Character
static final int CHAR = 256;

int leftMost(String s1)
{
    boolean[] visited = new boolean[CHAR];
    int res = -1;

    for(int i = s1.length()-1; i>=0;i--)
    {
        if(visited[s1.charAt(i)]) res = i;
        else visited[s1.charAt(i)] = true;
    }
    return res;
}

// leftmost Non-repeating character
static final int CHAR = 256;

int non_repeat(String s1)
{
    int[] count = new int[CHAR];

    for(int i=0;i<s1.length();i++)
    {
        count[s1.charAt(i)]++;
    }

    for(int i=0;i<s1.length();i++)
    {
        if( count[s1.charAt(i)] == 1) return i;
    }
    return -1;
}