package assemblerCompirer;

import assemblerCompirer.AssemblerException.AssemblerExceptionType;

public class AssemblerException extends Exception {

	private int lineOfCode;
	private String errorCause;
	private AssemblerExceptionType errorType;

	public AssemblerException(AssemblerExceptionType type,
			int line, String cause) {
				errorType = type;
				lineOfCode = line;
				errorCause = cause;
	}

	public enum AssemblerExceptionType {
		UNKNOWN_INSTRUCTION, UNDEFINED};

}
