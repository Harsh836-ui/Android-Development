fun main() {
val myFirst = Dice(6)
val mySecond = Dice(20)

println("Your ${myFirst.numSides} sided Gave ${myFirst.roll()}!")
println("Your ${mySecond.numSides} sided Gave ${mySecond.roll()}!")

    
}

class Dice(val numSides : Int){
   
    fun roll():Int {
        return (1..numSides).random()
       
        
    }
}
