package com.turtledsr.GTC.include.java.ast.nodes.def;

public abstract class AbstractCompareNode<T extends Comparable<? super T>, O extends Boolean> extends AbstractSyntaxNode<T, O> {
  protected abstract Boolean compare();
}
