package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Simulator {
  var simScheduler: Scheduler = new Scheduler()
  var simModel: Model = null

  def setUp(am:ActivityModel) : Simulator = {
    simModel=am
    simScheduler.setModel(simModel)
    this
  }


  def simulate(): Unit = {
    simScheduler.listActivities()
  }
}




