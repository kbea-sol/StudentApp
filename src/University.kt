class University {
    val listOfStudents = mutableListOf<Student>()

    fun enrolStudent(stud : Student){
        listOfStudents.add(stud)
    }

    fun findStudentById(id : Int): Student? {
        for(student in listOfStudents){
            if(student.id == id){
                return student
            }
        }
        return null
    }

    fun findStudentsByName(name : String): MutableList<Student> {
        val studList = mutableListOf<Student>()
        for(student in listOfStudents){
            if(student.name == name){
                studList.add(student)
            }
        }
        return studList
    }
}