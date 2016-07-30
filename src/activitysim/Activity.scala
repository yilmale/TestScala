package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Activity (activityName: String, aCond: => Boolean, aBehavior: () => Unit) {
  println("activity " + activityName + " is created")
  def execute(): Int = {
    if (aCond) {
      aBehavior()
      1
    }
    else {-1}
  }
  def getName : String = activityName

  def registerWith(sch: Scheduler): Unit = {
    sch.add(this)
  }
}


object Activity {
  def apply(name: String)(cond: => Boolean)
           (body: () => Unit) = new Activity(name, cond, body)
}
