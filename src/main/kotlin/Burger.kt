class Burger : Food(), ProductInfo {
    private var list = ArrayList<String>()
    private var comment = ArrayList<String>()
    private var price = ArrayList<Int>()

    override fun displayInfo() {
        // UI 출력
        println("[ Burgers MENU ]")
        for (i in 0..<list.size) {
            println("${i + 1}. ${list[i]}  | ${price[i]} |  ${comment[i]}")
        }
        println("0. 뒤로가기       | 뒤로가기")
        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
    }

    override fun inputWithException() {
        super.inputWithException()
    }

    override fun returnValue(): Int {
        return super.returnValue()
    }

    override fun list() {
        list.add("ShackBurger")
        list.add("SmokeShack")
        list.add("Shroom Burger")
        list.add("Cheeseburger")
        list.add("Hamburger")
    }

    override fun comment() {
        comment.add("토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        comment.add("베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        comment.add("몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        comment.add("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        comment.add("비프패티를 기반으로 야채가 들어간 기본버거")
    }

    override fun price() {
        price.add(6900)
        price.add(8900)
        price.add(9400)
        price.add(6900)
        price.add(5400)
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

