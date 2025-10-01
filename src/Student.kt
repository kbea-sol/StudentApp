class Student (val id : Int, var name : String,
               var course : String, var markIn : Int){

    var mark = 0
        set(newMark){
            if(newMark in 0..100) {
                field = newMark
            }
        }

    init{
        mark = markIn
    }

    override fun toString() : String
    {
        return "Name: $name\nCourse: $course\nMark: $markIn"
    }





}