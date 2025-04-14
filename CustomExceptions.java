class DuplicateStudentException extends RuntimeException {
    public DuplicateStudentException(String msg) {
        super(msg);
    }
}

class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String msg) {
        super(msg);
    }
}
