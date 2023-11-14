package ru.aiteko.ObjectData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CalculatingAge {
    public static int CalculatingAgeFromBirthday(LocalDateTime birthday){
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDate birthDate = birthday.toLocalDate();
        LocalDate currentDate = currentDateTime.toLocalDate();

        return Period.between(birthDate, currentDate).getYears();
    }
}
