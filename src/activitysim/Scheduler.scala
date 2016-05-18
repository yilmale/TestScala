package activitysim

import scala.collection.mutable.ArrayBuffer

/**
  * Created by yilmaz on 5/17/16.
  */
class Scheduler extends Observer {
  var model : Model = null
  var activityList = ArrayBuffer.empty[Activity]

  def setModel(am: Model): Unit = {
    this.model = am
  }

  def add(a:Activity): Unit = {
    activityList += a
  }

  def listActivities()  {
    for (a <- activityList) {
      println(a.getName)
    }
  }


}
