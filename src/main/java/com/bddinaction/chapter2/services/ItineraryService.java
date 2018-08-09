package com.bddinaction.chapter2.services;

import com.bddinaction.chapter2.model.Line;
import com.google.common.collect.Lists;
import org.joda.time.LocalTime;

import java.util.List;

public class ItineraryService {

    public List<LocalTime> findNextDeparture(String departure, String destination, LocalTime startTime) {

        List<Line> lines = timetableService.findLinesThrough(departure, destination);
        List<LocalTime> allArrivalTimes = getArrivalTimesOnLines(lines, departure);
        List<LocalTime> candidateArrivalTimes = findArrivalTimesAfter(startTime, allArrivalTimes);
    }

    private List<LocalTime> atMost(int max, List<LocalTime> times) {
        return Lists.partition(times, max).get(0);
    }
}
