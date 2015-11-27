package rplsd.mididsl.compiler;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import rplsd.mididsl.model.MidiObject;

public class MdlReader {
	public MdlReader(){}
	
	public ParseTree parse(InputStream input) throws IOException{
		MdlLexer lexer = new MdlLexer(new ANTLRInputStream(input));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MdlParser parser = new MdlParser(tokens);
		return parser.midi();
	}
	
	public MidiObject buildModel(InputStream input) throws IOException{
		ParseTree tree = parse(input);
		
		MidiVisitor visitor = new MidiVisitor();
		return (MidiObject) visitor.visit(tree);
	}
}
