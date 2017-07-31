/*
amazon i and j
*/
class Node{
  int data;
  Node next;
  Node(int d){
    data = d;
    next = null;
  }
  void appendToTail(int d){
    Node temp = this;
    while(temp.next!=null)
      temp = temp.next;
    Node newnode = new Node(d);
      temp.next = newnode;
  }
  void output()
  {
    Node temp = this;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  Node del(Node head, int d)
  {
    Node temp = this, prev = null;
    if(temp==null)
      return null;
    while(temp.next!=null && temp.data!=d)
    {
        prev = temp;
        temp = temp.next;
    }

    if(prev==null)
      return temp.next;
    else{
      prev.next = temp.next;
      return head;
    }
  }
  Node delitoj(Node head, int i, int j){
    Node temp=this;
    while(i!=0){
      temp = temp.next;
      i--;
    }
    Node cur = temp;
    while(j!=0){
      cur = cur.next;
      j--;
    }
    temp.next =cur.next;
    return head;
  }
}


class nodedel{
  public static void main(String[] args) {
    Node head = new Node(5);
    head.appendToTail(3);
    head.appendToTail(1);
    head.appendToTail(4);
    head.appendToTail(6);
    head.appendToTail(8);
    head.appendToTail(12);
    head.appendToTail(0);
    head.appendToTail(11);
    head.output();
    //head = head.del(head,5);
    head = head.delitoj(head,2,4);
    head.output();
  }
}
