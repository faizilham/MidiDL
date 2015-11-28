package rplsd.mididsl;

import java.io.File;
import java.io.FileInputStream;

import rplsd.mididsl.compiler.MdlReader;
import rplsd.mididsl.compiler.MidiGenerator;
import rplsd.mididsl.model.MidiObject;

public class Main {
	public static void main(String[] args) throws Exception{
		String outputfile = null;
		if (args.length < 1) {
			System.out.println("Usage example: mididl input.mdl [output.midi].");
			System.out.println("If no output file, it will play the generated midi.");
		}
		
		String inputfile = args[0];
		if (args.length > 1){
			outputfile = args[1];
		}
				
		try {
			MdlReader reader = new MdlReader();
			System.out.println("Generate midi");
			MidiObject midi = reader.buildModel(new FileInputStream(new File(inputfile)));
			MidiGenerator gen = new MidiGenerator(midi);
			
			if (outputfile == null){
				System.out.println("Playing midi");
				gen.play();
			} else {
				System.out.println("Output file: " + outputfile);
				gen.write(new File(outputfile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

