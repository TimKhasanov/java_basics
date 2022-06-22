
import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    List<Station> route;
    List<Station> withoutTransfers;
    List<Station> oneTransfer;
    List<Station> twoTransfers;
    StationIndex stationIndex;

    @Override
    protected void setUp() throws Exception {
        stationIndex = new StationIndex();
        route = new ArrayList<>();
        withoutTransfers = new ArrayList<>();
        oneTransfer = new ArrayList<>();
        twoTransfers = new ArrayList<>();


        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");
        Station station = new Station("Василеостровская", line1);
        Station station1 = new Station("Гостиный двор", line1);
        Station station2 = new Station("Маяковская", line1);
        Station station3 = new Station("Невский проспект", line2);
        Station station4 = new Station("Горьковская", line2);
        Station station5 = new Station("Площадь Восстания", line3);
        Station station6 = new Station("Чернышевская", line3);

        //линии
        line1.addStation(station);
        line1.addStation(station1);
        line1.addStation(station2);

        line2.addStation(station3);
        line2.addStation(station4);

        line3.addStation(station5);
        line3.addStation(station6);

        route.add(station);
        route.add(station2);
        route.add(station3);
        withoutTransfers.add(station);
        withoutTransfers.add(station1);


        oneTransfer.add(station2);
        oneTransfer.add(station3);


        twoTransfers.add(station2);
        twoTransfers.add(station5);

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        stationIndex.addStation(station);
        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);

        stationIndex.addConnection(oneTransfer);
        stationIndex.addConnection(twoTransfers);
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 6.0;
        assertEquals(expected, actual);

    }

    public void testGetRouteViaConnectedLine() {
        RouteCalculator calculator = new RouteCalculator(stationIndex);
        Station station = stationIndex.getStation("Василеостровская");
        Station station1 = stationIndex.getStation("Гостиный двор");
        List<Station> actual = calculator.getShortestRoute(station, station1);
        List<Station> expected = withoutTransfers;
        assertEquals(expected, actual);


    }

    public void testGetRouteWithOneConnection() {
        RouteCalculator calculator = new RouteCalculator(stationIndex);
        Station station2 = stationIndex.getStation("Маяковская", 1);
        Station station3 = stationIndex.getStation("Невский проспект", 2);
        List<Station> actual = calculator.getShortestRoute(station2, station3);
        List<Station> expected = oneTransfer;
        assertEquals(expected, actual);

    }

    public void testGetRouteWithTwoConnections() {
        RouteCalculator calculator = new RouteCalculator(stationIndex);
        Station station1 = stationIndex.getStation("Маяковская");
        Station station4 = stationIndex.getStation("Площадь Восстания");
        List<Station> expected = twoTransfers;
        List<Station> actual = calculator.getShortestRoute(station1,station4);
        assertEquals(expected, actual);
    }
}

