

/**
 * @author callum
 */
object Main {
  
  def main(args: Array[String]){
    
    val a : List[(Int, Int)] = List((1, 2), (3, 4), (3, 6))
    val b : List[Int] = a.map(tup => tup._1 + tup._2)
  
  for(i <- b)
    print(i)
    
    val c : List[Int] = a.par.map(tup => tup._1 + tup._2).toList
    
    for (j <- c)
      print(j)
      
      // Output for both b & c is : 379
  }
}