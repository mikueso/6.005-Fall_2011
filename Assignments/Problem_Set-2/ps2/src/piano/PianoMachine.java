package piano;

import javax.sound.midi.MidiUnavailableException;

import midi.Midi;
import music.Pitch;

public class PianoMachine {
	
	private Midi midi;
	private midi.Instrument instrument = Midi.DEFAULT_INSTRUMENT;
	
	/**
	 * constructor for PianoMachine.
	 * 
	 * initialize midi device and any other state that we're storing.
	 */
    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }
    
    /**
     * Turn an note event associated with the specified pitch.
     * @param rawPitch: the frequency of a musical note
     */
    public void beginNote(Pitch rawPitch) {
    	midi.beginNote(rawPitch.toMidiFrequency(), instrument);
    }
    
    /**
     * Turn off an note event associated with the specified pitch.
     * @param rawPitch: the frequency of a musical note
     */
    public void endNote(Pitch rawPitch) {
    	midi.endNote(rawPitch.toMidiFrequency(), instrument);
    }
    
    /**
     * Switch the instrument mode to the next instrument among list
     * of musical instruments. If the current instrument is the last
     * one in the musical instrument list, switch back to the first
     * instrument.
     */
    public void changeInstrument() {
    	instrument = instrument.next();
    }
    
    //TODO write method spec
    public void shiftUp() {
    	//TODO: implement for question 3
    }
    
    //TODO write method spec
    public void shiftDown() {
    	//TODO: implement for question 3
    }
    
    //TODO write method spec
    public boolean toggleRecording() {
    	return false;
    	//TODO: implement for question 4
    }
    
    //TODO write method spec
    protected void playback() {    	
        //TODO: implement for question 4
    }

}
