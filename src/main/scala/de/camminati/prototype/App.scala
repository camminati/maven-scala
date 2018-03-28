package de.camminati.prototype

object App {

  def main(args: Array[String]) {
    println("Hello World!")
    println("concat arguments = " + getArgs(args))
  }

  def getArgs(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

}
