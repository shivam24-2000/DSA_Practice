class TwoStack
{
  int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
  
  void push1(int x)
  {
    if(top1 < top2-1)
    {
      top++;
      arr[top1] = x;
    }
  }
  
  void push2(int x)
  {
    if(top1 < top2-1)
    {
      top2--;
      arr[top2] = x;
    }
  }
  
  int pop1()
  {
    if(top1 >= 0)
    {
      int x = arr[top1];
      top1--;
      return x;
    }else
      return -1;
  }
  
  int pop2()
  {
    if( top2 < size)
    {
      int x = arr[top2];
      top2++;
      return x;
    }else
      return -1;
  }
  
}
