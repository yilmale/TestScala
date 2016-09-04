import activitysim._


/**
  * Created by yilmaz on 5/6/16.
  */
object ScalaApp {

  def main(args: Array[String]): Unit = {
    val e:Element = new Element(5)
    println("The initial value is value is " + e.getVal)
    testFunction(e)
    println("The value is " + e.getVal)

    /*    var y: Int = 5
    var sim = new Simulator
    sim.setUp  {
      new ActivityModel("M1")  {
        var x: Int = 5
        Activity(name = "A1")(cond = (y<=12))(() => {
          println("test " + y)
          y=y+1
        }) registerWith sim.simScheduler
        Activity(name = "A2")(cond = (y<=16))(() => {
          println("test1 " + y)
          y=y+1
        }) registerWith sim.simScheduler
      }
    } simulateUntil 10*/


  }

  def testFunction(a:Element): Unit = {
    a.update()
  }
}
