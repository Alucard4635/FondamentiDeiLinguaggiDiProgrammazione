package mainPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

import assemblyInterpreter.BytecodeProcessor;

	public class MainAssemblerInterpreter {
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
	
			BytecodeProcessor interpreter = new BytecodeProcessor();
			interpreter.loadAssemblerCode(input);
			interpreter.start();
		}
	}
