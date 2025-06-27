package com.turtledsr.GTC.include.java.ast.nodes.fin.process;

import java.util.Deque;
import java.util.LinkedList;

import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractProcessNode;
import com.turtledsr.GTC.include.java.ast.nodes.def.AbstractSyntaxNode;

public class GenericProcess<T extends Void> extends AbstractProcessNode<T> {
  Deque<AbstractSyntaxNode<?>> children;

  public GenericProcess() {
    children = new LinkedList<>();
  }

  public GenericProcess(Deque<AbstractSyntaxNode<?>> children) {
    this.children = children;
  }

  @Override
  public void pushChild(AbstractSyntaxNode<?> child) {
    children.addLast(child);
  }

  @Override
  public void removeChildren() {
    children = new LinkedList<>();
  }

  @Override
  public int getSize() {
    return children.size();
  }

  @Override
  public T evaluate() {
    for (AbstractSyntaxNode<?> cur : children) {
      cur.evaluate();
    }
    return null;
  }
}
