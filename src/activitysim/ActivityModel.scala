package activitysim

import scala.collection.mutable.ArrayBuffer

/**
  * Created by yilmaz on 5/17/16.
  */
class ActivityModel (modelName: String) extends Model {
  var activityList = ArrayBuffer.empty[Activity]
  var dataModel : DataModel=null

  def registerWith(scheduler: Scheduler): ActivityModel = {
    scheduler.setModel(this)
    this
  }

  def setDataModel(dm: DataModel): Unit = {
    dataModel = dm
  }

  def add(newActivity:Activity): Unit = {
    activityList += newActivity
  }

  def listActivities()  {
    for (a <- activityList) {
      println(a.getName)
    }
  }

  def executeActivities(): ActivityModel = {
    for (a <- activityList) {
      a.execute()
    }
    this
  }
}
