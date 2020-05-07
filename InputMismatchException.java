class InputMismatchException extends Exception {
    /**
     * Default constructor
     */
    public InputMismatchException() {
        super();
    }

    /**
     * Parameterized constructor
     * @param message
     */
    public InputMismatchException(String message) {
       super(message);
    }

    /**
     * Parameterized constructor
     * @param message
     * @param cause
     */
    public InputMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Parameterized constructor
     * @param cause
     */
    public InputMismatchException(Throwable cause) {
        super(cause);
    }
}