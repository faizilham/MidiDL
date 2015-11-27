package rplsd.mididsl;

import java.io.File;
import java.io.FileInputStream;

import rplsd.mididsl.compiler.MdlReader;
import rplsd.mididsl.compiler.MidiGenerator;
import rplsd.mididsl.model.MidiObject;

public class Main {
	public static void main(String[] args) throws Exception{
		try {
			MdlReader reader = new MdlReader();
			MidiObject midi = reader.buildModel(new FileInputStream(new File("test.mdl")));
			//System.out.println(midi);
			
			MidiGenerator gen = new MidiGenerator(midi); gen.generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

