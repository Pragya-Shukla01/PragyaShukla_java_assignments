package assignment;

public class UniversityRules {
    public static final int MIN_ATTENDANCE = 75;
    public static final int PASS_MARKS = 40;

    static int hallTicketCounter = 1000;

    public static boolean isEligible(Student s) {
        return s.attendancePercent >= MIN_ATTENDANCE;
    }

    public static String generateHallTicket(String studentId) {
        return "HT-" + studentId + "-" + (++hallTicketCounter);
    }
}
