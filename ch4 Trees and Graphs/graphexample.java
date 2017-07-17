import java.util.*;
class Node{
  int data;
  int[] nodeChildren;
  int count;

  Node(int d){
    data=d;
    count=0;
    nodeChildren = new int[10];
  }

  void insertChildren(int[] children)
  {
    count=5;
    for(int i=0; i<5; i++)
      nodeChildren[i] = children[i];
  }

  void outputChildren()
  {
    for(int i=0; i<count; i++)
      System.out.println(nodeChildren[i]);
  }
}

class Graph{
  Node[] nodes;
  int count;
  Graph()
  {
      count=0;
      nodes = new Node[10];
  }

  void insertNode(int d, int[] children)
  {
    nodes[count] = new Node(d);
    nodes[count].insertChildren(children);
    count++;
  }

  void outputNode()
  {
    for(int i=0; i<count; i++)
      { System.out.println(nodes[i]);
        nodes[i].outputChildren();
      }
  }
}

class graphexample
{
  public static void main(String[] args) {

    Graph graph = new Graph();
    int children[] = {2,0,1,3,4};
    graph.insertNode(4,children);
    graph.outputNode();

  }
}
