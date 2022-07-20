// QuickSort using Lomuto's Partition
void qSort(int[] arr, int l, int h)
{
    if(l < h)
    {
        int p = Partition(arr,l,h);
        qSort(arr, l, p-1);
        qSort(arr, p+1, h);
    }
}
int Partition(int[] arr, int l, int h)
{
    int pivot = arr[h];

    int i=l-1;

    for(int j=l;j<=h-1;j++)
    {
        if(arr[j] < pivot )
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

// QuickSort using Hoare's Partition
void qSort(int[] arr, int l, int h)
{
    if(l < h)
    {
        int p = Partition(arr,l,h);
        qSort(arr, l, p);
        qSort(arr, p+1, h);
    }
}

int Partition(int[] arr, int l, int h)
{
    int pivot = arr[l];

    int i = l-1, j = h+1;

    while(true)
    {
        do{
            i++;
        }while( arr[i] < pivot)

        do{
            j--;
        }while(arr[j] > pivot)

        if( i>=j) return j;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
