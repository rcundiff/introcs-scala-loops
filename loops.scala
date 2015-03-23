import scala.math.min

object loops {
  
  // Return a string containing n copies of s, end to end.
  // For example StringOfReps("Ok", 9) returns: "OkOkOkOkOkOkOkOkOk"
  def stringOfReps(s: String, n: Int): String = {
     s * n
  }

  // Return n! (n factorial: 1*2*3 *...* n if n >=1; 0! is 1.).  
  //For example Factorial(4) returns 1*2*3*4 = 24.
  def factorial(n : Int): Int = {
        if (n <= 1) 
            return 1
         else
           n * factorial(n-1)              
    }
    


   // Return a string containing a filled rectange, where the filling is 
   // the specified number of columns and rows of the character inChar,
   // surrounded by a border made of the character edgeChar.
   // For example printRectangle(3, 2, 'i', 'e') prints
   //    eeeee
   //    eiiie
   //    eiiie
   //    eeeee
   def printRectangle(columns:Int, rows:Int, inChar:String, edgeChar:String): String = {
       
    var upperouter = edgeChar * (columns + rows)

    var insidecolumns = (columns + rows) - 2

    var inside = edgeChar + (inChar * insidecolumns) + edgeChar


    var data = ""
    data += upperouter
    for( a <- 1 to rows){
      data += "\n" + inside
    }

    data += "\n" + upperouter

    return data
   }

}
