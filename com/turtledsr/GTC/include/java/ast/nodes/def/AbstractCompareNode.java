package com.turtledsr.GTC.include.java.ast.nodes.def;

public abstract class AbstractCompareNode<T extends Boolean> extends AbstractSyntaxNode<T> {
  protected abstract Boolean compare();
}
