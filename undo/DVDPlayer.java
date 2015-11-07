package com.j2.command.undo;

public class DVDPlayer {
 public static final int Stop = 4;
 public static final int Pull = 3;
 public static final int Play = 2;
 public static final int Off = 1;
 public static final int On = 0;
 String location;
 int status;
 
 public DVDPlayer(String location) {
  this.location = location;
  status = Off;
 }
  
 public void Pull() {
  status = Pull;
  System.out.println(location + "DVDplayer is pulling DVD");
 } 
 
 public void Play() {
  status = Play;
  System.out.println(location + "DVDplayer is playing");
 }
 
 public void Off() {
  status = Off;
  System.out.println(location + " DVDplayer is off");
 }
  
 public void On() {
  status = On;
  System.out.println(location + "DVDplayer is on");
 }
 
 public void Stop() {
   status = Stop;
   System.out.println(location + "DVDplayer is stop");
 }
   
  
 public int getStatus() {
  return status;
 }
}