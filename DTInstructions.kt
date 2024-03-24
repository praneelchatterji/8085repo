open class DTInstructions(register: Registers){//DATA TRANSFER INSTRUCTIONS' CLASS

    fun mvi(register: Registers,line: String)
    {

        var registerName:String=""
        var value= 0
        for (i in 0..line.length-1 step 1)
        {
            if(line[i]==',')
            {
                registerName="${line[i-1]}"
                val values="${line[i+1]}${line[i+2]}"
                value=values.toInt(16)
            }

        }
        register.set(registerName,value)
    }

    fun mov(register: Registers,line: String)
    {

    }


}