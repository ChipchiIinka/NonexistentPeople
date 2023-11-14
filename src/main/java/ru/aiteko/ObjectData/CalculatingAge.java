package ru.aiteko.ObjectData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CalculatingAge {
    public static int CalculatingAgeFromBirthday(LocalDateTime birthday){
        return Period.between(birthday.toLocalDate(), LocalDate.now()).getYears();
    }
}
