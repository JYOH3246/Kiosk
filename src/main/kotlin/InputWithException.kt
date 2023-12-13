class InputWithException : Store {
    //input이 들어가면 var로 처리하자
    private var input:Int =0
    override fun displayInfo() {
        TODO("Not yet implemented")
    }

    override fun inputWithException() {
        while(true) {
            try {
                input = readln().toInt()
            }
            // catch : java.lang.NumberFormatException 예외를 처리.
            catch (e: java.lang.NumberFormatException) {
                println("숫자를 입력해 주시기 바랍니다.")
                continue
            }
            break
        }
    }

    override fun returnValue(): Int {
        return input
    }
}
