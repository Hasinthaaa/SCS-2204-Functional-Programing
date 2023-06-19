object q1 extends App{
  val i, j, k: Int = 2;
  val m, n: Int = 5;
  val f = 12.0f;
  val g = 4.0f;
  val c: String = "X"

  println("k+12*m  = " + (k + 12 * m));
  println("m/j  = " + (m / j));
  println("n%j  = " + (n % j));
  println("m/j*j  = " + (m / j * j));
  println("f + 10*5 +g  = " + (f + 10 * 5 + g));
  println("++i*n  = " + ((i + 1) * n));
}

object q2 extends App{
  val a: Int = 2
  val b: Int = 3
  val c: Int = 4
  val d: Int = 5
  val k: Float = 4.3f

  println("- - b * a +c * d - - = " + ((b - 1) * a + c * (d - 1)));
  println("a ++ = " + (a + 1));
  // println("(–2) * (g–k) +c"+(–2 * (g–k) +c));
  println("c=c++ = " + (c + 1));
  println("c=++c*a++ = " + ( (c + 1) * (a + 1)));
}

object q3 extends App{


  def normal(nHours:Int):Double = 250* nHours;
  def oT(otHours:Int):Double = 85* otHours;
  def total(nHours:Int,otHours:Int) : Double = normal(nHours) +oT(otHours);
  def tax(total:Double) : Double = total * 0.12;
  def takeHome(nHours:Int,otHours:Int):Double = total(nHours,otHours) - tax(total(nHours,otHours));

  println("Take home salary : "+takeHome(40,30));
}

object q4 extends App{

  def attendees(price:Int):Int = 120 + (15-price)/5 *20;
  def revenue(price:Int):Int = attendees(price) * price;
  def cost(price:Int):Int = 500 + attendees(price)*3;
  def profit(price:Int):Int = revenue(price) - cost(price);

  val prices = 5 to 40 by 5
  val bestPrice = prices.maxBy(profit)
  println("Best Price = " + bestPrice)
}
