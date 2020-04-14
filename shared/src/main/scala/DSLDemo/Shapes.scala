package DSLDemo

sealed trait Shape {
  def and(s: Shape) : ComposedShape = ???
  def change(property: CanvasElementModifier[Shape]): Unit = ???
  def moveX(v: Int): Unit = ???

  def moveY(v: Int): Unit = ???
}

sealed trait ShapeAttributes {
  var color: String = "red"
  var strokeWidth: Int = 1
  // Add more attributes here
}

case class ComposedShape() extends Shape {
  def map(f: Shape => Shape) : ComposedShape = ???
  def flatMap(f: Shape => IterableOnce[Shape]) : ComposedShape = ???
  def foreach[B](f: Shape => B) : Unit = ???
  def apply(i: Int): Shape = ???
}

case class Rectangle(var x: Int, var y: Int, var width: Int, var height: Int) extends Shape with ShapeAttributes

case class Circle(var x: Int, var y: Int, var radius: Int) extends Shape with ShapeAttributes
