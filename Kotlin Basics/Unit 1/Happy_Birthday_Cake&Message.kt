
fun main() {
    val border = "`-._,-'"
    val repeattime = 5
    var name = "Harsh Tiwari"
    var age = 21
    var days = age * 365
    printborder(border , repeattime)
    println("Happy Birthday!! $name")
    println("     !!!!    ")
    println("  ()()()()()")
    println(" ()()()()()()")
    println("") //this prints empty line
    print("you are ${age} now\n${age} is the best age to celebrate")
    println(" You are ${days} day's old now")
    printborder(border , repeattime)
   
}
 fun printborder(border:String , repeattime : Int){
        repeat(repeattime){
            print(border)
        }
        println("")
    }




fun main() {
    var age = 24
    val layers = 5
    
    printCakeCandles(age)
    printCakeTop(age)
    
    printCakeBottom(age , layers)
}

fun printCakeTop(age : Int){
    repeat(age+2){
        print("=")
    }
    println()
}


fun printCakeCandles(age : Int){
    print (" ")
    repeat(age){
        print(",")
    }
    
    println()
    print (" ")
    repeat(age){
        print("|")
    }
    println()
 }


fun printCakeBottom(width : Int , height : Int){
    repeat(height){  
        repeat(width+2){
print("@")
    }
    println()}
  
    
}


