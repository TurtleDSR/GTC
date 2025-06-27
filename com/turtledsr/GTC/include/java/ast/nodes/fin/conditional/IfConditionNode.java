package com.turtledsr.GTC.include.java.ast.nodes.fin.conditional;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractCompareNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractFunctionalNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public final class IfConditionNode<T extends Boolean> extends AbstractSyntaxNode<T> {
  private AbstractCompareNode<Boolean> condition;
  private AbstractFunctionalNode<Void> exec;

  public IfConditionNode(AbstractCompareNode<Boolean> condition, AbstractFunctionalNode<Void> execution) {
    this.condition = condition;
    this.exec = execution;
  }

  @SuppressWarnings("unchecked")
  @Override
  public T evaluate() {
    if(condition.evaluate()) {
      exec.evaluate();
      return (T) Boolean.valueOf(true);
    }
    return (T) Boolean.valueOf(false);
  }
}
