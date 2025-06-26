package com.turtledsr.GTC.include.java.ast.nodes.fin;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractCompareNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class CompareLTENode<T extends Comparable<? super T>, O extends Boolean> extends AbstractCompareNode<T, O> {
  private AbstractSyntaxNode<T, T> param1;
  private AbstractSyntaxNode<T, T> param2;

  public CompareLTENode(AbstractSyntaxNode<T, T> operand1, AbstractSyntaxNode<T, T> operand2) {
    param1 = operand1;
    param2 = operand2;
  }

  @SuppressWarnings("unchecked") //we can suppress since we know that the casting will work
  @Override
  public O evaluate() {
    return (O) compare();
  }

  protected Boolean compare() {
    return (Boolean) (param1.evaluate().compareTo(param2.evaluate()) <= 0);
  }
}
