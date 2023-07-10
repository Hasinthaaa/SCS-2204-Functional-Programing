object q2 extends App{

    def primeSeq(num:Int, x:Int=2):Unit={
        if(x<num){
            if(isPrime(x)){
                print(x );
                print(" ")
            }
            primeSeq(num,x+1);         
        }
        else{println("");}
    }

    def isPrime(num :Int , x:Int =2):Boolean = {
        if(num==1){return false}
        if(x<=num){
            if((num%x == 0) && (num != x)){
                return false
            }
            else if(num==x){
                return true
            }
            else{
                isPrime(num,x+1);
            }
        }
        else{false}     
    }
    primeSeq(10);

    val input = scala.io.StdIn.readLine("Enter the number : ").toInt;
    primeSeq(input);
}

