import java.lang.reflect.Array;
import java.util.Arrays;


public class Test {
    // Median of Two Sorted Arrays
    public static void  main(String args[]) {
        int nums1[] ={1,3};
        int nums2[] = {2};

        int temp1 = nums1.length;
        int temp2 = nums2.length;

        int nums3[] = new int[temp1 + temp2];
        for(int i=0;i<temp1;i++)
        {
            nums3[i]=nums1[i];

        }
        int cobine=temp1+temp2;
        for(int j=0,z=temp1;j<temp2 && z<=cobine;j++,z++)
        {
           // System.out.println(j);
           // System.out.println(z);
            nums3[z]=nums2[j];
        }
        Arrays.sort(nums3);

        if(cobine%2==0)
        {
                int cal=cobine/2;
                int  final1=nums3[cal-1]+nums3[cal];
                double final2= (double) final1/2;

            System.out.println(final2);

        }
        else
        {
            double cal1=(double) cobine/2;
            System.out.println(cal1);
            int cal2=(int)Math.ceil(cal1);
            System.out.println(cal2);
            int final3=nums3[cal2-1];
            System.out.println(final3);





        }








    }


}
