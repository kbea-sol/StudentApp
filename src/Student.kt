class Student (val id : Int, var name : String,
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

    fun getGrade() : String{
        return when(this.mark){
            in 70..100 -> "First"
            in 60..69 -> "2/1"
            in 50..59 -> "2/2"
            in 40..49 -> "Third"
            in 0..39 -> "Fail"
            else -> "Invalid mark"
        }
    }
    fun didPass() : Boolean{
        if(this.mark >= 40){
            return true
        }
        return false
    }





}