package pwo.lab09.factory;

import java.time.DayOfWeek;
import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class _run {
    
    public static void main(String args[]) {
        
        MessageFactory factory = null;
        
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = DayOfWeek.of(today.get(ChronoField.DAY_OF_WEEK));
        
        switch(dayOfWeek) {         
            case MONDAY : factory = new Monday(); break;
            case TUESDAY : factory = new Tuesday(); break;
            case WEDNESDAY : /* ? */ break;
            case THURSDAY: /* ? */ break;
            case FRIDAY: /* ? */ break;
            case SATURDAY:  /* ? */ break;
            case SUNDAY: /* ? */ break;
        }
        
        System.out.println(factory.createIntroMessage());
        System.out.println(factory.createMainMessage());
        System.out.println(factory.createClosingMessage());
    }
}