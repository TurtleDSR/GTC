package com.turtledsr.GTC.include.java.ast.nodes.fin.functional;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractFunctionalNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class PrintNode<T extends Void> extends AbstractFunctionalNode<T> {
  AbstractSyntaxNode<?> output;

  public PrintNode(AbstractSyntaxNode<?> output) {
    this.output = output;
  }

  @Override
  public T evaluate() {
    System.out.println(output.evaluate());
    return null;
  }
}
