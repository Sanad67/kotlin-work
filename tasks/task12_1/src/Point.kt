// Task 12.1: Point class
class Point(var x: Double, var y: Double)

var p = Point(2.0, 3.0)
p = Point(p.x + 10.0, p.y)