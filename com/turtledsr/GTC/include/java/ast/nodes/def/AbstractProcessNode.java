package com.turtledsr.GTC.include.java.ast.nodes.def;

public abstract class AbstractProcessNode<T extends Void> extends AbstractSyntaxNode<T> {
  public abstract void pushChild(AbstractSyntaxNode<?> child);
  public abstract void removeChildren();

  public abstract int getSize();
}
