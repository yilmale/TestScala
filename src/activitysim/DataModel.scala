package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class DataModel {
  var z: Int = 10
  def initialize (body: => Unit): DataModel = {
    body
    this
  }


}
