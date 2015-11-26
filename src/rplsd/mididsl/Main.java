package rplsd.mididsl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import rplsd.mididsl.compiler.MdlLexer;
import rplsd.mididsl.compiler.MdlParser;
import rplsd.mididsl.compiler.MidiVisitor;
import rplsd.mididsl.model.MidiObject;

public class Main {
	public static void main(String[] args){
		try {
			MidiObject midi = buildModel(new FileInputStream(new File("sample.mdl")));
			System.out.println(midi);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static MidiObject buildModel(InputStream input) throws Exception{
		MdlLexer lexer = new MdlLexer(new ANTLRInputStream(input));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MdlParser parser = new MdlParser(tokens);
		ParseTree tree = parser.midi();
		
		MidiVisitor visitor = new MidiVisitor();
		return (MidiObject) visitor.visit(tree);
	}
}
