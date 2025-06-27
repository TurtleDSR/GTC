package com.turtledsr.GTC.include.java.ast.nodes.fin.compare;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractCompareNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class CompareGTNode<T extends Boolean> extends AbstractCompareNode<T> {
  private AbstractSyntaxNode<?> param1;
  private AbstractSyntaxNode<?> param2;

  public CompareGTNode(AbstractSyntaxNode<?> operand1, AbstractSyntaxNode<?> operand2) {
    param1 = operand1;
    param2 = operand2;
  }

  @SuppressWarnings("unchecked") //we can suppress since we know that the casting will work
  @Override
  public T evaluate() {
    return (T) compare();
  }

  @SuppressWarnings("unchecked")
  protected Boolean compare() {
    return (Boolean) ((((Comparable<? super Comparable<?>>) param1.evaluate()).compareTo((Comparable<? super Comparable<?>>) param2.evaluate())) > 0);
  } 
}
