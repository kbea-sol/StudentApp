import Student

class UniApplication(val ih : InputHandler, val uni : University){

    var id = 1

    fun createAndEnrolStudent()
    {
        var stud : Student? = null
        if(ih.getBool("Are you a master's student?")){
            stud = createMaster()
        }
        else{
            stud = createUndergraduate()
        }
        uni.enrolStudent(stud)
        id += 1
    }

    private fun createMaster(): Master{
        val name = ih.getString("Enter a name")
        val course = ih.getString("Enter a course")
        return Master(id, name, course)
    }

    private fun createUndergraduate(): Undergraduate{
        val name = ih.getString("Enter a name")
        val course = ih.getString("Enter a course")
        return Undergraduate(id, name, course)
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
