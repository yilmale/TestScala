import activitysim._

/**
  * Created by yilmaz on 5/6/16.
  */
object ScalaApp {

  def main(args: Array[String]): Unit = {

    new Simulator  {
       new ActivityModel("M1") {

        var dm = new DataModel()  {
            var myZ : Int = 10

        }

        Activity(this)(name="A3")(cond=(dm.z>0)) (dataModel=dm) ((dm) => {
          var x1: Int = 0;
          dm.z =15
          println(dm.z)

        })

        Activity(this)("A4")(dm.z==0) (dm) ((dm) => {
          println(dm.z)
          Activity(this)("A5")(dm.z==0) (dm) ((dm) => {
            println(dm.z)
          })

        })

        Activity(this)("A6")(dm.z==0) (dm) ((dm) => {
          println(dm.z)
        })

      }  executeActivities()

    }
  }
}
