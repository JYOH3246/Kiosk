class Concrete : Food(),Store {
    private var input:Int =0

    override fun displayInfo() {
        println("[ Concretes MENU ]")
        println("1. Shack Attack           | W 6.2 | 진한 초콜릿 커스터드에 퍼지 소스와 세 가지 초콜릿 토핑이 블렌딩된 쉐이크쉑의 대표 콘크리트")
        println("2. Honey Butter Crunch    | W 6.2 | 바닐라 커스터드에 허니 버터 소스와 슈가 콘이 달콤하게 블렌딩된 콘크리트")
        println("3. Better 2Gether         | W 6.2 | 바닐라와 초콜릿 커스터드를 반씩 넣고 초콜릿 트러플 쿠키 도우와 쇼트브레드를 믹스한, 함께라서 더욱 특별한 콘크리트")
        println("4. Cheongdam327           | W 6.2 | 부드럽고 달콤한 바나나와 꿀, 그리고 바삭한 쇼트브레드가 어우러진 쉐이크쉑 청담의 시그니처 콘크리트")
        println("5. Gangnam                | W 6.2 | 고소한 콩가루와 쇼트브레드, 딸기잼이 어우러진 쉐이크쉑 강남의 시그니처 콘크리트")
        println("0. 뒤로가기                | 뒤로가기")
        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
    }

    override fun inputWithException() {
        while(true) {
            try {
                input = readln().toInt()
            }
            // catch : java.lang.NumberFormatException 예외를 처리.
            catch (e: java.lang.NumberFormatException) {
                println("콘크리트 이름 대신 숫자를 입력해 주세요.")
                continue
            }
            break
        }
    }

    override fun returnValue(): Int {
        return input
    }
}