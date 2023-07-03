
object q1 extends App{
    
    def recursiveString(str : String) : String ={

        if (str.isEmpty){ ""}
        else{
            recursiveString(str.tail)+str.head;
        }
    }
    val txt = scala.io.StdIn.readLine("Enter the string : ")
    val recursiveTxt = recursiveString(txt)
    println(recursiveTxt)
}


object q2 extends App{
    def filtering(stringList : List[String]): List[String] = {
        stringList.filter(_.length>5)
    }
  
    val input = List("student","teacher","cat","rat")
    val filteredList = filtering(input)
    println(filteredList)
}



object q3 extends App{
    def findAverage(num1:Int , num2 :Int): Double ={
        val mean=(num1+num2)/2.0        
        BigDecimal(mean).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    val result = findAverage(10,15);
    println(result);
}


