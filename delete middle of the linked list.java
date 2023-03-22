class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        int count=1,pos=1,n=0;
        Node p,temp;
        p=head;
        while(p.next!=null)
        {
            p=p.next;
            count++;
        }
        if(count%2==0 || (count%2)!=0)
        {
            n=(count/2)+1;
        }
        p=head;
        while((pos+1)!=n)
        {
            p=p.next;
            pos++;
        }
        temp=p.next;
        p.next=temp.next;
        return head;
    }
}