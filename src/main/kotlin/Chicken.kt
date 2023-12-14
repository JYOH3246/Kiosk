class Chicken : Food(),ProductInfo {
    private var list = ArrayList<String>()
    private var comment = ArrayList<String>()
    private var price = ArrayList<Int>()
    override fun displayInfo() {
        println("[ Chicken MENU ]")
        for (i in 0..<list.size) {
            println("${i+1}. ${list[i]}  | ${price[i]} |  ${comment[i]}")
        }
        println("0. 뒤로가기                 | 뒤로가기")
        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
    }

    override fun inputWithException() {
        super.inputWithException()
    }

    override fun returnValue(): Int {
        return super.returnValue()
    }

    override fun list () {
        list.add("Bourbon Bacon Chicken")
        list.add("Hot Chicken")
        list.add("Chicken Shack")
        list.add("Chick'n Bites 6-count")
        list.add("Chick'n Bites 10-count")
    }

    override fun comment() {
        comment.add("쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드")
        comment.add("바삭하고 두툼한 치킨 통살과 스파이시 슬로, 핫 스파이시 시즈닝이 토핑된 치킨 버거")
        comment.add("바삭하고 두툼한 치킨 통살과 양상추, 피클, 허브 마요 소스가 토핑된 치킨 버거")
        comment.add("한 입에 먹기 좋은 바삭한 치킨 바이트와 허니 머스터드 또는 BBQ 소스를 선택하여 함께 즐기는 메뉴")
        comment.add("한 입에 먹기 좋은 바삭한 치킨 바이트와 허니 머스터드 또는 BBQ 소스를 선택하여 함께 즐기는 메뉴")
    }

    override fun price () {
        price.add(11800)
        price.add(9500)
        price.add(8000)
        price.add(5900)
        price.add(8200)
    }
    fun returnList (): ArrayList<String> {
        return list
    }
    fun returnPrice (): ArrayList<Int> {
        return price
    }
    fun returnComment (): ArrayList<String> {
        return comment
    }
}