object Tutorial_01{
  def main(args: Array[String]): Unit = {
    println("01) Area of the disk : "+ calculateArea(5))
    println("02) 35C in Fahrenheit is "+ convertToF(35))
    println("03) The volume of the sphere : " + calculateVolume(5))
    println("04) Total wholesale cost  " + (coverPrice(60)-discount(60)+shippingCost(60)))
    println("05) Total running time : "+ (time_easy(2)+time_tempo(3)+time_easy(2)))
  }


  //Q_01
  def calculateArea(r:Double):Double = Math.PI * r * r

  //Q_02
  def convertToF(c:Double):Double = c*1.8000 + 32.00

  //Q_03
  def calculateVolume(r:Double):Double =4/3* math.Pi*r*r*r

  //Q_04
  def coverPrice(c:Int) :Double = 24.95*c
  def discount(c:Int) :Double = c* 24.95 *0.4
  def shippingCost(c:Int) :Double = if(c<=50){c*3}else{(c-50)*0.75 + 50*3}

  //Q_05
  def time_easy(d:Double) :Double =d*8
  def time_tempo(d:Double) :Double = d*7
}