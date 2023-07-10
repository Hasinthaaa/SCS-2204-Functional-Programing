object q1 extends App{
    def Prime(num :Int , x:Int =2):String = {

        if(num==1){return ("False");}
        if(x<=num){
            if((num%x == 0) && (num != x)){
                return ("False");
            }
            else if(num==x){
                return ("True");
            }
            else{
                Prime(num,x+1);
            }
        }
        else { "" }
    }

    println(Prime(5));
    println(Prime(8));

    val input = scala.io.StdIn.readLine("Enter an integer number : ").toInt;
    print(Prime(input));


}