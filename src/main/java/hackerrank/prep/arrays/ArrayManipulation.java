package hackerrank.prep.arrays;

import java.util.Optional;

public class ArrayManipulation {

  long arrayManipulation(int n, int[][] queries) {

    Node head = null;
    for(int[] intSet: queries){
      int start = intSet[0];
      int end = intSet[1];
      long val = (long)intSet[2];
      if(head == null){
        head = new Node(start, end, val);
      }else if(end < head.start){
        Node node = new Node(start, end, val, head);
        head = node;
      }else{
        Node current = head;
        while(start > current.end) {
          if (current.next == null) {
            Node node = new Node(start, end, val, head);
            current.next = node;
            current = node;
          }
          current = current.next;
        }
        Optional<Node> before = current.getBefore(start, end, val);
        Node overlap = current.getOverlap(start, end, val);
        Optional<Node> after = current.getAfter(start, end, val);
        }

    }
    return 5;

  }
  class Node{
    private Node next;
    private int start;
    private int end;
    private long value;
    public Node(int start, int end, long value) {
      this.start = start;
      this.end = end;
      this.value = value;
    }

    public Node(int start, int end, long value, Node next) {
      this.start = start;
      this.end = end;
      this.value = value;
      this.next = next;
    }

    public boolean endsSame() {
      return start == end;
    }

    @Override
    public String toString() {
      return String.format("%s:%s=%s%s",start,end,value,next==null?"":" "+next.toString());
    }

    public Optional<Node> getBefore(int start, int end, long val) {
      return Optional.empty();
    }

    public Node getOverlap(int start, int end, long val) {
      return new Node(start, end, val);
    }

    public Optional<Node> getAfter(int start, int end, long val) {
      return Optional.empty();
    }
  }

}
