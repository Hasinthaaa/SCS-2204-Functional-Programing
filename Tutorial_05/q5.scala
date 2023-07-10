object q5 extends App{
    def sumOfEven(n:Int, i:Int=2):Int ={

        if(((n)>i))
        {
            return i+sumOfEven(n,i+2);
        }
        else
        {
            return 0;
        }
    }
    println(sumOfEven(5));
    val input = scala.io.StdIn.readLine("Enter the number n : ").toInt;
    print(sumOfEven(input));    
}