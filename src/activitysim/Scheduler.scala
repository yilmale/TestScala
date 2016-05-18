package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Scheduler extends Observer {
  var simulator = Simulator
  var model : ActivityModel = null
  def setModel(am: ActivityModel): Unit = {
    this.model = am
  }

}
