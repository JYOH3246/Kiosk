import java.lang.NumberFormatException

fun main() {


    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    while (true) {
        var menu = Menu()
        // UI 출력
        menu.mainMenu()
        // 원하는 항목을 입력받는 Input
        var except = Exception()
        except.exception()

        val selectMenu = except.returnValue()
        //val selectMenu = except.returnValue()
        /*
        val selectMainMenu: Int
        try {
            selectMainMenu = readln().toInt()  // 여기서 세팅을
        }
        catch (e: java.lang.NumberFormatException) {
            println("숫자를 입력해 주시기 바랍니다.")
            continue
        }
         */
        // 조건 : input에 값을 입력했을 때

        when (selectMenu) {
            // selectMainMenu에 1이 들어왔을 때
            1 -> while (true) {
                var burger = Burger()
                burger.burgerMenu()
                var selectBurgerMenu: Int
                // input 예외처리 : 숫자를 입력하지 않으면 input 창으로
                while (true) {
                    try {
                        selectBurgerMenu = readln().toInt()
                    } catch (e: NumberFormatException) {
                        println("숫자를 입력해 주시기 바랍니다.")
                        continue
                    }
                    break
                }

            }

            else -> {
                println("프로그램을 종료합니다.")
                break
            }
        }
    }
}

