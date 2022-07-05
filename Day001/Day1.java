package UselessJava.Day001;

import javax.sound.midi.*;
import java.io.File;

public class Day1 {
   public static final int NOTE_ON = 0x90;
   public static final int NOTE_OFF = 0x80;
   private final double[] PITCHES = {30.868, 32.703, 36.708, 38.891, 41.203, 43.654, 46.249, 48.999, 51.913, 55, 58.27, 61.735};
   public void createNotes(String fileName) throws Exception{
      Sequence sequence = MidiSystem.getSequence(new File(fileName).getAbsoluteFile());
      int trackNumber = 0;
      for (Track track :  sequence.getTracks()) {
         trackNumber++;
         System.out.println("Track " + trackNumber + ": size = " + track.size());
         System.out.println();
         for (int i=0; i < track.size(); i++) {
            MidiEvent event = track.get(i);
            System.out.print("@" + event.getTick() + " ");
            MidiMessage message = event.getMessage();
            if (message instanceof ShortMessage) {
               ShortMessage sm = (ShortMessage) message;
               if (sm.getCommand() == NOTE_ON) {
                  int key = sm.getData1();
                  int octave = (key / 12)-1;
                  int note = key % 12;
                  double pitch = PITCHES[note] * Math.pow(2, octave);
                  int velocity = sm.getData2();
                  System.out.println("Channel: " + sm.getChannel() + ", Note on, " + pitch + " key=" + key + " velocity: " + velocity);
               } else if (sm.getCommand() == NOTE_OFF) {
                  int key = sm.getData1();
                  int octave = (key / 12)-1;
                  int note = key % 12;
                  double pitch = PITCHES[note] * Math.pow(2, octave);
                  int velocity = sm.getData2();
                  System.out.println("Channel: " + sm.getChannel() + ",Note off, " + pitch + "hz, key=" + key + " velocity: " + velocity);
               }
            }
         }
         System.out.println();
         Thread.sleep(500);
      }
   }
   
   public void playFile(String fileName) throws Exception{
      //play a midi file
      Sequence sequence = MidiSystem.getSequence(new File(new File(fileName).getAbsolutePath()));
      Sequencer sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.setSequence(sequence);
      sequencer.start();
   }
}

class Main{
   
   //get file from relative path
   
   private static final String fileName = "./Day001/midiFiles/skrillex-scary_monsters_and_nice_sprites.midi";
   
   
   public static void main(String[] args) throws Exception {
      Day1 noteSequence = new Day1();
      System.out.println(">>So, what instrument do you play?");
      Thread.sleep(2500);
      System.out.println(">>Java.");
      Thread.sleep(3000);
      System.out.println(">>...what?");
      noteSequence.playFile(fileName);
      Thread.sleep(5000);
      System.out.println(">>what the fu-");
      Thread.sleep(500);
      System.out.println(">>shhhhhhhh");
      Thread.sleep(2000);
      System.out.println(">>ahem: ");
      Thread.sleep(1000);
      noteSequence.createNotes(fileName);
      Thread.sleep(2000);
      System.out.println(">>Avi, you are going through a horrible divorce right now and the only thing you can think of is this? Really? ");
      Thread.sleep(9000);
      System.out.println(">>What do you mean this is banging");
      Thread.sleep(3500);
      System.out.println("");
   }
}
