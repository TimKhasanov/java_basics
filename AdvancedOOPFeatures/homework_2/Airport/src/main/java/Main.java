import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        Date dateNow = new Date();
        Date date = new Date();
        date.setHours(date.getHours()+2);

        List<Flight> list = airport.getTerminals().stream().
                flatMap(terminal -> terminal.getFlights().stream())
                .filter(time -> time.getDate().after(dateNow))
                .filter(time -> time.getDate().before(date))
                .filter(type -> type.getType() == Flight.Type.DEPARTURE)
                .collect(Collectors.toList());

        return list;
    }

}