//evaluation var vs val
var x:Int = {println("evaluation"); 99}
println(x)
println(x)
x = {println("evaluation2"); 100}
print(x)
print(x)
//evaluation of reassingment of var


//evaluation val vs lazy val
val y:String = {println("evaluation3"); "hello"}
println("world")
println(y)

lazy val z:String = {println("evaluation4"); "hello"}
println("world")
println(z)
println(z)


//evaluation of lazy val vs def

def add(a:Int, b:Int): Int ={
  println("evaluation 5")
  a+b
}
println("line after method")
print(add(1,2))
print(add(2,3))

//call by name vs call by value

def measure(action: Unit) = {
  println("Starting to measure time")
  val startTime = System.nanoTime
  action
  val endTime = System.nanoTime
  println("Operation took "+(endTime-startTime)+" ns")
}

measure {
  println("Will now sleep a little")
  Thread.sleep(1000)
}


//cyclical dependencies



//unpredicatability




