package common
import DSLDemo._
import scala.util.Random

object Common {

  def newRectangle() : Rectangle = {
    val x = Random.nextInt(100)
    val y = Random.nextInt(100)
    val width = Random.nextInt(50)
    val height = Random.nextInt(50)
    Rectangle(x, y, width, height)
  }

  def newCircle() : Circle = {
    val x = Random.nextInt(100)
    val y  = Random.nextInt(100)
    val radius = Random.nextInt(50)
    Circle(x, y, radius)
  }

  def newRectangleList(): List[Rectangle] = {
    val size = 5 + Random.nextInt(10)
    List.fill(size)(newRectangle())
  }

  def newRectangleList(size: Int): List[Rectangle] = {
    List.fill(size)(newRectangle())
  }

  def newCircleList(): List[Circle] = {
    val size = 5 + Random.nextInt(10)
    List.fill(size)(newCircle())
  }

  def newCircleList(size: Int): List[Circle] = {
    List.fill(size)(newCircle())
  }

}