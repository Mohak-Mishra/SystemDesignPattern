package com.mishra.mohak.templateDesignPattern;

public abstract class Game {
   abstract void endPlay();
   abstract void startPlay() ;
   abstract void initialize();
   public final void play(){

       initialize();
       startPlay();
       endPlay();
   }
}
