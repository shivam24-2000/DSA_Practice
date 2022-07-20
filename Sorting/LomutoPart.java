static int iPartition(int arr[], int l, int h)
{
    int pivot = arr[h] // always the last element;

    int i = l-1;

    for(int j=l;j<=h-1;j++)
    {
        if(arr[j] < pivot)
        {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
    int temp = arr[i+1];
    arr[i+1] = arr[h];
    arr[h] = temp;
    return i+1;
}