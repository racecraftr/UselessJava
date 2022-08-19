package UselessJava.days.Day074

import java.util.*
import javax.sound.midi.MidiSystem
import javax.sound.midi.MidiUnavailableException

class Day74K {
  companion object{
    @Throws(MidiUnavailableException::class, InterruptedException::class)
    fun playString(s: String) {
      var s = s
      s = s.uppercase(Locale.getDefault())
      val midiSynth = MidiSystem.getSynthesizer()
      midiSynth.open()
      val instr = midiSynth.defaultSoundbank.instruments
      val mChannels = midiSynth.channels
      for (i in 0 until s.length) {
        val instrument = (Math.random() * instr.size).toInt()
        val channel = (Math.random() * mChannels.size).toInt()
        midiSynth.loadInstrument(instr[instrument]) //load an instrument
        val note = s[i].code
        mChannels[channel].noteOn(note, 100)
        Thread.sleep(400)
        mChannels[channel].noteOff(note)
      }
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true){
    println("Enter a string.")
    val s = sc.nextLine();
    Day74K.playString(s)
  }
}