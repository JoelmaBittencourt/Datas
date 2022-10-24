package Zone

import java.time.ZoneId
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

fun main() {
    println(ZonedDateTime.now())//2022-10-24T11:26:04.966502754-03:00[America/Sao_Paulo]
    val dataAmericaSaoPaulo = ZonedDateTime.now()
    println(dataAmericaSaoPaulo.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss  ")))//24-10-2022 11:37:10
    println("------------------------")
    println(ZoneId.systemDefault())//America/Sao_Paulo
    println(ZonedDateTime.now())//2022-10-24T11:26:04.966502754-03:00[America/Sao_Paulo]
    println(ZonedDateTime.now(ZoneId.of(("Europe/Paris"))))//2022-10-24T16:26:04.967986183+02:00[Europe/Paris]
    println(ZoneId.getAvailableZoneIds())
    println(ZoneId.ofOffset("UTC", ZoneOffset.UTC))//UTC
    println(ZoneId.ofOffset("GMT", ZoneOffset.MAX))//ZoneId: GMT + 18: 00
    println(ZonedDateTime.parse("2018-07-01T10:00:00Z[America/New_York]"))//2022-10-24T16:26:04.967986183+02:00[Europe/Paris]
    println(ZonedDateTime.parse("2018-07-01T22:00:00Z[Europe/London]"))//2018-07-01T23:00+01:00[Europe/London]
    println(ZoneId.of("Europe/Paris"))//Europe/Paris

}