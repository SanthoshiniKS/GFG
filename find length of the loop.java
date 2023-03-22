class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        int pos=1;
        Node p=head,q=head;
        while(p!=null && q!=null && q.next!=null)
        {
            p=p.next;
            q=q.next.next;
            if(p==q)
            {
                Node temp=p;
                while(temp.next!=p)
                {
                    pos++;
                    temp=temp.next;
                }
                return pos;
            }
        }
        return 0;
    }
}