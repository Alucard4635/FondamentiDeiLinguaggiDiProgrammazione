package assemblerCompiler;

@SuppressWarnings("serial")
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return errorType+", "+errorCause+", "+lineOfCode;
	}


	public String getErrorTitle() {
		String errorTitle;
		switch (errorType) {
		case UNKNOWN_INSTRUCTION:
			errorTitle="Unknown Instruction: "+errorCause;
			break;
		case UNDEFINED:
			errorTitle="Undefine: "+errorCause;
			break;
		case AlRADY_DEFINED:
			errorTitle="Already Defined";
			break;

		default:
			errorTitle="General Error";
			break;
		}
		return errorTitle;
	}

	public String getErrorMessage() {
		String errorMessage;
		switch (errorType) {
		case UNKNOWN_INSTRUCTION:
			errorMessage="Unknown instruction ";
			break;
		case UNDEFINED:
			errorMessage="Undefined ";
			break;
		case AlRADY_DEFINED:
			errorMessage="Already Defined";
			break;

		default:
			errorMessage="General Error";
			break;
		}
		if (errorCause!=null) {
			errorMessage+="Cause: "+errorCause;
		}
		if (lineOfCode>=0) {
			errorMessage+=" at line "+ lineOfCode;
		}
		return errorMessage;
	}

}
