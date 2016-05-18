package activitysim

import scala.collection.mutable.ArrayBuffer

/**
  * Created by yilmaz on 5/17/16.
  */
class ActivityModel (modelName: String) extends Model {
  var activityList = ArrayBuffer.empty[Activity]
  def registerWith(scheduler: Scheduler): ActivityModel = {
    scheduler.setModel(this)
    this
  }
  def add(newActivity:Activity): Unit = {
    activityList += newActivity
  }

  def listActivities()  {
    for (a <- activityList) {
      println(a.getName())
    }
  }
}
