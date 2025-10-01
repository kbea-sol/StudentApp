class InputHandlerCLI : InputHandler{

    override fun getInt(prompt : String) : Int{
        while(true) {
            try {
                println(prompt)
                return readln().toInt()
            } catch (e: NumberFormatException) {
                println("Error: ${e.message}")
            }
        }
    }

    override fun getString(prompt : String) : String{
        println(prompt)
        return readln()
    }

    override fun getBool(prompt : String) : Boolean{
        val yesNo = "[Y/N]"
        while(true)
        {
            println("$prompt $yesNo")
            val input : String = readln().lowercase()

            when(input){
                "y", "yes"  -> return true
                "n", "no"   -> return false
                else        -> println("Invalid input. Enter Y or N.")
            }
        }
    }

    override fun getChar(prompt : String) : Char{
        println(prompt)
        while(true)
        {
            val input : String = readln()
            if(input.length == 1)
            {
                return input[0]
            }
            else{
                println("Input must be a single character")
            }
        }
    }
}