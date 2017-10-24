import javax.sound.midi.*;

public class MiniMusicApp {
	
	public void play() {
		
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			Sequence seq = new Sequence(0, 4);
			
			Track track = seq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(a, 16);
			track.add(noteOff);
			
			player.setSequence(seq);
			
			player.start();
			
			System.out.println("We got a music!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Bummer");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiniMusicApp mt = new MiniMusicApp();
		mt.play();
		
	}

}
