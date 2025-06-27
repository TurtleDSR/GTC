package com.turtledsr.GTC.include.java.ast.nodes.fin.conditional;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractCompareNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractFunctionalNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class IfConditionNode<I extends Comparable<? super I>, O extends Boolean> extends AbstractSyntaxNode<I, O> {
  private AbstractCompareNode<I, Boolean> condition;
  private AbstractFunctionalNode<?, Void> exec;

  public IfConditionNode(AbstractCompareNode<I, Boolean> condition, AbstractFunctionalNode<?, Void> execution) {
    this.condition = condition;
    this.exec = execution;
  }

  @SuppressWarnings("unchecked")
  @Override
  public O evaluate() {
    if(condition.evaluate()) {
      exec.evaluate();
      return (O) Boolean.valueOf(true);
    }
    return (O) Boolean.valueOf(false);
  }
}
