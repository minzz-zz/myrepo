package com.j2.w9.command.undo;



public interface Command{
  public void execute();
  public void undo();
}