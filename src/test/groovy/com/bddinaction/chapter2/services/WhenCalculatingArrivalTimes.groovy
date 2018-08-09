package com.bddinaction.chapter2.services;

import org.joda.time.LocalTime;
import spock.lang.Specification;

public class WhenCalculatingArrivalTimes extends Specification { //Spock tests must extend specification class

    ItineraryService itineraryService;

    def "should calculate the correct arrival time"() {
        given:
        itineraryService = new ItineraryService();
        when:
        def proposedTrainTimes = itineraryService.findNextDepartures("Parramatta", "Town Hall", at('8:00'));
        then:
        proposedTrainTimes == [at('8:02'), at('8:11'), at('8:14')]
    }

    def at(String time) {
        def hour = Integer.valueOf(time.split(":")[0]);
        def minute = Integer.valueOf(time.split(":")[1]);
        new LocalTime(hour.toInteger(), minute.toToInteger());
    }
}
