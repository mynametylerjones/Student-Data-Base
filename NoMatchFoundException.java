class NoMatchFoundException extends Exception {
    /**
     * Default constructor
     */
    public NoMatchFoundException() {
        super();
    }

    /**
     * Parameterized constructor
     * @param message
     */
    public NoMatchFoundException(String message) {
       super(message);
    }

    /**
     * Parameterized constructor
     * @param message
     * @param cause
     */
    public NoMatchFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Parameterized constructor
     * @param cause
     */
    public NoMatchFoundException(Throwable cause) {
        super(cause);
    }
}