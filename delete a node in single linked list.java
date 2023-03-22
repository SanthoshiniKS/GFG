class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	 Node p,q;
	 p=head;
	 q=head;
	 int pos=1;
	 if(x==1)
	 {
	     head=head.next;
	     return head;
	 }
	 while(p.next!=null && pos!=x)
	 {
	     pos++;
	     p=p.next;
	 }
	 while(q.next!=p)
	 {
	     q=q.next;
	 }
	 q.next=p.next;
	 return head;
    }
}