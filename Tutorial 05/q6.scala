object q6 extends App{
    def findLast(n:Int , sum:Int=0,next:Int=1): Unit={
        
        if(n>1){
            print(sum);
            print("  ");
            findLast(n-1,next,sum+next);
        }     
    }

    findLast(6);
    println("");
    val input = scala.io.StdIn.readLine("Enter the number n : ").toInt;
    findLast(input);
}