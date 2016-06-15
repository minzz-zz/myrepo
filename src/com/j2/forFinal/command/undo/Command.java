package com.j2.forFinal.command.undo;


public interface Command{
  public void execute();
  public void undo();
}