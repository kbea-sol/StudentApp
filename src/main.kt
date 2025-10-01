import Student
import InputHandlerCLI
fun main()
{


    val ih : InputHandler = InputHandlerCLI()

    val mark : Int= ih.getInt("Enter mark")

    val stud = Student(1, "Test", "Test")
    stud.mark = mark
    println(stud.getGrade())
    println("Did pass: ${stud.didPass()}")


//    println(stud.getGrade())


//    while(true)
//    {
//        id += 1
//        val name = ih.getString("Enter a name")
//        val course = ih.getString("Enter a course")
//        val mark = ih.getInt("Enter a mark")
//        students += Student(id, name, course, mark)
//        println(students[id-1])
//    }
}