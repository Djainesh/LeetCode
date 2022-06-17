public class mergeKLists {
        public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<Integer> obj=new PriorityQueue<Integer>();
            for(ListNode temp: lists)
            {
                while(temp != null)
                {
                    obj.add(temp.val);
                    temp=temp.next;
                }
            }
            ListNode jainesh=new ListNode(-1);
            ListNode  head=jainesh;
            while(!obj.isEmpty())
            {
                head.next=new ListNode(obj.remove());
                head=head.next;

            }
            return jainesh.next;



        }
    }

