import activitysim._


/**
  * Created by yilmaz on 5/6/16.
  */
object ScalaApp {

  def main(args: Array[String]): Unit = {

    var sim = new Simulator
    sim.setUp  {
      new ActivityModel("M1")  {
        var x: Int = 5
        Activity(name = "A1")(cond = (x>=5))(() => {
          println("test " + x)
          x=x+1
        }) registerWith sim.simScheduler
        Activity(name = "A2")(cond = true)(() => {
          println("test1 " + x)
        }) registerWith sim.simScheduler
      }
    } simulate
  }
}
