package com.j2.command.undo;
public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  Light livingRoomLight = new Light("Living Room");

  LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
  LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

  remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
 
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
  remoteControl.offButtonWasPushed(0);
  remoteControl.onButtonWasPushed(0);
  System.out.println(remoteControl);
  remoteControl.undoButtonWasPushed();
  
 DVDPlayer DVDplayer = new DVDPlayer("Living Room"); 
 DVDPlayerOnCommand DVDplayerOn  = new DVDPlayerOnCommand(DVDplayer);
 DVDPlayerPlayCommand DVDplayerPlay = new DVDPlayerPlayCommand(DVDplayer);
 DVDPlayerOffCommand DVDplayerOff = new DVDPlayerOffCommand(DVDplayer);
 remoteControl.setCommand(0, DVDplayerOn, DVDplayerOff);
 remoteControl.setCommand(1, DVDplayerPlay, DVDplayerOff);
 remoteControl.onButtonWasPushed(0);
 remoteControl.offButtonWasPushed(0);
 System.out.println(remoteControl);
 remoteControl.undoButtonWasPushed();
 remoteControl.onButtonWasPushed(1);
 System.out.println(remoteControl);
 remoteControl.undoButtonWasPushed();
 }
}