object q1 extends App{
    def getInterest(deposit : Double) : Double = deposit match{
        case x if x<0 => 0
        case x if x<20000 => x*0.02
        case x if x<200000 => x*0.04
        case x if x<2000000 => x*0.35
        case x if x>=2000000 => x*6.5
    }

    println(getInterest(20005));
}

object q2 extends App{

    def patternMatching(input : Int):String = input match{
        case n if n<=0 => "Negative/Zero input"
        case n if n%2==0 => "Even number is given"
        case _ => "Odd number is given"
    }

    val input = scala.io.StdIn.readLine("Enter a integer number : ").toInt;
    val output = patternMatching(input);
    println(output)
}




object q3 extends App{
  def toUpper(inputText:String):String=inputText.toUpperCase()
  def toLower(inputText:String):String=inputText.toLowerCase()

  def formatNames(name:String)(changingIndex:Int* )(Func: String=> String): String={

    if (!(changingIndex.isEmpty)){

      var tempText=""
      var x=0

      while(x<name.length()){
        if(changingIndex.contains(x)){
          tempText=tempText+ Func(name.charAt(x).toString)
        }
        else{
          tempText=tempText+name.charAt(x).toString
        }
        x=x+1
      }
      return  tempText
    }

    else{
      return Func(name)
    }

  }



    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(1)(toUpper))
    println(formatNames("Saman")(0)(toLower))
    println(formatNames("Kumara")(5)(toUpper))
  

}
