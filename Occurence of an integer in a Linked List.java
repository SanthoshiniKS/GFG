class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        Node p=head;
        int count=0;
        while(p!=null)
        {
            if(p.data==search_for)
            {
                count+=1;
            }
            p=p.next;
        }
        return count;
    }
}