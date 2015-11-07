package com.j2.command.undo;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        DVDPlayer DVDplayer = new DVDPlayer();
        DVDPlayerPlayCommand DVDplayerPlay = new DVDPlayerPlayCommand(DVDplayer);
        
 
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
        remote.setCommand(DVDplayerPlay);
        remote.buttonWasPressed();
        
      
        
    }
}