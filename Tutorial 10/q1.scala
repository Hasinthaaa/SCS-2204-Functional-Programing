object q1 extends App{


    def calculateAverage(temperatures: List[Double]): Double = {
        val fahrenheitTemperatures = temperatures.map(temp => (temp * 9/5) + 32)
        val sumOfTemperatures = fahrenheitTemperatures.reduce((temp1, temp2) => temp1 + temp2)
        sumOfTemperatures / fahrenheitTemperatures.length
    }


    val temperatures = List(0.0, 10.0, 20.0, 30.0)
    val averageFahrenheitTemperature = calculateAverage(temperatures)
    println(s"\nAverage Fahrenheit temperature: $averageFahrenheitTemperature\n")
}
