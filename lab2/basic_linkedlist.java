class basic_linkedlist{

    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // public static Node head ;
    // public static void createlist(int data){

    //     Node newnode = new Node(data);

    //     if(head==null){
    //         head=newnode;
    //         return;
           
    //     }
    //     // Node curr = head;

    //     // while(curr.next!=null){
    //     //     curr=curr.next;
    //     // }
    //     // curr.next=newnode;
    //     newnode.next=head;
    //     head= newnode;

    // }

    // public  void printlist(){
    //     Node curr = head;

    //     while(curr!=null){
    //         System.out.println(curr.data+" ");
    //     }
    //     System.out.println();
    // }
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    // int size=0;
    // public static Node tail;
    public static void insert(int data){

        Node newNode=new Node(data);
        // size++;
 
        if(head==null){
            head =  newNode;
            return;

        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        // newNode.next=head;
        // head=newNode;
    }
    public  void print(){
        Node temp=head;
        if(temp==null){
 
            System.out.println("list is empty");
            return;
        }
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null\n");

    }
    public static void deletelast(Node head){
        if(head==null || head.next==null){
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next = null;
    

    }
    public static void main(String[] args) {
      basic_linkedlist list = new basic_linkedlist();
      list.insert(1);
      list.insert(2);
      list.insert(4);
      list.insert(5);
      list.insert(6);
      list.print();
      list.deletelast(head);
      list.print();
    }

}