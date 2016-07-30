package activitysim

import scala.collection.mutable.ArrayBuffer
import scala.util.control._

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

  def executeActivities() : Boolean = {
    var satisfiedCond : Int = 0
    var cond : Boolean = false
    val loop = new Breaks
    loop.breakable {
      for (a <- activityList) {
        satisfiedCond = a.execute()
        if (satisfiedCond == 1) {
          cond = true
          loop.break
        }
      }
    }
    cond
  }


}
