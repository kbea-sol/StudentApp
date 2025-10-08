import Student
import InputHandlerCLI
import kotlin.system.exitProcess

fun main()
{
    val uni : University = University()
    val ih : InputHandler = InputHandlerCLI()
    val app : UniApplication = UniApplication(ih, uni)

    while(true)
    {
        val option : Int = ih.getInt("1. Add a student\n" +
                "2. Search for student by ID\n" +
                "3. Search for students by name\n" +
                "4. Quit")

        when (option){
            1 -> app.createAndEnrolStudent()
            2 -> {
                val stud : Student? = app.getStudentById()
                if(stud == null){
                    println("Invalid student id")
                    continue
                }
                println(stud)
            }
            3 -> {
                val studlist : List<Student> = app.getStudentsByName()
                if(studlist.isEmpty())
                {
                    println("No students with given name to display")
                    continue
                }
                for(student in studlist) {
                    println(student)
                }
            }
            4 -> { println("Exiting...")
                exitProcess(0)
                }
            else -> println("Invalid value, Options: [1|2|3|4]")
        }

    }
}