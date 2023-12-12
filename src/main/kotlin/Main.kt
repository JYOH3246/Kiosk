fun main() {
    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    while (true) {
        // UI 출력
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. 종료            | 프로그램 종료")

        println("입력 시에는 숫자만 입력해 주시기 바랍니다.")
        // 원하는 항목을 입력받는 Input
        val selectCalculation: Int // 선언부 : 선언만 먼저 하고 값은 다른 지점에서 주는 것도 가능
        // try : try문 안에는 예외가 발생하는 지점이 들어가야 한다. 그 지점이 들어가지 않으면 예외가 계속 발생함
        try {
            selectCalculation = readln().toInt()  // 여기서 세팅을
        }
        // catch : java.lang.NumberFormatException 예외를 처리. 예외처리 후에 UI 출력 지점으로 이동
        catch (e: java.lang.NumberFormatException) {
            println("숫자를 입력해 주시기 바랍니다.")
            continue
        }

        // 조건 : input에 값을 입력했을 때
        when (selectCalculation) {
            // selectCalculation에 1이 들어왔을 때
            1 -> while (true) {
                println("[ Bugers MENU ]")
                println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
                println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
                println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
                println("0. 뒤로가기      | 뒤로가기")
                var num1: Int
                // input 예외처리 : 숫자를 입력하지 않으면 input 창으로
                while (true) {
                    try {
                        num1 = readln().toInt()
                    } catch (e: java.lang.NumberFormatException) {
                        println("숫자를 입력해 주시기 바랍니다.")
                        continue
                    }
                    break
                }
                if (num1 == 0) break

            }

            else -> {
                println("프로그램을 종료합니다.")
                break
            }
        }
    }
}

