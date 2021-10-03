package ru.sber.datetime

import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

// 1.
fun getZonesWithNonDivisibleByHourOffset(): Set<String> {

    return ZoneId.getAvailableZoneIds()
        .filter { TimeZone.getTimeZone(it).rawOffset % 3_600_000 != 0 }.toSet()
}

// 2.
fun getLastInMonthDayWeekList(year: Int): List<String> {

    val result = mutableListOf<String>()

    for (month in 1..12) {
        result.add(YearMonth.of(year, month).atEndOfMonth().dayOfWeek.toString())
    }
    return result
}

// 3.
fun getNumberOfFridayThirteensInYear(year: Int): Int {

    var result = 0;
    for (day in 1..12) {
        val days = LocalDate.of(year, Month.of(day), 13)
        if (days.dayOfWeek == DayOfWeek.FRIDAY)
            result++
    }
    return result
}

// 4.
fun getFormattedDateTime(dateTime: LocalDateTime): String {
    val pattern = "dd MMM uuuu, HH:mm"
    val formatDateAndTime = DateTimeFormatter.ofPattern(pattern).withLocale(Locale.US)
    return formatDateAndTime.format(dateTime)
}



