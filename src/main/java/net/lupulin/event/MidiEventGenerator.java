package net.lupulin.event;

import java.util.Random;

public class  MidiEventGenerator {

    Random rand;

    public MidiEventGenerator(){
        rand = new Random();
    }

    private int rand_0_127(){
        return rand.nextInt(128); /* 0-127 */
    }

    private int rand_0_15(){
        return rand.nextInt(16); /* 0-15 */
    }

    private int rand_1_4(){
        return rand.nextInt(4) + 1; /* 1-4 */
    }

    public MidiEvent getRandMidiEvent(){
        MidiEvent me = new MidiEvent();

        int note  =  rand_0_127();
        int dur   =  rand_1_4();
        int vel   =  rand_0_127();
        int chan  =  rand_0_15();

        me.set_note(note);
        me.set_duration(dur);
        me.set_velocity(vel);
        me.set_channel(chan);

        return me;
    }

}
