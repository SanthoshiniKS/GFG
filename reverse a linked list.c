struct Node* reverseList(struct Node *head)
    {
        struct Node *cur,*prev,*temp;
        cur=head;
        temp=head;
        prev=NULL;
        while(temp!=NULL)
        {
            temp=temp->next;
            cur->next=prev;
            prev=cur;
            cur=temp;
        }
        head=prev;
        return head;
    }