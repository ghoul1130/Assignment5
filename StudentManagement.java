class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String msg) {
        super(msg);
    }
}

class InvalidIdException extends RuntimeException {
    public InvalidIdException(String msg) {
        super(msg);
    }
}

class Student {
    int id;
    String name;
    public Student(int id, String name) {
        if (id <= 0) throw new InvalidIdException("Invalid ID: " + id);
        this.id = id;
        this.name = name;
    }
}

class StudentManagement {
    Student[] students = {
            new Student(1, "Alice"),
            new Student(2, "Bob")
    };

    public Student findStudent(int id) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.id == id)
                return s;
        }
        throw new StudentNotFoundException("Student not found with ID: " + id);
    }
}
