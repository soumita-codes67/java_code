public class linkedList {
    node head;
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        node new_node=new node(data);
        if(head==null){
            head=new_node;
            return ;
        }
        new_node.next=head;
        head=new_node;
    }
    public void addLast(int data){
        node new_node=new node(data);
        node curr_node=head;
        if(head==null){
            head=new_node;
            return ;
        }
        while(curr_node.next !=null){
            curr_node=curr_node.next;
        }
        curr_node.next=new_node;
    }
    public void addPosition(int data, int pos){
        node new_node=new node(data);
        node curr_node=head;
        
        if(pos<0){
            System.out.println("Not a avlid position");
            return;
        }
        if(head==null ){
            head=new_node;
            return ;
        }
        for(int i=0;i< pos-1;i++){
            if(curr_node.next==null){
                System.out.println("Position does not exsist");
                return;
            }
            curr_node=curr_node.next;
        }
        new_node.next=curr_node.next;
        curr_node.next=new_node;
       
    }

    public void deleteFirst(){
        node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        temp.next=head.next;
        head=temp;
    }
    public void deleteLast(){
        node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deletePosition(int pos){
        
        node temp=head;
        
        if(pos<0){
            System.out.println("Not a avlid position");
            return;
        }
        if(head==null ){
            System.out.println("Linked list is empty");
            return ;
        }
        if(pos==0){
            head=head.next;
            return;
        }
        for(int i=0;i< pos-1;i++){
            if(temp.next==null){
                System.out.println("Position does not exsist");
                return;
            }
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Position does not exist");
            return;
        }
        temp.next=temp.next.next;
       
    }
    public void revers(){
        node prev=null;
        node curr=head;
        node nextNode=null;
        while(curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;

    }

    public void display(){
        node curr_node=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(curr_node!=null){
            System.out.print(curr_node.data+"->");
            curr_node=curr_node.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        linkedList ob=new linkedList();
        ob.addFirst(30);
        ob.addFirst(40);
        ob.addLast(50);
        ob.addPosition(60,2);
        //ob.deleteFirst();
        ob.addFirst(70);
        //ob.deleteLast();
        ob.deletePosition(0);
        ob.display();
        ob.revers();
        ob.display();
        }
}
