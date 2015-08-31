package assemblyInterpreter;


@SuppressWarnings("serial")
public class InterpreterException extends Exception {
	public enum InterpreterExceptionType {
		UNKNOWN_INSTRUCTION, UNDEFINED, NO_MAIN, OUT_OF_MEMORY, NO_ELEMENT_ON_STACK}

	private int lineOfCode=-1;
	private String errorCause;
	private InterpreterExceptionType errorType;

	public InterpreterException(InterpreterExceptionType type,
			int line, String cause) {
				errorType = type;
				lineOfCode = line;
				errorCause = cause;
	}

	public InterpreterException(InterpreterExceptionType noMain) {
		errorType = noMain;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return errorType.toString()+" "+lineOfCode+" "+errorCause;
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
		case NO_MAIN:
			errorTitle="Main Not Found";
			break;
			
		case OUT_OF_MEMORY:
			errorTitle="Out Of Memory";
			break;
		case NO_ELEMENT_ON_STACK:
			errorTitle="No Element on stack";
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
		case NO_MAIN:
			errorMessage="Main Not Found";
			break;
		case OUT_OF_MEMORY:
			errorMessage="Out Of Memory";
			break;
		case NO_ELEMENT_ON_STACK:
			errorMessage="No element on stack";
			break;
			
		default:
			errorMessage="General Error";
			break;
		}
		if (errorCause!=null) {
			errorMessage+="Cause: "+errorCause;
		}
		if (lineOfCode>=0) {
			errorMessage+=" at byte "+ lineOfCode;
		}
		return errorMessage;
	}
}
