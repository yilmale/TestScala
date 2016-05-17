package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Activity (model: ActivityModel, activityName: String, aCond: Boolean, aBehavior: Unit) {
  var activityCondition = new Condition(aCond)
  println("Activity" + activityName + "is created")
  def getCondition() : Condition = activityCondition
  def getBehavior() : Unit = aBehavior
  def getName() : String = activityName
  def register()  {
    model.add(this)
  }
  def execute(): Unit = {
    if (aCond) aBehavior
  }
}


object Activity {
    def apply (model: ActivityModel) (name: => String) (cond: => Boolean)
              (body: => Unit) = new Activity(model, name,cond,body) register()
}
