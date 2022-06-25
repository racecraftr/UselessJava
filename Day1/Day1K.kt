package UselessJava.Day1

import java.io.File
import javax.sound.midi.MidiSystem
import javax.sound.midi.ShortMessage

class Day1K {
    val NOTE_ON = 0x90
    val NOTE_OFF = 0x80
    private val PITCHES =
        doubleArrayOf(30.868, 32.703, 36.708, 38.891, 41.203, 43.654, 46.249, 48.999, 51.913, 55.0, 58.27, 61.735)

    @Throws(Exception::class)
    fun createNotes(fileName: String?) {
        val sequence = MidiSystem.getSequence(fileName?.let { File(it).absoluteFile })
        var trackNumber = 0
        for (track in sequence.tracks) {
            trackNumber++
            println("Track " + trackNumber + ": size = " + track.size())
            println()
            for (i in 0 until track.size()) {
                val event = track[i]
                print("@" + event.tick + " ")
                val message = event.message
                if (message is ShortMessage) {
                    val sm = message
                    if (sm.command == NOTE_ON) {
                        val key = sm.data1
                        val octave = key / 12 - 1
                        val note = key % 12
                        val pitch = PITCHES[note] * Math.pow(2.0, octave.toDouble())
                        val velocity = sm.data2
                        println("Channel: " + sm.channel + ", Note on, " + pitch + " key=" + key + " velocity: " + velocity)
                    } else if (sm.command == NOTE_OFF) {
                        val key = sm.data1
                        val octave = key / 12 - 1
                        val note = key % 12
                        val pitch = PITCHES[note] * Math.pow(2.0, octave.toDouble())
                        val velocity = sm.data2
                        println("Channel: " + sm.channel + ",Note off, " + pitch + "hz, key=" + key + " velocity: " + velocity)
                    }
                }
            }
            println()
            Thread.sleep(500)
        }
    }

    @Throws(Exception::class)
    fun playFile(fileName: String?) {
        //play a midi file
        val sequence = MidiSystem.getSequence(fileName?.let { File(it).absolutePath }?.let { File(it) })
        val sequencer = MidiSystem.getSequencer()
        sequencer.open()
        sequencer.sequence = sequence
        sequencer.start()
    }
}

private val fileName = "./Day1/midiFiles/skrillex-scary_monsters_and_nice_sprites.midi"

@Throws(Exception::class)
fun main() {
    val noteSequence = Day1()
    println(">>So, what instrument do you play?")
    Thread.sleep(2500)
    println(">>Java.")
    Thread.sleep(3000)
    println(">>...what?")
    noteSequence.playFile(fileName)
    Thread.sleep(5000)
    println(">>what the fu-")
    Thread.sleep(500)
    println(">>shhhhhhhh")
    Thread.sleep(2000)
    println(">>ahem: ")
    Thread.sleep(1000)
    noteSequence.createNotes(fileName)
    Thread.sleep(2000)
    println(">>Avi, you are going through a horrible divorce right now and the only thing you can think of is this? Really? ")
    Thread.sleep(9000)
    println(">>What do you mean this is banging")
    Thread.sleep(3500)
    println("")
}