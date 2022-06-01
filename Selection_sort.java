import java.util.Arrays;

public class Selection_sort {
    public static void main(String args[])
    {
        int jainesh[]={3,6,5,97,9,2};
        for(int i=0;i<jainesh.length-1;i++) {
            int smallest=i;
            for(int j=i+1;j< jainesh.length;j++)
            {
                if(jainesh[smallest]>jainesh[j])
                {
                    smallest=j;
                }

            }
            int temp=jainesh[i];
            jainesh[i]=jainesh[smallest];
            jainesh[smallest]=temp;
        }
        for(int i=0;i<jainesh.length;i++)

        {
            System.out.println(jainesh[i]);
        }
    }
}
