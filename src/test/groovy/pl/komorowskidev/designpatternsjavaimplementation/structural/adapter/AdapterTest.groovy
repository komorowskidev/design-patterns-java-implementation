package pl.komorowskidev.designpatternsjavaimplementation.structural.adapter

import pl.komorowskidev.designpatternsjavaimplementation.structural.adapter.Adapter
import pl.komorowskidev.designpatternsjavaimplementation.structural.adapter.SomeLibraryPointOnMap
import spock.lang.Specification

class AdapterTest extends Specification {

    private Adapter adapter

    private SomeLibraryPointOnMap someLibraryPointOnMapMock

    def setup(){
        someLibraryPointOnMapMock = Mock(SomeLibraryPointOnMap)
        adapter = new Adapter(someLibraryPointOnMapMock)
    }

    def "should call setLat on adaptee when setLatitude"(){
        given:
        double value = 1.0

        when:
        adapter.setLatitude(value)

        then:
        1 * someLibraryPointOnMapMock.setLat(value)
    }

    def "should call setLon on adaptee when setLongitude"(){
        given:
        double value = 2.0

        when:
        adapter.setLongitude(value)

        then:
        1 * someLibraryPointOnMapMock.setLon(value)
    }

    def "should call setAlt on adaptee when setAltitudeMetersAboveMeanSeaLevel"(){
        given:
        double value = 3.0

        when:
        adapter.setAltitudeMetersAboveMeanSeaLevel(value)

        then:
        1 * someLibraryPointOnMapMock.setAlt(value)
    }

    def "should call toString on adaptee when getPoint"(){
        given:
        String expected = "returned value"
        someLibraryPointOnMapMock.toString() >> expected

        when:
        String actual = adapter.getPoint()

        then:
        actual.equals(expected)
    }
}
