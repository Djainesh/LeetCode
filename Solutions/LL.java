
class LL{
    Node head;
    /*
    * Created Node class and constructor for initialization */
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;

        }

    }
    /* Adding element in from the first*/
    void addFirst(String data){

        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    /*Adding element from the last*/
    void addLast(String body)
    {
        Node newobj=new Node(body);
        if(head==null)
        {
            head=newobj;
            return;
        }

        Node currentnode=head;
        while (currentnode.next!=null)
        {
            currentnode=currentnode.next;

        }
        currentnode.next=newobj;


    }
    /*display all the element present in the list*/
    void showList()
    {
       Node currentpointer=head;
       while (currentpointer.next!=null)
       {
           System.out.println(currentpointer.data);
           currentpointer=currentpointer.next;
           //System.out.print(currentpointer.data);


       }
        System.out.println(currentpointer.data);

    }


    public static void main(String args[])
    {
        LL obj=new LL();
        obj.addFirst("First");
        obj.addFirst("Second");
        obj.addFirst("third");
        obj.addLast("jainesh");
        obj.showList();


    }
}