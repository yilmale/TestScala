import activitysim._


/**
  * Created by yilmaz on 5/6/16.
  */
object ScalaApp {

  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    
    Simulator setUp {
      new ActivityModel ("M1") {
        Activity (this) (name="A") (cond=true) {}
        Activity (this) (name = "B")(cond = true) {}
      } registerWith Simulator.simScheduler listActivities()
    }
  }
}
