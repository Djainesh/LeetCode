import java.util.Arrays;
import java.util.PriorityQueue;
class Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            minheap.add(nums[i]);
        }
        System.out.println(minheap);

        for(int j=minheap.size();j>0;j--)
        {

            System.out.println("size of the minheap"+minheap.size());
            if(minheap.size()==k){

                System.out.println(minheap.peek());
                return minheap.peek();

            }
            minheap.poll();

        }

        return 1;

    }
}