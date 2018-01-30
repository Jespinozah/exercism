import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    LocalDate birthDate;
    LocalDateTime birthDateTime;
    static final long GIGASECOND = 1000000000;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        if (birthDate != null) {
            return birthDate.atTime(0,0,0).plusSeconds(GIGASECOND);
        } else {
            return birthDateTime.plusSeconds(GIGASECOND);
        }

    }

}
