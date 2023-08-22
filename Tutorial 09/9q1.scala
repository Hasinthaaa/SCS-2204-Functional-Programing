import scala.math

class Rational(n: Int, d: Int) {
    require(d != 0)
    private val gcdValue = gcd(n.abs, d.abs)
    val numerator = n / gcdValue
    val denominator = d / gcdValue

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
 
    def neg: Rational = new Rational(-numerator, denominator)

    override def toString: String = s"$numerator/$denominator"
}

object Main extends App {
  val x = new Rational(3, 4)
  val y = x.neg
  println(s"x : $x")
  println(s"Negative x : $y") 
}
