package com.turtledsr.GTC.include.java.ast.nodes.fin.conditional;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractCompareNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractFunctionalNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class IfElseConditionNode<I extends Comparable<? super I>, O extends Boolean> extends AbstractSyntaxNode<I, O> {
  private AbstractCompareNode<I, Boolean> condition;
  private AbstractFunctionalNode<?, Void> execIf;
  private AbstractFunctionalNode<?, Void> execElse;

  public IfElseConditionNode(AbstractCompareNode<I, Boolean> condition, AbstractFunctionalNode<?, Void> executionIf, AbstractFunctionalNode<?, Void> executionElse) {
    this.condition = condition;
    this.execIf = executionIf;
    this.execElse = executionElse;
  }

  @SuppressWarnings("unchecked")
  @Override
  public O evaluate() {
    if (condition.evaluate()) {
      execIf.evaluate();
      return (O) Boolean.valueOf(true);
    } else {
      execElse.evaluate();
      return (O) Boolean.valueOf(false);
    }
  }
}
