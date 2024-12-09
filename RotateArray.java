class RotateArray
{
    public static int[] rotateOnce(int n[])
    {   int nums[] = new int[n.length];
        int i=0;
        nums[i]=n[n.length-1];
        i++;
        for(i=1;i<=n.length-1;i++)
        {
            nums[i]=n[i-1];
        }
        for(int j : nums)
        {
            System.out.println(j+",");
        }
        return nums;
    }
    public static void main(String args[])
    {
        int[] n = {2,3,4,5};
        int[] m = rotateOnce(n);
        for(int j : m)
        {
            System.out.println(j+",");
        }
    }
}
