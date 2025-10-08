public class Master(id : Int, name : String, course : String)
    : Student(id, name, course) {

    override fun toString() : String
    {
        return "Master\nName: $name\nCourse: $course\nMark: $mark"
    }

    override fun getGrade(): String {
        return when (this.mark) {
            in 70..100 -> "Distinction"
            in 60..69 -> "Merit"
            in 40..59 -> "Pass"
            in 0..39 -> "Fail"
            else -> "Invalid mark"
        }

    }
}