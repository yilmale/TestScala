import activitysim._

import scala.xml._

/**
  * Created by yilmaz on 5/6/16.
  */
object ScalaApp {

  def main(args: Array[String]): Unit = {

    var dm = new DataModel {
      val page =
        <html>
          <head>
            <title>Hello XHTML world</title>
          </head>
          <body>
            <h1>Hello world</h1>
            <p><a href="scala-lang.org">Scala</a> talks XHTML</p>
          </body>
        </html>
      println(page.toString())
    }

    var hm = new HypothesisModel {

    }

    var em = new ExperimentModel {

    }

    var sim = new Simulator
    sim.setUp  {
      new ActivityModel("M1")  {
        Activity(name = "A1")(cond = true)(() => {
          println("test");
        }) registerWith sim.simScheduler
        Activity(name = "A2")(cond = true)(() => {
          println("test1")
        }) registerWith sim.simScheduler
      }
    }
  }
}
