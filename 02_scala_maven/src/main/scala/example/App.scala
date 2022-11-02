package example

import scala.meta._

object App {
  def main(args: Array[String]) = {
    pprint.pprintln(parse(args.head))
  }

  private def parse(arg: String) = {
    arg.parse[Source].get
  }
}
