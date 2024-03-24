class Registers{
    var A = 0
    var B = 0; var C = 0
    var D = 0; var E = 0
    var H = 0; var L= 0

    var flagRegister = 0
    var programCounter = 0
    var stackPointer = 0

    //////////////////////////////////////////////////
    var memory = Array(65535) { 0 }
    //////////////////////////////////////////////////
    //memory[11]=99;


    fun reset(registerName:String)
    {
        when(registerName)
        {
            "A"-> A=0
            "B"-> B=0
            "C"-> C=0
            "D"-> D=0
            "E"-> E=0
            "H"-> H=0
            "L"-> L=0

            "flagRegister"-> flagRegister=0
            "programCounter"-> programCounter=0
            "stackPointer"-> stackPointer=0
            else -> throw IllegalArgumentException("Invalid register name: $registerName")
        }
    }

    fun set(registerName: String, value: Int) {
        when(registerName) {
            "A" -> A = value
            "B" -> B = value
            "C" -> C = value
            "D" -> D = value
            "E" -> E = value
            "H" -> H = value
            "L" -> L = value
            else -> throw IllegalArgumentException("Invalid register name: $registerName")
        }
    }


    fun printRegisters() {
        println("A: $A")
        println("B: $B   C: $C")
        println("D: $D   E: $E")
        println("H: $H   L: $L")
        println("Flag Register: $flagRegister")
        println("Program Counter: $programCounter")
        println("Stack Pointer: $stackPointer")

    }

    fun printMemory()
    {
        for(i in 0..4000)
        {
            print("${memory[i]}  ")
            if(i%10==0)
                println();

        }
    }


}