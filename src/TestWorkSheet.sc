object activity1  {
  def apply (myV: Int) : Int = myV+1
}

println(activity1(5))




var xs = List(1,2,3,4)
println(xs)
xs foreach println
xs.apply(3)
def f(x: Any) = println(x)
f(5)
(1 to 5).map(_*2)
(1 to 5) foreach(f)
var x =5
if (x==4) println("OK") else println("notOK")
for (x <- xs) println(x)

/*def updateC(myC: C): Unit = {
  myC.incVal()
}
var c = new C(4) {y = 10}
updateC(c)
println(c.getVal())
case class Var(name:String)
val xq = Var("test")
println(xq.name)
*/
def afunc(f:Int => Int)(x:Int) = f(x)
def myF(x:Int) : Int = {x*x}
afunc(myF)(3)

import scala.collection.mutable.ArrayBuffer

object Model {
  var v1 = 10
  var v2 = 1
}



object Simulator {
  object Scheduler {
    var activityList = ArrayBuffer.empty[C]
    var activityTimeBound = ArrayBuffer.empty[C]
    def register(c : C) {activityList += c}
    def registerTimeBound(c : C, delay:Int) {activityTimeBound += c}
  }
  def simulate() {}
}


class C(x: Int, cond: => Boolean, body: => Unit) {
  var y = x
  //var myBehavior = body
  var myCond = cond
  //println(cond)
  Simulator.Scheduler.register(this)
  private var a : Int = x
  def incVal() = a=a+1
  def getVal() : Int = {a}
  def testC() : Int = {y+a}
  def execute() : Unit  =  {
    if (cond) (body) else println("false predicate")
  }
}

/*def activity (name: => String) (cond: => Boolean)
             (body: => Unit) : C = new C(20,cond,body)
*/


object activity {
  def apply (name: => String) (cond: => Boolean)
            (body: => Unit): C = new C(10,cond,body)

}

activity ("A1") (Model.v1==10) {println(Model.v1);println("test");Model.v1=20} execute()

/*def modelInitialize (body: => Unit) = {body}
var i=0

modelInitialize {Model.v1=10; Model.v2=20}
activity ("A1") (Model.v1==10) {println(Model.v1);println("test");Model.v1=20} execute()
activity ("A2") (Model.v1==20) {println(Model.v1);println("test1")} execute()
Simulator.simulate()
*/
