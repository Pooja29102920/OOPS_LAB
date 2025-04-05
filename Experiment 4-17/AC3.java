abstract class Instrument {
    abstract void playNote();
    abstract void record();
    abstract void adjustVolume();
}

class Piano extends Instrument {
    @Override
    void playNote() {
        System.out.println("Playing note on Piano");
    }
    
    @Override
    void record() {
        System.out.println("Recording Piano performance");
    }
    
    @Override
    void adjustVolume() {
        System.out.println("Adjusting Piano volume");
    }
}

class Guitar extends Instrument {
    @Override
    void playNote() {
        System.out.println("Playing note on Guitar");
    }
    
    @Override
    void record() {
        System.out.println("Recording Guitar performance");
    }
    
    @Override
    void adjustVolume() {
        System.out.println("Adjusting Guitar volume");
    }
}

class DrumMachine extends Instrument {
    @Override
    void playNote() {
        System.out.println("Playing beat on Drum Machine");
    }
    
    @Override
    void record() {
        System.out.println("Recording Drum Machine performance");
    }
    
    @Override
    void adjustVolume() {
        System.out.println("Adjusting Drum Machine volume");
    }
}

public class AC3 {
    public static void main(String[] args) {
        Instrument piano = new Piano();
        piano.playNote();
        piano.record();
        piano.adjustVolume();
        
        Instrument guitar = new Guitar();
        guitar.playNote();
        guitar.record();
        guitar.adjustVolume();
        
        Instrument drumMachine = new DrumMachine();
        drumMachine.playNote();
        drumMachine.record();
        drumMachine.adjustVolume();
    }
}
