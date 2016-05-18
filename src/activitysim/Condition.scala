package activitysim

/**
  * Created by yilmaz on 5/17/16.
  */
class Condition (x: Boolean) {
  def and(that: Condition) : Condition = if (x) that else this
  def or(that: Condition) : Condition = if (x) this else that
  def negate: Condition = new Condition(!x)
  def not(x: Condition) = x negate
  def apply() = x
}
