class Order : Store {
    private var input:Int =0
    private var account:Int = 20000

    override fun displayInfo() {
        println("[Orders]")
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
    fun isCartSizeZero(
        list: ArrayList<String>,
        price: ArrayList<Int>,
        comment: ArrayList<String>
    )  {
        while(true){
            if (list.size != 0) {
                println("아래와 같이 주문하시겠습니까?")
                println("[Orders]")
                for (i in 0..<list.size){
                    println("${list[i]}  | ${price[i]} | ${comment[i]}")
                }
                println("[Total]")
                var total = 0
                for (i in 0..<list.size){
                    total += price[i]
                }
                println("${total}원")
                println("1. 주문      2. 메뉴판")
                inputWithException()
                if (input ==1) {
                    if (total>account) {
                        println("현재 잔액은 ${account}원으로 ${total-account}원이 부족합니다.")
                    }
                    else {
                        println("주문이 완료되었습니다. 처음 화면으로 돌아갑니다.")
                        account -= total
                        list.clear()
                        price.clear()
                        comment.clear()
                        println(account)
                        break
                    }
                }
                else if (input==2) {
                    println("메뉴판으로 돌아갑니다.")
                    break
                }
                else {
                    println("숫자를 정확히 입력해 주세요.")
                    continue
                }
            }
            else {
                println("상품이 없습니다. 처음 화면으로 돌아갑니다.")
                break
            }
        }

    }
    fun returnAccount (): Int {
        return account
    }
}