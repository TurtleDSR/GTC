package com.turtledsr.GTC.include.java.ast.nodes.def;

public abstract class AbstractProcessNode<I extends Void, O extends Void> extends AbstractSyntaxNode<I, O> {
  public abstract void pushChild(AbstractSyntaxNode<?, ?> child);
  public abstract void removeChildren();

  public abstract int getSize();
}
