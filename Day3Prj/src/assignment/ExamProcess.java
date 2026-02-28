package assignment;

public abstract class ExamProcess {

    final String examCode;

    public ExamProcess(String examCode) {
        this.examCode = examCode;
    }

    public final void startExam(Student s) {
        System.out.println("\n--- Exam: " + examCode + " ---");

        if (!UniversityRules.isEligible(s)) {
            System.out.println("Student NOT eligible for exam!");
            return;
        }

        String ticket = UniversityRules.generateHallTicket(s.studentId);
        System.out.println("Hall Ticket: " + ticket);

        conductExam();
        int marks = evaluate();

        System.out.println("Marks: " + marks);
        System.out.println(marks >= UniversityRules.PASS_MARKS ? "PASS" : "FAIL");
    }

    abstract void conductExam();
    abstract int evaluate();

    public static class MidtermExam extends ExamProcess {
        public MidtermExam() {
            super("MIDTERM");
        }

        @Override
        void conductExam() {
            System.out.println("Conducting Midterm written test...");
        }

        @Override
        int evaluate() {
            return 78;
        }
    }

    public static void main(String[] args) {
        Student s = new Student("S101", "Pragya Shukla", 90);
        ExamProcess exam = new MidtermExam();
        exam.startExam(s);
    }
}
