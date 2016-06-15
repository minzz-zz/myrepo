package com.j2.forTest.command.undo;


public interface Command{
  public void execute();
  public void undo();
}