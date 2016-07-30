package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Simulator {
  var simScheduler: Scheduler = new Scheduler()
  var simModel: Model = null


  def setUp(am: ActivityModel): Simulator = {
    simModel = am
    simScheduler.setModel(simModel)
    this
  }


  def simulateUntil(cond: Int): Unit = {
    simScheduler.listActivities()
    var vTime: Int = 0
    var simCond : Boolean = false
    do {
      do {
        simCond=simScheduler.executeActivities()
      } while (simCond)
      vTime = vTime + 1
    } while (vTime <= cond)

  }

}



