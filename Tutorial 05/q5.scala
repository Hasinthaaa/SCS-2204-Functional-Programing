object q5 extends App{
    def sum(n:Int, i:Int=2):Int ={

        if(((n)>i))
        {
            return i+sum(n,i+2);
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