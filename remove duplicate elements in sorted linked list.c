//User function Template for C

void removeDuplicates(struct Node* head)
{
   struct Node *p=head,*q,*temp;
   int i,j;
   while(p->next!=NULL)
   {
       q=p->next;
           if(p->data==q->data)
           {
               temp=q;
               q=q->next;
               p->next=temp->next;
               free(temp);
           }
           else
              p=p->next;
   }
   return head;
}