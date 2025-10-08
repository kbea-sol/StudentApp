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
}