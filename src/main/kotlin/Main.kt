fun main() { //gittest
    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    val cartList = ArrayList<String>()
    val cartPrice = ArrayList<Int>()
    val cartComment = ArrayList<String>()
    loop@ while (true) {
        val food = Food()
        val account = 20000
        // UI 출력
        food.displayInfo()
        println("상품이 ${cartList.size}개")
        // 숫자를 입력받는 Input with 예외처리
        food.inputWithException()
        val selectFood = food.returnValue()
        // 조건 : input에 값을 입력했을 때
        when (selectFood) {
            //버거
            1 -> {
                while (true) {
                    val burger = Burger()
                    burger.list()
                    burger.price()
                    burger.comment()
                    burger.displayInfo()

                    burger.inputWithException()
                    val selectBurger = burger.returnValue()
                    println(selectBurger)
                    if (selectBurger == 0) {
                        continue@loop
                    }
                    val burgerList = burger.returnList()
                    val burgerPrice = burger.returnPrice()
                    val burgerComment = burger.returnComment()
                    when (selectBurger) {
                        (burgerList.indexOf(burgerList[0])+1) -> {
                            println("${burgerList[0]}  | ${burgerPrice[0]} | ${burgerComment[0]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            burger.inputWithException()
                            val addBurger = burger.returnValue()
                            if (addBurger == 1) {
                                println("${burgerList[0]} 가 장바구니에 추가되었습니다.")
                                cartList.add(burgerList[0])
                                cartPrice.add(burgerPrice[0])
                                cartComment.add(burgerComment[0])
                                continue
                            }
                            else if (addBurger ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }

                        }
                        (burgerList.indexOf(burgerList[1])+1) -> {
                            println("${burgerList[1]}  | ${burgerPrice[1]} | ${burgerComment[1]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            burger.inputWithException()
                            val addBurger = burger.returnValue()
                            if (addBurger == 1) {
                                println("${burgerList[1]} 가 장바구니에 추가되었습니다.")
                                cartList.add(burgerList[1])
                                cartPrice.add(burgerPrice[1])
                                cartComment.add(burgerComment[1])
                            }
                            else if (addBurger ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (burgerList.indexOf(burgerList[2])+1) -> {
                            println("${burgerList[2]}  | ${burgerPrice[2]} | ${burgerComment[2]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            burger.inputWithException()
                            val addBurger = burger.returnValue()
                            if (addBurger == 1) {
                                println("${burgerList[2]} 가 장바구니에 추가되었습니다.")
                                cartList.add(burgerList[2])
                                cartPrice.add(burgerPrice[2])
                                cartComment.add(burgerComment[2])
                            }
                            else if (addBurger ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (burgerList.indexOf(burgerList[3])+1) -> {
                            println("${burgerList[3]}  | ${burgerPrice[3]} | ${burgerComment[3]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            burger.inputWithException()
                            val addBurger = burger.returnValue()
                            if (addBurger == 1) {
                                println("${burgerList[3]} 가 장바구니에 추가되었습니다.")
                                cartList.add(burgerList[3])
                                cartPrice.add(burgerPrice[3])
                                cartComment.add(burgerComment[3])
                            }
                            else if (addBurger ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (burgerList.indexOf(burgerList[4])+1) -> {
                            println("${burgerList[4]}  | ${burgerPrice[4]} | ${burgerComment[4]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            burger.inputWithException()
                            val addBurger = burger.returnValue()
                            if (addBurger == 1) {
                                println("${burgerList[4]} 가 장바구니에 추가되었습니다.")
                                cartList.add(burgerList[4])
                                cartPrice.add(burgerPrice[4])
                                cartComment.add(burgerComment[4])
                            }
                            else if (addBurger ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                    }
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
                    val selectChickenMenu = chicken.returnValue()
                    println(selectChickenMenu)
                    break
                }
            }
            // 종료
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
            5 -> {
                if (cartList.size != 0) {
                    println("아래와 같이 주문하시겠습니까?")
                    println("[Orders]")
                    for (i in 0..<cartList.size){
                        println("${cartList[i]}  | ${cartPrice[i]} | ${cartComment[i]}")
                    }
                    println("[Total]")
                    var total: Int = 0
                    for (i in 0..<cartList.size){
                        total += cartPrice[i]
                    }
                    println("${total}원")
                    println("1. 주문      2. 메뉴판")
                    var input = readln().toInt()
                    if (input ==1) {
                        if (total>account) {
                            println("현재 잔액은 ${account}원으로 ${total-account}원이 부족합니다.")
                        }
                        else {
                            println("주문이 완료되었습니다. 처음 화면으로 돌아갑니다.")
                            cartList.clear()
                            cartPrice.clear()
                            cartComment.clear()
                        }
                    }
                    else {
                        continue
                    }
                }
                else {
                    println("상품이 없습니다. 처음 화면으로 돌아갑니다.")
                }
                continue
            }

            // 그 외 숫자
            else -> {
                println("올바른 숫자를 입력해 주세요.")
            }
        }
    }
}

