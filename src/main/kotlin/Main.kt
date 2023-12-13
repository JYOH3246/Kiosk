fun main() { //gittest
    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    while (true) {
        val food = Food()
        // UI 출력
        food.displayInfo()
        // 숫자를 입력받는 Input with 예외처리
        food.inputWithException()
        val selectFood = food.returnValue()
        // 조건 : input에 값을 입력했을 때
        when (selectFood) {
            //버거
            1 -> {
                while (true) {
                    val burger = Burger()
                    burger.displayInfo()
                    burger.inputWithException()
                    val selectBurger = burger.returnValue()
                    println(selectBurger)
                    break
                }
            }
            //콘크리트
            2 -> {
                while (true) {
                    val concrete = Concrete()
                    concrete.displayInfo()
                    concrete.inputWithException()
                    val selectConcreteMenu = concrete.returnValue()
                    println(selectConcreteMenu)
                    break
                }
            }
            //음료
            3 -> {
                while (true) {
                    val drink = Drink()
                    drink.displayInfo()
                    drink.inputWithException()
                    val selectDrinkMenu = drink.returnValue()
                    println(selectDrinkMenu)
                    break
                }
            }
            //치킨
            4 -> {
                while (true) {
                    val chicken = Chicken()
                    chicken.displayInfo()
                    chicken.inputWithException()
                    val selectChickenMenuMenu = chicken.returnValue()
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

