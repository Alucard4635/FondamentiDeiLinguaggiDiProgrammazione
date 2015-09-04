package mainPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import pieGrammar.PieGrammarLexer;
import pieGrammar.PieGrammarParser;
import pieGrammar.PieGrammarParser.*;
import pieTraduction.Pie2Assembler;
import pieTraduction.PieTraductor;
import profClass.Validator;
import assemblerCompiler.AssemblerException;
import assemblyInterpreter.InterpreterException;

	public class MainPieTraductor {
		public static void main(String[] args) throws Exception {
			String filename = null;
			
			if (args.length > 0) {
				filename = args[0];
			}
			InputStream input = null;
			if (filename != null)
				input = new FileInputStream(filename);
			else {
				JFileChooser fc = new JFileChooser(new File(".").getCanonicalPath());
				fc.setMultiSelectionEnabled(false);
				int responce = fc.showOpenDialog(null);
				if (responce == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fc.getSelectedFile();
					input = new FileInputStream(selectedFile);
	
				} else if (responce == JFileChooser.ERROR_OPTION) {
					System.err.println("error while opening JFileChooser");
					System.out.println("Enter File Name: ");
					BufferedReader bufferedReader = new BufferedReader(
							new InputStreamReader(System.in));
					filename = bufferedReader.readLine();
					input = new FileInputStream(filename);
				} else {
					System.exit(0);
				}
	
			}
	
			PieGrammarLexer assemblerLexer = new PieGrammarLexer(
					new ANTLRInputStream(input));
			CommonTokenStream tokens = new CommonTokenStream(assemblerLexer);
			PieGrammarParser assembler = new PieGrammarParser(tokens);
			ParseTree tree = assembler.program();
			ParseTreeWalker walker = new ParseTreeWalker();
			
			Validator eval = new Validator();
			walker.walk(eval, tree); // walk parse tree
			
		}

		private static void showError(Exception e) throws Exception {
			if (e instanceof AssemblerException) {
				AssemblerException assemblerExc=(AssemblerException) e;
				showError(assemblerExc);
			}else if (e instanceof InterpreterException) {
				InterpreterException interpreterExc=(InterpreterException) e;
				showError(interpreterExc);
			}else {
				throw e;
			}
		}

		private static void showError(InterpreterException interpreterExc) {
			String title = interpreterExc.getErrorTitle();
			String message = interpreterExc.getErrorMessage();
			
			showErrorMessage(title, message);
		}

		private static void showErrorMessage(String title, String message) {
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		}

		private static void showError(AssemblerException e) {
			String title = e.getErrorTitle();
			String message = e.getErrorMessage();
			
			showErrorMessage(title, message);
		}
	}
