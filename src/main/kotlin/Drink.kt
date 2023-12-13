class Drink : Store{
    private var input:Int =0
    override fun displayInfo() {
        // UI 출력
        println("[ Drink MENU ]")
        println("1. Raspberry Lemonade        | W 4.8 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. Lemonade                  | W 4.3 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. Abita Root Beer           | W 4.8 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. Shack Coffee              | W 3.0 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Fresh Brewed Iced Tea     | W 3.5 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기      | 뒤로가기")
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