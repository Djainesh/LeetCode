public class lengthoflongestubstring {
    public int lengthOfLongestSubstring(String s) {

        int a=0;
        int b=0;
        int max=0;
        String temp=s;

        HashSet<Character> hashset=new HashSet<Character>();
        while(b < temp.length())
        {
            if(!hashset.contains(temp.charAt(b)))

            {
                hashset.add(temp.charAt(b));
                b++;
                max=Math.max(max,hashset.size());

            }
            else{
                hashset.remove(temp.charAt(a));
                a++;
            }
        }
        return max;



    }
}
