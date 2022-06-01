import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Top_K_Frequent_Elements {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> capitalCities = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++) {
            if (capitalCities.containsKey(nums[i])) {

                capitalCities.put(nums[i], capitalCities.get(nums[i]) + 1);
            } else {
                capitalCities.put(nums[i], 1);
            }

        }
        PriorityQueue<Map.Entry<Integer,Integer>> obj=new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
        for(Map.Entry entry :capitalCities.entrySet())
        {
            obj.add(entry);
        }





        if(obj.size()==1)
        {
            int Array1[]=new int[1];
            System.out.print("insisde");
            Array1[0]=obj.peek().getKey();
            return Array1;
        }
        else{
            int Array1[]=new int[2];
            Array1[0]=obj.peek().getKey();
            obj.poll();
            Array1[1]=obj.peek().getKey();
            return Array1;

        }

    }
    public static void main(String atgs[])
    {
        Top_K_Frequent_Elements newObj=new Top_K_Frequent_Elements();
        int nums[]= {1,1,1,2,2,3};
                int k = 2;
        newObj.topKFrequent(nums,k);
    }
}