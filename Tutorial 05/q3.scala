object q3 extends App{
    def sum(n:Int, i:Int=1):Int ={

        if((n+1)>i)
        {
            return i+sum(n,i+1);
        }
        else
        {
            return 0;
        }
    }
    println(sum(5));
    val input = scala.io.StdIn.readLine("Enter the number n : ").toInt;
    print(sum(input));
}