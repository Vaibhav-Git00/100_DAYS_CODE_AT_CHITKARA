public class linklist2 {
    public static class Node {   //this is the informataion of node class
        int data;
        Node next;    //this is next refrence of the next node
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    //constructor
    public static Node head;
    public static Node tail;
    public static int size;


    public void addfirst(int data){
        //step-1 create a new node
        Node newnode=new Node(data);  //data is your constructor
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }

        //step-2 newnode next = head ki value
        newnode.next=head;  //that is linked a new node

        //step-3 
        head=newnode;  //it is not understading for assigning the value head and tail individually object which is linklist class
        //while newnode ko upgrader kr rhe hai head ke sath
    }
    //both the complexity are 0(1) constant time lag rha haiii

    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail= newnode ;

    }
    public void print(){
        if(head==null){
            System.out.println("linklist is empty");
            return;
        }
        Node temp=head;   //while if apply any type of algorithum this can use only temp because head and tail has not will be changed
        while (temp!=null) {    //tc=o(n) linear time
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //add middle
    public void add(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }



    public static void main(String[] args) {
        linklist2 ll=new linklist2();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.size);
    }
}
