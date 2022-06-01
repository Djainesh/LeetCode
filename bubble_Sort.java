public class bubble_Sort {
    public static void main(String args[])
    {
        int jainesh[]={3,6,5,97,9,2};
        for(int i=0;i<jainesh.length-1;i++)
        {
                 for(int j=0;j<jainesh.length-1-i;j++)
                 {
                     if(jainesh[j]>jainesh[j+1])
                     {
                         int temp=jainesh[j];
                         jainesh[j]=jainesh[j+1];
                         jainesh[j+1]=temp;
                     }
                 }


        }
        for(int i=0;i<jainesh.length-1;i++)
        {
            System.out.println(jainesh[i]);
        }

    }

}
