import Student
import InputHandlerCLI
import kotlin.system.exitProcess

fun main()
{


    val uni : University = University()
    val ih : InputHandler = InputHandlerCLI()
    val app : UniApplication = UniApplication(ih, uni)
    uni.enrolStudent(Undergraduate(1, "Kieran", "Test"))
    uni.enrolStudent(Undergraduate(2, "Kezza", "Test2"))
    println(uni.findStudentById(2))
    while(true)
    {
        val option : Int = ih.getInt("1. Add a student\n" +
                "2. Search for student by ID\n" +
                "3. Search for students by name\n" +
                "4. Quit")

        when (option){
            1 -> app.createAndEnrolStudent()
            2 -> println(app.getStudentById())
            3 -> for(student in app.getStudentsByName()) {
                println(student)
            }
            4 -> { println("Exiting...")
                exitProcess(0)
                }
            else -> println("Invalid value, Options: [1|2|3|4]")
        }

    }




//    val mark : Int= ih.getInt("Enter mark")
//
//    val stud = Master(1, "Test", "Test")
//    stud.mark = mark
//    println("Masters")
//    println(stud.getGrade())
//    println("Did pass: ${stud.didPass()}")
//
//    val mark2 : Int= ih.getInt("Enter mark")
//
//    val stud2 = Undergraduate(1, "Test", "Test")
//    stud2.mark = mark2
//    println("Undergrad")
//    println(stud2.getGrade())
//    println("Did pass: ${stud2.didPass()}")


//    var id = 1
//    val noStudents = 3
//    for(i in 0..<noStudents)
//    {
//        id += 1
//        val name = ih.getString("Enter a name")
//        val course = ih.getString("Enter a course")
//        liststud.add(Undergraduate(id, name, course))
//    }
//    for(i in 0..<noStudents)
//    {
//        println(liststud[i])
//    }
}