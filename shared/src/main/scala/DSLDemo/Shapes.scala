package DSLDemo

sealed trait Shape {
  type A <: Shape
  def and(s: Shape) : ComposedShape[Shape] = ???
  def change(property: CanvasElementModifier[A]): Unit = ???
  def moveX(v: Int): Unit = ???

  def moveY(v: Int): Unit = ???
}

sealed trait ShapeAttributes {
  var color: String = "red"
  var strokeWidth: Int = 1
  // Add more attributes here
}

case class ComposedShape[T <: Shape](var l: List[T]) extends Shape {
  type A = T
  def map[B <: Shape](f: T => B) : ComposedShape[B] = ???
  def flatMap[B <: Shape](f: T => Iterable[B]) : ComposedShape[B] = ???
  def foreach[B](f: T => B) : Unit = ???
  def apply(i: Int): T = ???
}

case class Rectangle(var x: Int, var y: Int, var width: Int, var height: Int) extends Shape with ShapeAttributes {
  type A = Rectangle
}

case class Circle(var x: Int, var y: Int, var radius: Int) extends Shape with ShapeAttributes {
  type A = Circle
}
