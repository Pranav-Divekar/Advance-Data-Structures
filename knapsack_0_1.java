class knapsack_0_1
{
    public static void main(String args[])
    {
        int[] value = {6,10,3,12};
        int[] weight = {2,5,4,3};
        final int W = 8;
        int dp[][] = new int[value.length+1][W+1];
        for(int i=0;i<value.length+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<value.length+1;i++)
        {
            for(int j=1;j<W+1;j++)
            {
                int val = value[i-1];
                int wt =  weight[i-1];
                if(wt<=j)
                {
                    dp[i][j] = Math.max(val+dp[i-1][j-wt], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println("The maximum value that can be put in the bag is "+dp[value.length][W]);
        for(int i=0;i<value.length+1;i++)
        {
            for(int  j=0;j<W+1;j++)
            {
                System.out.print(" "+dp[i][j]);
            }
            System.out.println();
        }

    }
}