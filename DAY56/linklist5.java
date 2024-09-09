
//first of all create a one class and define a specifix variable

public class linklist5 {
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
    //remove first
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1) {
            int var=head.data;
            head=tail=null;
            return var;
            
        }
        int var=head.data;  //It stores the data from the first node (the head) of the linked list in the variable var.
        head=head.next;
        size--;
        return var;      //It returns the data of the removed node.
    }


    //remove tail
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int var=head.data;
            head=tail=null;
            size=0;
            return var;
        }
        Node prv=head;
        for(int i=0;i<size-2;i++){
            prv=prv.next;
        }

        int val=prv.next.data;
        prv.next=null;
        tail=prv;
        size--;
        return val;
    }

    public int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1; //if key is not foundd
    }

    public static void main(String[] args) {
        linklist5 ll=new linklist5();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.add(2, 9);
        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

        ll.removelast();
        ll.print();
        System.out.println(size);

        System.out.println(ll.iterativeSearch(3));
        System.out.println(ll.iterativeSearch(10));


    }
}

