open class Food : Store {
    private var input:Int =0
    override fun displayInfo() {
        // UI 출력
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers    | 앵거스 비프 통살을 다져만든 버거")
        println("2. Concretes  | 쫀득하고 진한 맛의 커스터드와 다양한 믹스-인이 만나 탄생한 쉐이크쉑만의 디저트 메뉴")
        println("3. Drinks     | 매장에서 직접 만드는 음료")
        println("4. Chicken    | 신선한 치킨 통살을 버터밀크에 수비드 하여 주문과 동시에 바삭하게 튀겼습니다.")
        println("0. 종료        | 프로그램 종료")
        println("[ Order ]")
        println("5. Order      | 주문 관리가 가능합니다.")
        println("6. Cancel     | 주문 취소가 가능합니다.")
        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
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