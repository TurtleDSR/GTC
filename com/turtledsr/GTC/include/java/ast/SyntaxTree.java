package com.turtledsr.GTC.include.java.ast;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public class SyntaxTree {
  private AbstractSyntaxNode<?> root;

  public Object evaluate() { //recursively evaluates tree
    return root.evaluate();
  }

  public void setRoot(AbstractSyntaxNode<?> root) {
    this.root = root;
  }
}
