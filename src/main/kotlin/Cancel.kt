class Cancel : Store {
    private var input:Int =0
    override fun displayInfo() {
        println("[Cancel]")
        println("주문한 내역을 초기화하시겠습니까?")
        println("1. 예    2. 아니오")
        inputWithException()

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

    override fun returnValue(

    ): Int {
        return input
    }
    fun cancelCart (
        list: ArrayList<String>,
        price: ArrayList<Int>,
        comment: ArrayList<String>
    ) {
        if (input ==1 ) {
            list.clear()
            price.clear()
            comment.clear()
            println("주문이 초기화되었습니다.")
        }
        else if (input ==2) {
            println("메뉴판으로 돌아갑니다.")

        }
    }
}

