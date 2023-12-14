class Concrete : Food(),ProductInfo {
    private var list = ArrayList<String>()
    private var comment = ArrayList<String>()
    private var price = ArrayList<Int>()


    override fun displayInfo() {
        println("[ Concretes MENU ]")
        for (i in 0..<list.size) {
            println("${i+1}. ${list[i]}  | ${price[i]} |  ${comment[i]}")
        }
        println("0. 뒤로가기                | 뒤로가기")
        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
    }

    override fun inputWithException() {
        super.inputWithException()
    }

    override fun returnValue(): Int {
        return super.returnValue()
    }

    override fun list () {
        list.add("Shack Attack")
        list.add("Honey Butter Crunch")
        list.add("Better 2Gether")
        list.add("Cheongdam327")
        list.add("Gangnam")
    }

    override fun comment() {
        comment.add("진한 초콜릿 커스터드에 퍼지 소스와 세 가지 초콜릿 토핑이 블렌딩된 쉐이크쉑의 대표 콘크리트")
        comment.add("바닐라 커스터드에 허니 버터 소스와 슈가 콘이 달콤하게 블렌딩된 콘크리트")
        comment.add("바닐라와 초콜릿 커스터드를 반씩 넣고 초콜릿 트러플 쿠키 도우와 쇼트브레드를 믹스한, 함께라서 더욱 특별한 콘크리트")
        comment.add("부드럽고 달콤한 바나나와 꿀, 그리고 바삭한 쇼트브레드가 어우러진 쉐이크쉑 청담의 시그니처 콘크리트")
        comment.add("고소한 콩가루와 쇼트브레드, 딸기잼이 어우러진 쉐이크쉑 강남의 시그니처 콘크리트")
    }

    override fun price () {
        price.add(6200)
        price.add(6200)
        price.add(6200)
        price.add(6200)
        price.add(6200)
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