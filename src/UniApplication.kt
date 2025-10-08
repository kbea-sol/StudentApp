import Student

class UniApplication(val ih : InputHandler, val uni : University){

    var id = 1

    fun createAndEnrolStudent()
    {
        val stud : Undergraduate = createStudent()
        uni.enrolStudent(stud)
        id += 1
    }

    private fun createStudent(): Undergraduate{
        val name = ih.getString("Enter a name")
        val course = ih.getString("Enter a course")
        return Undergraduate(1, name, course)
    }

    fun getStudentById():Student?{
        val id : Int = ih.getInt("Enter the student ID")
        return uni.findStudentById(id)
    }

    fun getStudentsByName():List<Student>{
        val name : String = ih.getString("Enter the student name")
        return uni.findStudentsByName(name)
    }

}
