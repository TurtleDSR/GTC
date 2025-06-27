package com.turtledsr.GTC;

import com.turtledsr.GTC.include.java.ast.SyntaxTree;
import com.turtledsr.GTC.include.java.ast.nodes.fin.compare.*;
import com.turtledsr.GTC.include.java.ast.nodes.fin.conditional.*;
import com.turtledsr.GTC.include.java.ast.nodes.fin.functional.PrintNode;
import com.turtledsr.GTC.include.java.ast.nodes.fin.generic.ValueNode;

public class Main {
  public static void main(String[] args) {
    SyntaxTree<Integer, Boolean> tree = new SyntaxTree<>();
    CompareGTENode<Integer, Boolean> gte = new CompareGTENode<>(new ValueNode<Integer, Integer>(1), new ValueNode<Integer, Integer>(5));
    IfElseConditionNode<Integer, Boolean> ifdef = new IfElseConditionNode<>(gte, new PrintNode<String, Void>(new ValueNode<String, String>("Greater or equal")), new PrintNode<String, Void>(new ValueNode<String, String>("Less than")));

    tree.setRoot(ifdef);
    tree.evaluate();
  }
}