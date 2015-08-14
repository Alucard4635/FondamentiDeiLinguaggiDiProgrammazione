package assemblerCompirer;

public class AssemblerException extends Exception {
	public enum AssemblerExceptionType {
		UNKNOWN_INSTRUCTION, UNDEFINED}

	private int lineOfCode;
	private String errorCause;
	private AssemblerExceptionType errorType;

	public AssemblerException(AssemblerExceptionType type,
			int line, String cause) {
				errorType = type;
				lineOfCode = line;
				errorCause = cause;
	}


	public int getLineOfCode() {
		return lineOfCode;
	}

	public String getErrorCause() {
		return errorCause;
	}

	public AssemblerExceptionType getErrorType() {
		return errorType;
	};

}
