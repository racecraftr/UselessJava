package UselessJava.days.Day074;

import javax.sound.midi.*;
import java.util.Scanner;

public class Day74 {
  static void playString(String s) throws MidiUnavailableException, InterruptedException {
    s = s.toUpperCase();
    Synthesizer midiSynth = MidiSystem.getSynthesizer();
    midiSynth.open();
    Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
    MidiChannel[] mChannels = midiSynth.getChannels();
    
    for(int i = 0; i < s.length(); i++) {
      int instrument = (int)(Math.random() * instr.length);
      int channel = (int)(Math.random() * mChannels.length);
      
      midiSynth.loadInstrument(instr[instrument]);//load an instrument
      int note = s.charAt(i);
      mChannels[channel].noteOn(note, 100);
      Thread.sleep(400);
      mChannels[channel].noteOff(note);
    }
  }
  
  public static void main(String[] args) throws MidiUnavailableException, InterruptedException {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter a string.");
      String s = sc.nextLine();
      playString(s);
    }
  }
}