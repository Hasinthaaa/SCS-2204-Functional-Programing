object q4 extends App{

    def isEvenOrOdd(num:Int):String = num match{
        case 0 => {return "Even Number"}
        case 1 =>{return "Odd Number"}
        case _ if(num<0) => { isEvenOrOdd(-num)}
        case _  =>{ isEvenOrOdd(num-2)}
    }

    val input = scala.io.StdIn.readLine("Enter an integer number : ").toInt;

    print(isEvenOrOdd(input));

}