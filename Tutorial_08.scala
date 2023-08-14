object q1 extends App{

    def interest(deposit: Double) : Double = {
        val rate_2 = (x:Double) => x * 0.02
        val rate_4 = (x:Double) => x * 0.04
        val rate_3_5 = (x:Double) => x * 0.035
        val rate_6_5 = (x: Double) => x * 0.065
    

        deposit match {
            case x if (x <= 20000) => rate_2(x)
            case x if (x <= 200000) => rate_4(x)
            case x if (x <= 2000000) => rate_3_5(x)
            case x => rate_6_5(x)
        }
    } 
    println(interest(10000))
    println(interest(50000))
    println(interest(1000000))
    println(interest(5000000))
}

object q2 extends App{
     
    val isEven = (n: Int) => n % 2 == 0

    val isNegativeOrZero = (n: Int) => n <= 0

    println("Enter the number :")
    val input = scala.io.StdIn.readInt()


    input match {
        case n if isNegativeOrZero(n) => println("Negative/Zero is input")
        case n if isEven(n) => println("Even number is given")
        case _ => println("Odd number is given")
    }


}

object q3 extends App{

    var input_1 = "Benny"
    var input_2 = "Niroshan"
    var input_3 = "Saman"
    var input_4 = "Kumara"


    val toUpper:String => String = (name:String) =>
        name.toUpperCase()

    val toLower:String => String = (name:String) =>
        name.toLowerCase()

    val mixFormat:String => String = (name:String) =>
        name.substring(0,2).toUpperCase() + name.substring(2,name.length).toLowerCase()

    val first_last_format:String => String = (name:String)=>
        name.substring(0,1).toUpperCase() + name.substring(1,name.length-1).toLowerCase()+name.substring(name.length-1,name.length).toUpperCase()

    val formatNames : (String , String=>String) => String = (name:String , formatFn:String=>String) =>{
        formatFn(name)
    }
 
    println(formatNames(input_1, toUpper))
    println(formatNames(input_2, mixFormat))
    println(formatNames(input_3, toLower))
    println(formatNames(input_4, first_last_format))

}
