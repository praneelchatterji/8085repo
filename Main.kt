
fun identifyInstruction(str:String):String?//identifies instruction
{
    var instruction:String?=""//instruction is segregated
    for(i in 0..str.length-1 step 1)
    {
        if(str[i]!=' ')
            instruction += str[i]
        else
            break
    }
    return instruction
}

fun executeInstruction(register:Registers,line:String){
    val i8085=Instructions8085(register)
    var instruction=identifyInstruction(line)
    when (instruction){
        "MVI"-> i8085.mvi(register,line)

        else -> throw IllegalArgumentException("Invalid instruction name: $instruction")
    }

}
fun main() {
    var register:Registers=Registers()//class Object Instance Created
    var Str:String = "MVI A,A1"

    executeInstruction(register,Str)
    Str="MVI B,AF"
    executeInstruction(register,Str)
    register.printRegisters()
    //register.printMemory()



    println()
}