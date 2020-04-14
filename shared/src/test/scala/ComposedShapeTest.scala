import DSLDemo._

import common.Common._

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import scala.util.Random

class ComposedShapeTest extends AnyFunSuite with Matchers {

  Random.setSeed(947693)

  test("Moving a group of shapes up") {
    val l = newRectangleList()
    val g = ComposedShape(l)
    val offSet = Random.nextInt(20)
    val expected = l.map(_.y - offSet)
    g moveY(-offSet)
    for (i <- l.indices)
      g(i).asInstanceOf[Rectangle].y shouldBe expected(i)
  }

  test("foreach simple") {
    val rl = newRectangleList()
    val cl = newCircleList()
    val g = ComposedShape(rl ++ cl)
    var counter = 0
    g.foreach(x => counter += 1)
    counter shouldBe rl.length + cl.length
  }

  test("map") {
    val rl = newRectangleList(10)
    val expected = List.tabulate(rl.length)(i => Circle(rl(i).x, rl(i).y, 20))
    val g = ComposedShape(rl)
    val newG = g.map(r => Circle(r.asInstanceOf[Rectangle].x, r.asInstanceOf[Rectangle].y, 20))
    for (i <- rl.indices) {
      g(i) shouldBe rl(i)
      newG(i) shouldBe expected(i)
      assert(g(i) != newG(i))
    }
  }

}
