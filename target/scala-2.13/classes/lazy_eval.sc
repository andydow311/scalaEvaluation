//val manager:String = "Rafa Benitez"
//var primeMinister:String = "Boris Johnson"
//var numberAsVar = { println("Variable number is initialized."); 99 }
//val numberAsVal = {println("Value number is initialized."); 99 }
//lazy val lazyNumber = { println("lazy value number is initialized."); 99 }
//val tiresomeValue = {(1 to 1000000).filter(x => x % 2 == 0).sum}
//lazy val lazyTiresomeValue = {(1 to 1000000).filter(x => x % 2 == 0).sum}
//def updateIntrest
//
//
//lazyNumber
//lazyNumber
//lazyNumber
//lazyNumber
//
//isIteven(2)
//isIteven(5)

//lazy val number = { println("Constant number is initialized."); 99 }
//println("Before Accessing 'number' constant:")
//println(number + 1)
//println(number + 1)
//println(number + 1)
//
//
//def add(a:Int,b:Int ) = {
//  println("Function execution started.")
//  a+b
//}
//
//println(add(1,2))
//println(add(3,4))
//println(add(5,6))


//mutability var vs val
//val manager:String = "Rafa Benitez"
//manager = "Steve Bruce"

//var primeMinister:String = "Boris Johnson"
//primeMinister = "Anyone else"

//evaluation var vs val

//var numberAsVar = { println("Variable number is initialized."); 99 }
//val numberAsVal = {println("Value number is initialized."); 99 }
//
//print(numberAsVar)
//print(numberAsVal)

//evaluation val vs lazy val

//
//lazy val lazyNumber = { println("lazy value number is initialized."); 99 }
//println("Before Accessing 'lazyNumber' variable:")
//println(lazyNumber + 1)
//println(lazyNumber + 1)
//println(lazyNumber + 1)

//val numberAsVal = { println("numberAsVal is initialized."); 99 }
//println("Before Accessing 'numberAsVal' variable:")
//println(numberAsVal + 1)
//println(numberAsVal + 1)
//println(numberAsVal + 1)

//performance improvement val vs lazy val


//resolving cyclical dependencies with lazy val


//lazy val vs def

//lazy val number = { println("Constant number is initialized."); 99 }
//println("Before Accessing 'number' constant:")
//println(number + 1)
//println(number + 1)
//println(number + 1)
//
//
//def add(a:Int,b:Int ) = {
//  println("Function execution started.")
//  a+b
//}
//
//println(add(1,2))
//println(add(3,4))
//println(add(5,6)
//val numberAsVal = {println("Value number is initialized."); 99 }
// Call-by-value vs Call-by-nam//                                                               e
                               //print(numberAsVar)
//def callByValue(a: Boolean, bprint(numberAsVal)                                               :Unit) = {
//    if(a) {
//     println("Hey")
//     b
//    }
//   }
//     callByValue

//def callByName(a: Boolean, b: => Unit) = {
//  if(a) {
//    println("Hey")
//    b
//  }
//}
//
//callByName(true, println("hello"))


//difference in evalation

//var number = { println("Variable number is initialized."); 99 }
//println("Before Accessing 'number' variable:")
//println(number + 1)
//println(number + 1)
//println(number + 1)
//
//lazy val number2 = { println("Variable number is initialized."); 99 }
//println("Before Accessing 'number' variable:")
//println(number2 + 1)
//println(number2 + 1)
//println(number2 + 1)

//difference in performance

//var start = System.currentTimeMillis()
//lazy val tiresomeValue = {(1 to 1000000).filter(x => x % 2 == 0).sum}
//if (scala.util.Random.nextInt % 2 == 0) {
//  println("val is " + tiresomeValue)
//}
//var end = System.currentTimeMillis()
//var duration = end - start
//println("Duration -->" + duration)
//
//var start1 = System.currentTimeMillis()
//val tiresomeValue1 = {(1 to 1000000).filter(x => x % 2 == 0).sum}
//if (scala.util.Random.nextInt % 2 == 0) {
//  println(tiresomeValue1)
//}
//var end1 = System.currentTimeMillis()
//var duration1 = end1 - start1
//println("Duration -->" + duration1)


//





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

//on success and on failure

def fun(onSuccess: => Unit,onFail: => Unit ): Unit =  {


}