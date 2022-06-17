import core.Line;
import core.Station;
import junit.framework.TestCase;


import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    List<Station> route1;
    List<Station> route2;
    List<Station> route3;
    StationIndex stationIndex;
   RouteCalculator routeCalculator;
   Station station1;
   Station station2;
   Station station3;
   Station station4;


    @Override
    protected void setUp() throws Exception {
        route1 = new ArrayList<>();
        route2 = new ArrayList<>();
        route3 = new ArrayList<>();

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");
        station1 = new Station("Чернышевская", line1);
        station2 = new Station("Площадь Восстания", line1);
        station3 = new Station("Горьковская", line2);
        station4 = new Station("Невский проспект", line2);
        route1.add(station1);
        route1.add(station2);
        route1.add(station3);
        route1.add(station4);

    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route1);
        double expected = 8.5;
        assertEquals(expected, actual);

    }

    public void testGetRouteViaConnectedLine() {

    }

    public void testGetRouteWithOneConnection() {
        List<Station> actual = routeCalculator.getShortestRoute(station1,station2);
        List<Station> expected = new ArrayList<>();
        expected.add(station1);
        expected.add(station2);
        assertEquals(expected,actual);

    }

    public void testGetRouteWithTwoConnections() {

    }
}

