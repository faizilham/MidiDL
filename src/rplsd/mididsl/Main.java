package rplsd.mididsl;

import java.io.File;
import java.io.FileInputStream;

import rplsd.mididsl.compiler.MdlReader;
import rplsd.mididsl.model.MidiObject;

public class Main {
	public static void main(String[] args){
		try {
			MdlReader reader = new MdlReader();
			MidiObject midi = reader.buildModel(new FileInputStream(new File("sample.mdl")));
			System.out.println(midi);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}

