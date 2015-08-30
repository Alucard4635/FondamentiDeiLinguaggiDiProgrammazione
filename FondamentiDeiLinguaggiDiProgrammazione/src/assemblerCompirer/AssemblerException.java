package assemblerCompirer;

public class AssemblerException extends RuntimeException {
	public enum AssemblerExceptionType {
		UNKNOWN_INSTRUCTION, UNDEFINED, AlRADY_DEFINED}

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
