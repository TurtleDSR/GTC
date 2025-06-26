package com.turtledsr.GTC;

import com.turtledsr.GTC.include.java.ast.SyntaxTree;
import com.turtledsr.GTC.include.java.ast.nodes.fin.*;

public class Main {
  public static void main(String[] args) {
    SyntaxTree<Integer, Boolean> tree = new SyntaxTree<>();
    CompareGTENode<Integer, Boolean> gte = new CompareGTENode<>(new ValueNode<Integer, Integer>(4), new ValueNode<Integer, Integer>(5));

    tree.setRoot(gte);
    System.out.println(tree.evaluate());
  }
}