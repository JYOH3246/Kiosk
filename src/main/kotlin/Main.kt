fun main() { //gittest
    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    var cartList = ArrayList<String>()
    var cartPrice = ArrayList<Int>()
    var cartComment = ArrayList<String>()
    var account = 20000
    loop@ while (true) {

        var food = Food()
        println(account)
        // UI 출력
        food.displayInfo()
        println("상품이 ${cartList.size}개")
        // 숫자를 입력받는 Input with 예외처리
        food.inputWithException()
        var selectFood = food.returnValue()
        // 조건 : input에 값을 입력했을 때
        when (selectFood) {
            //버거
            1 -> {
                while (true) {
                    var burger = Burger()
                    burger.list()
                    burger.price()
                    burger.comment()
                    burger.displayInfo()

                    burger.inputWithException()
                    var selectBurger = burger.returnValue()
                    println(selectBurger)
                    if (selectBurger == 0) {
                        continue@loop
                    }
                    var burgerList = burger.returnList()
                    var burgerPrice = burger.returnPrice()
                    var burgerComment = burger.returnComment()
                    when (selectBurger) {
                        (burgerList.indexOf(burgerList[0])+1) -> {
                            println("${burgerList[0]}  | ${burgerPrice[0]} | ${burgerComment[0]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            burger.inputWithException()
                            var addBurger = burger.returnValue()
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
                            var addBurger = burger.returnValue()
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
                            var addBurger = burger.returnValue()
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
                            var addBurger = burger.returnValue()
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
                            var addBurger = burger.returnValue()
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
                    var concrete = Concrete()
                    concrete.displayInfo()
                    concrete.inputWithException()
                    var selectConcreteMenu = concrete.returnValue()
                    println(selectConcreteMenu)
                    break
                }
            }
            //음료
            3 -> {
                while (true) {
                    var drink = Drink()
                    drink.displayInfo()
                    drink.inputWithException()
                    var selectDrinkMenu = drink.returnValue()
                    println(selectDrinkMenu)
                    break
                }
            }
            //치킨
            4 -> {
                while (true) {
                    var chicken = Chicken()
                    chicken.displayInfo()
                    chicken.inputWithException()
                    var selectChickenMenu = chicken.returnValue()
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
                var order = Order()
                order.displayInfo()
                order.isCartSizeZero(
                    cartList,
                    cartPrice,
                    cartComment)
                account = order.returnAccount()
            }
            6 -> {
                var cancel = Cancel()
                cancel.displayInfo()
                cancel.cancelCart(cartList,
                    cartPrice,
                    cartComment)
            }

            // 그 외 숫자
            else -> {
                println("올바른 숫자를 입력해 주세요.")
            }
        }


    }

}

