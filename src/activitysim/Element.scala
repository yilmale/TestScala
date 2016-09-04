package activitysim

/**
  * Created by Levent Yilmaz on 9/4/2016.
  */
class Element(x:Int) {
    var elemInt : Int =x
    def update() : Unit = {elemInt=elemInt+1}
    def getVal : Int = elemInt
}
