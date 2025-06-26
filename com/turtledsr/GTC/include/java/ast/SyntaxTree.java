package com.turtledsr.GTC.include.java.ast;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public class SyntaxTree<I, O> {
  private AbstractSyntaxNode<I, O> root;

  public Object evaluate() { //recursively evaluates tree
    return root.evaluate();
  }

  public void setRoot(AbstractSyntaxNode<I, O> root) {
    this.root = root;
  }
}
