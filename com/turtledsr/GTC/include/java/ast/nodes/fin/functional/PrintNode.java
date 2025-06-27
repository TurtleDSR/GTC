package com.turtledsr.GTC.include.java.ast.nodes.fin.functional;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractFunctionalNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class PrintNode<I, O extends Void> extends AbstractFunctionalNode<I, O> {
  AbstractSyntaxNode<I, I> output;

  public PrintNode(AbstractSyntaxNode<I, I> output) {
    this.output = output;
  }

  @Override
  public O evaluate() {
    System.out.println(output.evaluate());
    return null;
  }
}
