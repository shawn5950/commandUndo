package com.j2.command.undo;

public class DVDPlayerPullCommand implements Command {
 DVDPlayer DVDplayer;
 int prevStatus;
  
 public DVDPlayerPullCommand(DVDPlayer DVDplayer) {
  this.DVDplayer = DVDplayer;
 }
 
 public void execute() {
  prevStatus = DVDplayer.getStatus();
  DVDplayer.Pull();
 }
 
 public void undo() {
  if (prevStatus == DVDPlayer.Pull) {
   DVDplayer.Pull();
  } else if (prevStatus == DVDPlayer.Play) {
   DVDplayer.Play();
  } else if (prevStatus == DVDPlayer.Off) {
   DVDplayer.Off();
  } else if (prevStatus == DVDPlayer.On) {
   DVDplayer.On();
  } else if (prevStatus == DVDPlayer.Stop) {
    DVDplayer.Stop();
  }
 }
}