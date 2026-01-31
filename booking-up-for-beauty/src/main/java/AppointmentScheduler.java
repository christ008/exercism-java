import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        var parser = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        var time = appointmentDate.toLocalTime();
        return !time.isBefore(LocalTime.NOON) && time.isBefore(LocalTime.NOON.plusHours(6));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        var pattern = DateTimeFormatter.ofPattern("eeee, MMMM d, yyyy, 'at' K:mm a'.'");
        return "You have an appointment on " + pattern.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
