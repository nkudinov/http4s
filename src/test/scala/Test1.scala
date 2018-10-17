import org.json4s._
import org.json4s.native.JsonMethods._
import cats.effect.IO
object Test1 extends App {
  val t = parse("""{"postId": 123123123123123, "text":"ololo"}""")
  t.extract

}