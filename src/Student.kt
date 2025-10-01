abstract class Student (val id : Int, var name : String,
               var course : String){

    var mark = 0
        set(newMark){
            if(newMark in 0..100) {
                field = newMark
            }
        }

    override fun toString() : String
    {
        return "Name: $name\nCourse: $course\nMark: $mark"
    }

    abstract fun getGrade() : String

    fun didPass() : Boolean{
        return (this.mark >= 40)
    }
}