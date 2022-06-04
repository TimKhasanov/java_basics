import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        Date dateNow = new Date();
        Date input = new Date();
        LocalDateTime date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().plusHours(2);
        Date out = Date.from(date.atZone(ZoneId.systemDefault()).toInstant());


        List<Flight> list = airport.getTerminals().stream().
                flatMap(terminal -> terminal.getFlights().stream())
                .filter(time -> time.getDate().after(dateNow))
                .filter(time -> time.getDate().before(out))
                .filter(type -> type.getType() == Flight.Type.DEPARTURE)
                .collect(Collectors.toList());

        return list;
    }
}