package com.turtledsr.GTC;

import com.turtledsr.GTC.include.java.ast.SyntaxTree;
import com.turtledsr.GTC.include.java.ast.nodes.fin.compare.CompareGTNode;
import com.turtledsr.GTC.include.java.ast.nodes.fin.conditional.IfElseConditionNode;
import com.turtledsr.GTC.include.java.ast.nodes.fin.functional.PrintNode;
import com.turtledsr.GTC.include.java.ast.nodes.fin.generic.ValueNode;

public class Main {
  public static void main(String[] args) {
    SyntaxTree tree = new SyntaxTree();
    CompareGTNode<Boolean> gt = new CompareGTNode<Boolean>(new ValueNode<Integer>(5), new ValueNode<Integer>(5));
    IfElseConditionNode<Boolean> ifdef = new IfElseConditionNode<>(gt, new PrintNode<>(new ValueNode<String>("greater")), new PrintNode<>(new ValueNode<String>("not greater")));

    tree.setRoot(ifdef);
    tree.evaluate();
  }
}