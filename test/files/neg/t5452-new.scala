// /scala/trac/5452/a.scala
// Mon Feb 13 22:52:36 PST 2012

// import scala.reflect.mirror._

trait Tree

object Bip {
  def ??? = sys.error("")
}
import Bip._

case class Queryable[T]() {
  def treeFilter( t:Tree ) : Queryable[T] = ???
}

object Queryable {
  def apply[T:ClassTag] = ???
  def apply[T:ClassTag]( t:Tree ) = ???
}

trait CoffeesTable{
  def sales : Int
}

object Test extends App{
  val q = new Queryable[CoffeesTable]
  Queryable[CoffeesTable](  q.treeFilter(null)  )
}
