import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.todayIn

fun daysUntilNewYear():Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1,1,1)
    val daysOfLive = LocalDate(today.year - 22 , 1, 1)
//    return today.daysUntil(closestNewYear)
    return today.daysUntil(daysOfLive)
}

fun dayPhrase(): String = "There are only ${daysUntilNewYear()} to 🆕 Year "