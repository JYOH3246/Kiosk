fun main() {
    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    while (true) {
        val food = Food()
        // UI 출력 (인터페이스)
        food.displayInfo()
        // 숫자를 입력받는 Input with 예외처리
        val inputFood = InputWithException()
        inputFood.inputWithException()
        val selectMenu = inputFood.returnValue()
        // 조건 : input에 값을 입력했을 때
        when (selectMenu) {
            //버거
            1 -> {
                while (true) {
                    val burger = Burger()
                    burger.burgerMenu()
                    val inputBurgerMenu = InputWithException()
                    inputBurgerMenu.inputWithException()
                    val selectBurgerMenu = inputBurgerMenu.returnValue()
                    println(selectBurgerMenu)
                    break
                }
            }
            //콘크리트
            2 -> {
                while (true) {
                    val concrete = Concrete()
                    concrete.concreteMenu()
                    val inputConcreteMenu = InputWithException()
                    inputConcreteMenu.inputWithException()
                    val selectConcreteMenu = inputConcreteMenu.returnValue()
                    println(selectConcreteMenu)
                    break
                }
            }
            //음료
            3 -> {
                while (true) {
                    val drink = Drink()
                    drink.drinkMenu()
                    val inputDrinkMenu = InputWithException()
                    inputDrinkMenu.inputWithException()
                    val selectDrinkMenu = inputDrinkMenu.returnValue()
                    println(selectDrinkMenu)
                    break
                }
            }
            //치킨
            4 -> {
                while (true) {
                    val chicken = ChickenMenu()
                    chicken.chickenMenu()
                    val inputChickenMenuMenu = InputWithException()
                    inputChickenMenuMenu.inputWithException()
                    val selectChickenMenuMenu = inputChickenMenuMenu.returnValue()
                    println(selectChickenMenuMenu)
                    break
                }
            }
            // 종료
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
            // 그 외 숫자
            else -> {
                println("올바른 숫자를 입력해 주세요.")
            }
        }
    }
}

