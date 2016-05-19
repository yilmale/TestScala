package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Activity (am: Any, name: String, aCond: Boolean, dm: DataModel, f: (DataModel) => Unit) {
  am.asInstanceOf[ActivityModel].add(this)
  println("new activity  included")
  am.asInstanceOf[ActivityModel].listActivities()
  def apply() = f(dm)
  def execute() = if (aCond) f(dm)
  def getName : String = name
}

object Activity {
  def apply (am: Any) (name: => String) (cond: => Boolean) (dataModel: DataModel)
            (body: (DataModel) => Unit) = new Activity(am, name,cond,dataModel, body)
}
