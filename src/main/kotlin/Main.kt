//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}
//package com.api.parkingcontrol
//
//import java.text.SimpleDateFormat
//import java.time.LocalDate
//import java.time.LocalDateTime
//import java.time.LocalTime
//import java.time.format.DateTimeFormatter
//import java.time.format.DateTimeFormatterBuilder
//
////COMO CRIAR UMA DATA E COMO CRIAR UMA DATA BASEADA EM STRING "14/10/2022"
//
//private fun LocalTime.format(localizedDateTimePattern: String?): String? {
//    return localizedDateTimePattern
//}
//
////declarar a variavel
////tipo dela, se for classe precisa ser letra maiuscula
//fun main() {
//    var datahora: LocalDateTime  //data/hora
//    var data: LocalDate//DATAS
//    var horas: LocalTime//horas
//    var stringToDate = "14102022"
//    val formato = SimpleDateFormat("dd/MM/yyyy")
//    val data2 = formato.parse("23/11/2015")
//
//    println("Loading data from NOW  data e hora "+ LocalDateTime.now())
//    println("Loading data from NOW data "+ LocalDate.now())
//    println("Loading data from NOW horas "+ LocalTime.now())
//    println("de string para data" + SimpleDateFormat("dd/MM/yyyy").parse(stringToDate).time)
//    println("------------------------------------------------------------------------------------")
//    var datahoraFormatada: LocalDateTime  //data/hora
//    var dataFormatada: LocalDate//DATAS
//    var horasFormatada: LocalTime//horas
//
//    println("Loading data from NOW  data e hora formatada "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")))
//    println("Loading data from NOW data formatada padrão YY "+ LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/YY")))
//    println("Loading data from NOW data formatada padrão Y "+ LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/Y")))
//    println("------------------------------------------------------------------------------------")
//    println("O formatador de data ISO que formata ou analisa uma data sem deslocamento, como '20111203'."+ LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE))//dando erro
//    println("O formatador de data ISO que formata ou analisa uma data com o deslocamento, se disponível, como '2011-12-03' ou '2011-12-03+01:00'. "+ LocalDateTime.now().format(DateTimeFormatter.ISO_DATE))//dando erro
//    println("O formatador de data e hora tipo ISO que formata ou analisa uma data e hora com o deslocamento e a zona, se disponível, como '2011-12-03T10:15:30', '2011-12-03T10:15:30+01 :00' ou '2011-12-03T10:15:30+01:00[Europa/Paris]'."+ LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME))//dando erro
//
//    //println("O O formatador instantâneo ISO que formata ou analisa um instante em UTC, como '2011-12-03T10:15:30Z'.'. "+ LocalDateTime.now().format(DateTimeFormatter.ISO_INSTANT))//dando erro
//    println("O formatador de data ISO que formata ou analisa uma data sem deslocamento, como '20111203. "+ LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE))
//
//    //println("Loading data from NOW data formatada padrão br "+ LocalDateTime.now().format(DateTimeFormatter.ISO_INSTANT))//dando erro
//
//
////    println("Loading data from NOW data formatada  "+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
////    println("Loading data from NOW horas formatada  "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")))
//
//
//
//
//
////
////    println("-------------1 -------------------")
////    val dateString = "14 October, 2022"
////    val formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy")//2022-10-14
////    val date = LocalDate.parse(dateString, formatter)
////    println("data formatada 14/10/2022  $date")
////
////    println("------------2 -------------------")
////    val dataformatada = "14/10/2022"
////    val formatacao = SimpleDateFormat("dd/MM/yyyy") //31/12/1969
////    val calendario = Calendar.YEAR
////    println(formatacao.format(calendario))
////
////    println("------------3-------------------")
////    val localDate = LocalDate.parse("2022-01-06")//2022-01-06
////    println(localDate)
////
////    println("------------4-------------------")//2022-01-06
////    val localDate2 = LocalDate.parse("01-06-2022", DateTimeFormatter.ofPattern("MM-dd-yyyy"))
////    println(localDate2)
////
////    println("------------5------------------")//2022-01-06T20:30:45
////    val text = "2022-01-06 20:30:45"
////    val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
////    val localDateTime = LocalDateTime.parse(text, pattern)
////    println(localDateTime)
////
////
////    println("------------6------------------")//2022-01-06T20:30:45-08:00[America/Los_Angeles]
////    val text0 = "2022-01-06 20:30:45 America/Los_Angeles"
////    val pattern0 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")
////    val zonedDateTime = ZonedDateTime.parse(text0, pattern0)
////    println(zonedDateTime)
////
////    println("------------7------------------")
////
////    println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/Y")))//20/10/2022
////
////    println("------------------8-------------------")
////    val datas = "13 Janeiro, 2016"
////    val  formats = DateTimeFormatter.ofPattern("d MMMM, yyyy")
////
////    val localDate5 = LocalDate.parse(datas, formats)
////    println(localDate5)
////
//
//
//    fun main() {
//
//        println("-------------1 -------------------")
//        val dateString = "1 October, 2022"
//        val formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy")//2022-10-14
//        val formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy")//2022-10-14
//        val date = LocalDate.parse(dateString, formatter)
//        println("data formatada   $date")
//        println(date.format(formatter2))
//
//
//
//        println("-------------2-------------------")
//        val dateBrasil = "20/10/2022"
//        val transfData = LocalDate.parse(dateBrasil, formatter2)
//        println(transfData.format(formatter2))
//
//        println("------------4-------------------")//2022-01-06
//        val localDate2 = LocalDate.parse("14-10-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"))
//        println(localDate2)
//
//        println(
//            "Loading data from NOW data formatada padrão YY " + LocalDate.now()
//                .format(DateTimeFormatter.ofPattern("dd/MM/YY"))
//        )
//
//
//
////COMO CRIAR UMA DATA E COMO CRIAR UMA DATA BASEADA EM STRING "14/10/2022"
//
//
////
////    println("-------------1 -------------------")
////    val dateString = "14 October, 2022"
////    val formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy")//2022-10-14
////    val date = LocalDate.parse(dateString, formatter)
////    println("data formatada 14/10/2022  $date")
////
////    println("------------2 -------------------")
////    val dataformatada = "14/10/2022"
////    val formatacao = SimpleDateFormat("dd/MM/yyyy") //31/12/1969
////    val calendario = Calendar.YEAR
////    println(formatacao.format(calendario))
////
////    println("------------3-------------------")
////    val localDate = LocalDate.parse("2022-01-06")//2022-01-06
////    println(localDate)
////
////    println("------------4-------------------")//2022-01-06
////    val localDate2 = LocalDate.parse("01-06-2022", DateTimeFormatter.ofPattern("MM-dd-yyyy"))
////    println(localDate2)
////
////    println("------------5------------------")//2022-01-06T20:30:45
////    val text = "2022-01-06 20:30:45"
////    val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
////    val localDateTime = LocalDateTime.parse(text, pattern)
////    println(localDateTime)
////
////
////    println("------------6------------------")//2022-01-06T20:30:45-08:00[America/Los_Angeles]
////    val text0 = "2022-01-06 20:30:45 America/Los_Angeles"
////    val pattern0 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")
////    val zonedDateTime = ZonedDateTime.parse(text0, pattern0)
////    println(zonedDateTime)
////
////    println("------------7------------------")
////
////    println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/Y")))//20/10/2022
////
////    println("------------------8-------------------")
////    val datas = "13 Janeiro, 2016"
////    val  formats = DateTimeFormatter.ofPattern("d MMMM, yyyy")
////
////    val localDate5 = LocalDate.parse(datas, formats)
////    println(localDate5)
////
//
//
//        fun main() {
//
//            println("-------------1 -------------------")
//            val dateString = "1 October, 2022"
//            val formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy")//2022-10-14
//            val formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy")//2022-10-14
//            val date = LocalDate.parse(dateString, formatter)
//            println("data formatada   $date")
//            println(date.format(formatter2))
//
//
//
//            println("-------------2-------------------")
//            val dateBrasil = "20/10/2022"
//            val transfData = LocalDate.parse(dateBrasil, formatter2)
//            println(transfData.format(formatter2))
//
//            println("------------4-------------------")//2022-01-06
//            val localDate2 = LocalDate.parse("14-10-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"))
//            println(localDate2)
//
//            println(
//                "Loading data from NOW data formatada padrão YY " + LocalDate.now()
//                    .format(DateTimeFormatter.ofPattern("dd/MM/YY"))
//            )
//        }
//    }
//
//
//}