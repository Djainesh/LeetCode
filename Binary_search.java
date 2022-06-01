public class Binary_search {
    int Binary(int x,int start, int last,int array1[])

    {
        int mid = start + (last - start) / 2;
        if(last>=start)
        {
            if(array1[mid]==x)
            {
                return mid;

            }
            if(x<array1[mid])
            {
               return Binary(x,start,mid-1,array1);

            }
            if(x>array1[mid])
            {
              return  Binary(x,mid+1,last,array1);

            }


        }
        else {
            return -1;
        }
        return -1;


    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};

        Binary_search obj=new Binary_search();
        int leng=array.length;

        int temp=obj.Binary(5,0,leng-1,array);
        System.out.println(temp);


    }
}
