import java.lang.NumberFormatException

fun main() {


    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    while (true) {
        val menu = Menu()
        // UI 출력
        menu.mainMenu()
        // 숫자를 입력받는 Input
        val inputMainMenu = InputException()
        inputMainMenu.exception()
        val selectMenu = inputMainMenu.returnValue()
        // 조건 : input에 값을 입력했을 때
        when (selectMenu) {
            // selectMainMenu에 1이 들어왔을 때
            1 -> while (true) {
                var burger = Burger()
                burger.burgerMenu()
                val inputBurgerMenu = InputException()
                inputBurgerMenu.exception()
                val selectBurgerMenu = inputBurgerMenu.returnValue()
                println(selectBurgerMenu)
                break
            }
            2 -> while (true) {
                var concrete = Concrete()
                concrete.concreteMenu()
                val inputConcreteMenu = InputException()
                inputConcreteMenu.exception()
                val selectConcreteMenu = inputConcreteMenu.returnValue()
                println(selectConcreteMenu)
                break
            }
            3 -> while (true) {
                var drink = Drink()
                drink.drinkMenu()
                val inputDrinkMenu = InputException()
                inputDrinkMenu.exception()
                val selectDrinkMenu = inputDrinkMenu.returnValue()
                println(selectDrinkMenu)
                break
            }
            4 -> while (true) {
                var chicken = ChickenMenu()
                chicken.chickenMenu()
                val inputChickenMenuMenu = InputException()
                inputChickenMenuMenu.exception()
                val selectChickenMenuMenu = inputChickenMenuMenu.returnValue()
                println(selectChickenMenuMenu)
                break
            }

            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
            else -> {
                println("올바른 숫자를 입력해 주세요.")
            }
        }
    }
}

