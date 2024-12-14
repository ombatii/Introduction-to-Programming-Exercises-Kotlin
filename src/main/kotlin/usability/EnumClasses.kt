package usability

enum class DayType{
    WEEKDAY, WEEKEND
}

enum class Day(val type: DayType) {
    MONDAY(DayType.WEEKDAY),
    TUESDAY(DayType.WEEKDAY),
    WEDNESDAY(DayType.WEEKDAY),
    THURSDAY(DayType.WEEKDAY),
    FRIDAY(DayType.WEEKDAY),
    SATURDAY(DayType.WEEKEND),
    SUNDAY(DayType.WEEKEND)
}

fun main() {
    val today = Day.SATURDAY
    println("Today is ${today.name} and it's a ${today.type}.")
}