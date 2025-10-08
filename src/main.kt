import Student
import InputHandlerCLI
fun main()
{

    val liststud = mutableListOf<Student>()
    val ih : InputHandler = InputHandlerCLI()

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


    var id = 1
    val noStudents = 3
    for(i in 0..<noStudents)
    {
        id += 1
        val name = ih.getString("Enter a name")
        val course = ih.getString("Enter a course")
        liststud.add(Undergraduate(id, name, course))
    }
    for(i in 0..<noStudents)
    {
        println(liststud[i])
    }
}