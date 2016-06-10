package com.j2.w14.proxy;

import java.rmi.*;

public class GumballMonitor{
  GumballMachineRemote machine;
  public GumballMonitor(GumballMachineRemote machine){
    this.machine = machine;
  }
  public void report(){
    try{
      System.out.println(machine.getLocation());
      System.out.println(machine.getCount());
      System.out.println(machine.getState());
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}