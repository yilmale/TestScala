package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
object Simulator {
  var simScheduler: Scheduler = new Scheduler()
  var simModel: Model = null

  def setUp(body: => Unit) = {
    body
  }
}




