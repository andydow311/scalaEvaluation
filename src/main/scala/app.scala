object AutomatedTradingPlatform {
  def main(args:Array[String]): Unit = {
    market.traderOne.sell()
    market.traderTwo.sell()
  }
}

class TraderOne(val productSelling: String) {
  lazy val desiredProduct = market.traderTwo.productSelling
  def sell(): Unit = {
    println(s"I wanna exchange some ${productSelling} for some ${desiredProduct}!")
  }
}

class TraderTwo(val productSelling: String) {
  lazy val desiredProduct = market.traderOne.productSelling
  def sell(): Unit = {
    println(s"I wanna exchange some ${productSelling} for some ${desiredProduct}!")
  }
}

object market {
   val traderOne: TraderOne = new TraderOne("Diamonds")
   val traderTwo: TraderTwo = new TraderTwo("Gold")
}