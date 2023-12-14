class Drink : Food(),ProductInfo{
    private var list = ArrayList<String>()
    private var comment = ArrayList<String>()
    private var price = ArrayList<Int>()
    override fun displayInfo() {
        // UI 출력
        println("[ Drink MENU ]")
        for (i in 0..<list.size) {
            println("${i+1}. ${list[i]}  | ${price[i]} |  ${comment[i]}")
        }
        println("0. 뒤로가기      | 뒤로가기")
        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
    }

    override fun inputWithException() {
        super.inputWithException()
    }

    override fun returnValue(): Int {
        return super.returnValue()
    }

    override fun list () {
        list.add("Raspberry Lemonade")
        list.add("Lemonade")
        list.add("Abita Root Beer")
        list.add("Shack Coffee")
        list.add("Fresh Brewed Iced Tea")
    }

    override fun comment() {
        comment.add("쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드")
        comment.add("매장에서 직접 만드는 상큼한 레몬에이드")
        comment.add("청량감 있는 독특한 미국식 무알콜 탄산음료")
        comment.add("쉑 블렌드 원두를 사용한 밸런스 좋은 블랙 커피")
        comment.add("직접 유기농 홍차를 우려낸 아이스 티")
    }

    override fun price () {
        price.add(4800)
        price.add(4300)
        price.add(4800)
        price.add(3000)
        price.add(3500)
    }
}