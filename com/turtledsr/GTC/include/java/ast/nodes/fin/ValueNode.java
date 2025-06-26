package com.turtledsr.GTC.include.java.ast.nodes.fin;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public class ValueNode<I, O extends I> extends AbstractSyntaxNode<I, O> {
  private I value;
  
  public ValueNode(I value) {
    this.value = value;
  }

  @SuppressWarnings("unchecked") //we can uncheck because we already check in initializer
  @Override
  public O evaluate() {
    return (O) value;
  }
}
