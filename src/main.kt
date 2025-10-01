import Student
import InputHandlerCLI
fun main()
{


    val ih : InputHandler = InputHandlerCLI()
    var students = arrayOf<Student>()
    var id : Int = 0

    val name = ih.getString("Enter student name")
    val course = ih.getString("Enter student course")
    val mark = ih.getInt("Enter student mark")
    var stud = Student(1, name, course, mark)
    println(stud.getGrade())


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