object q6 extends App{
    def fibonacci(n:Int , sum:Int=0,next:Int=1): Unit={
        
        if(n>1){
            print(sum);
            print("  ");
            fibonacci(n-1,next,sum+next);
        }     
    }

    fibonacci(6);
    println("");
    val input = scala.io.StdIn.readLine("Enter the number n : ").toInt;
    fibonacci(input);
}
