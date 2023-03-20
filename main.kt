fun main() {
  println("Hello world!")

  //Question 1
  var modules = arrayOf("DATA STRUCTURES AND ALGORITHMS", "EMPLOYEEMENT SKILL DEVELPMENT", "IT PROJCT ", "MOBILE APPLICATION DEVELOPMENT", "PROFESSIONAL SKILLS", "PROBABILITY AND STATISTICS")

  println("\nSize of tha array is " + modules.size+"\n")

  for(j in modules){
      println(j)
  }

  //Question 2
  var radius = 7
  var circumference = 2 * 22/7.0 * radius
  println("Circumference of the Circle is : " + circumference)

  //Question 3
  var marks = 62

  print("\nThe Grade is :")
  if (marks <= 100 && marks >= 75) {
        print("A\n")
  } else if (marks <= 74 && marks >= 65) {
        print("B\n")
  } else if (marks <= 64 && marks >= 50) {
        print("C\n")
  } else if (marks <= 49 && marks >= 35) {
        print("D\n")
  } else {
        println("F\n")
  }

  //Question 4
  val number = 30
  var flag = false
  for(i in 2..number/2){
    if(number%i ==0){
      flag = true
      break
    }
  }
  if(!flag)
    println("\n $number is a Prime number.")
  else
    println("\n $number is not a Prime Number")


       
        
}

   