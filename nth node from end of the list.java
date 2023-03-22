int getNthFromLast(struct Node *head, int n)
{
    struct Node *p,*temp;
    int pos=0;
    p=head;
    while(p!=NULL)
    {
        pos+=1;
        p=p->next;
    }
    if(pos<n)
        return -1;
    int value=pos-n+1;
    temp=head;
    while(value!=1)
    {
        value=value-1;
        temp=temp->next;
    }
    
        return temp->data;
}