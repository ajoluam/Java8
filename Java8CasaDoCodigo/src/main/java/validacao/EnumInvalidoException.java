package validacao;

public class EnumInvalidoException extends RuntimeException {
	

		private static final long serialVersionUID = 1L;

		public EnumInvalidoException(String msg) {
			super(msg);
		}

		public EnumInvalidoException(String msg, Throwable cause) {
			super(msg, cause);
		}

	

}
