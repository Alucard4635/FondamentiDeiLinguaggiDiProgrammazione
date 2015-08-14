package assemblyInterpreter;


public class InterpreterException extends Exception {
	public enum InterpreterExceptionType {
		UNKNOWN_INSTRUCTION, UNDEFINED}

	private int lineOfCode;
	private String errorCause;
	private InterpreterExceptionType errorType;

	public InterpreterException(InterpreterExceptionType type,
			int line, String cause) {
				errorType = type;
				lineOfCode = line;
				errorCause = cause;
	}

	public enum AssemblerExceptionType {
		UNKNOWN_INSTRUCTION, UNDEFINED}

	public int getLineOfCode() {
		return lineOfCode;
	}

	public String getErrorCause() {
		return errorCause;
	}

	public InterpreterExceptionType getErrorType() {
		return errorType;
	};

}
