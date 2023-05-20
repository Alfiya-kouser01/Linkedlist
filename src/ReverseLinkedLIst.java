import java.util.Scanner;
         class Node{
    int data;
    Node next;

             public Node(int data){

                 this.data=data;
                 this. next=null;
             }
         }

public class ReverseLinkedLIst {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the list ");
        int n=sc.nextInt();
        System.out.println("enter the list elements");
        Node head=new Node(sc.nextInt());
        Node current = head;
        for(int i=1;i<n;i++){
            Node ele=new Node(sc.nextInt());
            current.next=ele;
            current =current.next;
        }
        System.out.println("List is : ");
        current=head;
        while(current !=null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
        System.out.println();
        Node head2 =reverseList(head);
        System.out.println(" this is head after"+head2.data);
        Node ele2=head2;
        System.out.println("reverse list is: ");
        while(ele2!=null){
            System.out.print(ele2.data+" ");
            ele2=ele2.next;
        }
    }
    static Node reverseList(Node head){
        Node prev= null;
        while(head !=null){
            Node Next=head.next;
            head.next=prev;
            prev=head;
            head=Next;
        }
        return prev;
        }
    }


