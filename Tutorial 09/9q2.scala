class Rational(n:Int , d:Int){

    require(d != 0)

    private val gcdValue = gcd(n.abs, d.abs)

    val numerator = n/gcdValue
    val denominator = d/gcdValue

 
    def -(that: Rational): Rational = new Rational(numerator*that.denominator - that.numerator*denominator,denominator*that.denominator)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
 
    def neg: Rational = new Rational(-numerator, denominator)

    override def toString: String = s"$numerator/$denominator"
}
object Main extends App{
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x-y-z

    println(s"x: $x")
    println(s"y: $y")
    println(s"z: $z")
    println(s"x - y - z: $result")

}
