package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Simulator {
  var simScheduler: Scheduler = new Scheduler()
  var aModel : ActivityModel = null
  def simulate(am: ActivityModel): Unit = {

  }
  def setUp(body: => Unit) = {
    body
  }

  def modelSetUp(body: => Unit) = {
    body
  }
}




