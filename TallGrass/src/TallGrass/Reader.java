package TallGrass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import TallGrass.parser.*; 
import TallGrass.AST.*;

public class Reader {
	
	public Program read() throws IOException {
		String programText = readNextProgram();
		return parse(programText);
	}
	
	public Program parse(String programText) {
		Lexer l = getLexer(new org.antlr.v4.runtime.ANTLRInputStream(programText));
		TallGrassParser p = getParser(new org.antlr.v4.runtime.CommonTokenStream(l));
		Program program = p.program().ast;
		return program;
	}
	
	protected Lexer getLexer(org.antlr.v4.runtime.ANTLRInputStream s) {
		return new TallGrassLexer(s);
	}
	
	protected TallGrassParser getParser(org.antlr.v4.runtime.CommonTokenStream s) {
		return new TallGrassParser(s);
	}
			
	protected String readNextProgram() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("$ ");
		String programText = br.readLine();
		return runFile(programText);
	}

	protected String getProgramDirectory() { return "build"+File.separator+"TallGrass"+File.separator+"examples"+File.separator; }
	protected String runFile(String programText) throws IOException {
		if(programText.startsWith("run ")){
			programText = readFile(getProgramDirectory() + programText.substring(4));
		}
		return programText; 
	}
	
	private String readFile(String fileName) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader(fileName))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		}
	}

}
