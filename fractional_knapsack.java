import java.util.*;
class fractional_knapsack
{
    public static void main(String args[])
    {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        final int max = 50;
        double[][] ratio = new double[val.length][2];
        double profit=0;
        double consumed=0;
        for(int i=0;i<ratio.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        for(int i=ratio.length-1;i>=0;i--)
        {
            if(consumed+weight[(int)ratio[i][0]]<=max)
            {
                consumed = consumed+weight[(int)ratio[i][0]];
                profit += val[(int)ratio[i][0]];
            }
            else
            {
               double fr = (max-consumed)/weight[(int)ratio[i][0]];
                profit += val[(int)ratio[i][0]]*fr;
                consumed =max;
            }
        }
        System.out.println("The maximum value that can be put in the knapsack is : "+profit+"\n");
            

    }
    

}