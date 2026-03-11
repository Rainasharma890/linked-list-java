 class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }

}

public class LL{
    public static void main(String args[]){
      int arr[]=new int[4];
      arr[1]=2;
      arr[2]=5;
      arr[3]=6;
      arr[0]=8;
      Node node=new Node(arr[3]);
      System.out.print(node.data+"->");
    }
}