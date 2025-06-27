package com.turtledsr.GTC.include.java.ast.nodes.fin.conditional;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractCompareNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractFunctionalNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class IfElseConditionNode<T extends Boolean> extends AbstractSyntaxNode<T> {
  private AbstractCompareNode<Boolean> condition;
  private AbstractFunctionalNode<Void> execIf;
  private AbstractFunctionalNode<Void> execElse;

  public IfElseConditionNode(AbstractCompareNode<Boolean> condition, AbstractFunctionalNode<Void> executionIf, AbstractFunctionalNode<Void> executionElse) {
    this.condition = condition;
    this.execIf = executionIf;
    this.execElse = executionElse;
  }

  @SuppressWarnings("unchecked")
  @Override
  public T evaluate() {
    if (condition.evaluate()) {
      execIf.evaluate();
      return (T) Boolean.valueOf(true);
    } else {
      execElse.evaluate();
      return (T) Boolean.valueOf(false);
    }
  }
}
