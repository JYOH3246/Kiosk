class Exception {
    private var input:Int =0

    fun exception() {
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
    fun returnValue(): Int {
        return input
    }
}
/*
while (true) {
                    try {
                        num2 = readLine()!!.toDouble()
                    }
                    catch (e:java.lang.NumberFormatException) {
                        println("숫자를 입력해 주시기 바랍니다.")
                        continue
                    }
                    break
                }
 */