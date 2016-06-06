package org.scalaQuestions

/**
  * Created by rushikeshk on 6/6/2016.
  */
object Question5 extends App{

  for(i <- 1 to 100){
    for(j<- 2 to i )
    if((i%j)==0) {
      println(i)
    }
  }
}
