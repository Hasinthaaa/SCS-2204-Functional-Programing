
import scala.io.StdIn

object T_1 extends App{
    def filterEvenNumbers(list:List[Int]) : List[Int] = {
        list.filter(number => (number%2 ==0))
    }

    print("Enter the list of integers separated by commas: ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toInt).toList

    val Output = filterEvenNumbers(InputList)
    println("\n"+Output)

}

object T_2 extends App{
    def calculateSquare(list:List[Int]) : List[Int]={
        list.map(number => (number*number))
    }

    print("Enter the list of integers separated by commas: ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toInt).toList

    val Output = calculateSquare(InputList)
    println("\n"+Output)
}

object T_3 extends App{
    def filterPrime(list: List[Int]): List[Int] = {
        def divisors(number: Int): List[Int] = {
            (1 to number).filter(divisor => number % divisor == 0).toList
        }
        list.filter(number => divisors(number).length == 2)
    }

    print("Enter the list of integers separated by commas: ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toInt).toList

    val Output = filterPrime(InputList)
    println("\n"+Output)
}