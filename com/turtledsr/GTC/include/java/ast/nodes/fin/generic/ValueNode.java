package com.turtledsr.GTC.include.java.ast.nodes.fin.generic;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class ValueNode<T> extends AbstractSyntaxNode<T> {
  private T value;
  
  public ValueNode(T value) {
    this.value = value;
  }

  @Override
  public T evaluate() {
    return value;
  }
}
