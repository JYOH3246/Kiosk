fun main() { //gittest
    // 무한루프 : 종료를 선택해야 프로그램이 끝남
    val cartList = ArrayList<String>()
    val cartPrice = ArrayList<Int>()
    val cartComment = ArrayList<String>()
    var account = 50000
    loop@ while (true) {

        val food = Food()
        println(account)
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
                    concrete.list()
                    concrete.price()
                    concrete.comment()
                    concrete.displayInfo()
                    concrete.inputWithException()
                    val selectConcrete = concrete.returnValue()
                    println(selectConcrete)
                    if (selectConcrete == 0) {
                        continue@loop
                    }
                    val concreteList = concrete.returnList()
                    val concretePrice = concrete.returnPrice()
                    val concreteComment = concrete.returnComment()
                    when (selectConcrete) {
                        (concreteList.indexOf(concreteList[0])+1) -> {
                            println("${concreteList[0]}  | ${concretePrice[0]} | ${concreteComment[0]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            concrete.inputWithException()
                            val addConcrete = concrete.returnValue()
                            if (addConcrete == 1) {
                                println("${concreteList[0]} 가 장바구니에 추가되었습니다.")
                                cartList.add(concreteList[0])
                                cartPrice.add(concretePrice[0])
                                cartComment.add(concreteComment[0])
                                continue
                            }
                            else if (addConcrete ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }

                        }
                        (concreteList.indexOf(concreteList[1])+1) -> {
                            println("${concreteList[1]}  | ${concretePrice[1]} | ${concreteComment[1]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            concrete.inputWithException()
                            val addConcrete = concrete.returnValue()
                            if (addConcrete == 1) {
                                println("${concreteList[1]} 가 장바구니에 추가되었습니다.")
                                cartList.add(concreteList[1])
                                cartPrice.add(concretePrice[1])
                                cartComment.add(concreteComment[1])
                            }
                            else if (addConcrete ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (concreteList.indexOf(concreteList[2])+1) -> {
                            println("${concreteList[2]}  | ${concretePrice[2]} | ${concreteComment[2]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            concrete.inputWithException()
                            val addConcrete = concrete.returnValue()
                            if (addConcrete == 1) {
                                println("${concreteList[2]} 가 장바구니에 추가되었습니다.")
                                cartList.add(concreteList[2])
                                cartPrice.add(concretePrice[2])
                                cartComment.add(concreteComment[2])
                            }
                            else if (addConcrete ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (concreteList.indexOf(concreteList[3])+1) -> {
                            println("${concreteList[3]}  | ${concretePrice[3]} | ${concreteComment[3]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            concrete.inputWithException()
                            val addConcrete = concrete.returnValue()
                            if (addConcrete == 1) {
                                println("${concreteList[3]} 가 장바구니에 추가되었습니다.")
                                cartList.add(concreteList[3])
                                cartPrice.add(concretePrice[3])
                                cartComment.add(concreteComment[3])
                            }
                            else if (addConcrete ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (concreteList.indexOf(concreteList[4])+1) -> {
                            println("${concreteList[4]}  | ${concretePrice[4]} | ${concreteComment[4]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            concrete.inputWithException()
                            val addConcrete = concrete.returnValue()
                            if (addConcrete == 1) {
                                println("${concreteList[4]} 가 장바구니에 추가되었습니다.")
                                cartList.add(concreteList[4])
                                cartPrice.add(concretePrice[4])
                                cartComment.add(concreteComment[4])
                            }
                            else if (addConcrete ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                    }
                }
            }
            //음료
            3 -> {
                while (true) {
                    val drink = Drink()
                    drink.list()
                    drink.price()
                    drink.comment()
                    drink.displayInfo()
                    drink.inputWithException()
                    val selectDrink = drink.returnValue()
                    println(selectDrink)
                    if (selectDrink == 0) {
                        continue@loop
                    }
                    val drinkList = drink.returnList()
                    val drinkPrice = drink.returnPrice()
                    val drinkComment = drink.returnComment()
                    when (selectDrink) {
                        (drinkList.indexOf(drinkList[0])+1) -> {
                            println("${drinkList[0]}  | ${drinkPrice[0]} | ${drinkComment[0]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            drink.inputWithException()
                            val addDrink = drink.returnValue()
                            if (addDrink == 1) {
                                println("${drinkList[0]} 가 장바구니에 추가되었습니다.")
                                cartList.add(drinkList[0])
                                cartPrice.add(drinkPrice[0])
                                cartComment.add(drinkComment[0])
                                continue
                            }
                            else if (addDrink ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }

                        }
                        (drinkList.indexOf(drinkList[1])+1) -> {
                            println("${drinkList[1]}  | ${drinkPrice[1]} | ${drinkComment[1]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            drink.inputWithException()
                            val addDrink = drink.returnValue()
                            if (addDrink == 1) {
                                println("${drinkList[1]} 가 장바구니에 추가되었습니다.")
                                cartList.add(drinkList[1])
                                cartPrice.add(drinkPrice[1])
                                cartComment.add(drinkComment[1])
                            }
                            else if (addDrink ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (drinkList.indexOf(drinkList[2])+1) -> {
                            println("${drinkList[2]}  | ${drinkPrice[2]} | ${drinkComment[2]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            drink.inputWithException()
                            val addDrink = drink.returnValue()
                            if (addDrink == 1) {
                                println("${drinkList[2]} 가 장바구니에 추가되었습니다.")
                                cartList.add(drinkList[2])
                                cartPrice.add(drinkPrice[2])
                                cartComment.add(drinkComment[2])
                            }
                            else if (addDrink ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (drinkList.indexOf(drinkList[3])+1) -> {
                            println("${drinkList[3]}  | ${drinkPrice[3]} | ${drinkComment[3]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            drink.inputWithException()
                            val addDrink = drink.returnValue()
                            if (addDrink == 1) {
                                println("${drinkList[3]} 가 장바구니에 추가되었습니다.")
                                cartList.add(drinkList[3])
                                cartPrice.add(drinkPrice[3])
                                cartComment.add(drinkComment[3])
                            }
                            else if (addDrink ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (drinkList.indexOf(drinkList[4])+1) -> {
                            println("${drinkList[4]}  | ${drinkPrice[4]} | ${drinkComment[4]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            drink.inputWithException()
                            val addDrink = drink.returnValue()
                            if (addDrink == 1) {
                                println("${drinkList[4]} 가 장바구니에 추가되었습니다.")
                                cartList.add(drinkList[4])
                                cartPrice.add(drinkPrice[4])
                                cartComment.add(drinkComment[4])
                            }
                            else if (addDrink ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                    }
                }
            }
            //치킨
            4 -> {
                while (true) {
                    val chicken = Chicken()
                    chicken.list()
                    chicken.price()
                    chicken.comment()
                    chicken.displayInfo()
                    chicken.inputWithException()
                    val selectChicken = chicken.returnValue()
                    println(selectChicken)
                    if (selectChicken == 0) {
                        continue@loop
                    }
                    val chickenList = chicken.returnList()
                    val chickenPrice = chicken.returnPrice()
                    val chickenComment = chicken.returnComment()
                    when (selectChicken) {
                        (chickenList.indexOf(chickenList[0])+1) -> {
                            println("${chickenList[0]}  | ${chickenPrice[0]} | ${chickenComment[0]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            chicken.inputWithException()
                            val addChicken = chicken.returnValue()
                            if (addChicken == 1) {
                                println("${chickenList[0]} 가 장바구니에 추가되었습니다.")
                                cartList.add(chickenList[0])
                                cartPrice.add(chickenPrice[0])
                                cartComment.add(chickenComment[0])
                                continue
                            }
                            else if (addChicken ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }

                        }
                        (chickenList.indexOf(chickenList[1])+1) -> {
                            println("${chickenList[1]}  | ${chickenPrice[1]} | ${chickenComment[1]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            chicken.inputWithException()
                            val addChicken = chicken.returnValue()
                            if (addChicken == 1) {
                                println("${chickenList[1]} 가 장바구니에 추가되었습니다.")
                                cartList.add(chickenList[1])
                                cartPrice.add(chickenPrice[1])
                                cartComment.add(chickenComment[1])
                            }
                            else if (addChicken ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (chickenList.indexOf(chickenList[2])+1) -> {
                            println("${chickenList[2]}  | ${chickenPrice[2]} | ${chickenComment[2]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            chicken.inputWithException()
                            val addChicken = chicken.returnValue()
                            if (addChicken == 1) {
                                println("${chickenList[2]} 가 장바구니에 추가되었습니다.")
                                cartList.add(chickenList[2])
                                cartPrice.add(chickenPrice[2])
                                cartComment.add(chickenComment[2])
                            }
                            else if (addChicken ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (chickenList.indexOf(chickenList[3])+1) -> {
                            println("${chickenList[3]}  | ${chickenPrice[3]} | ${chickenComment[3]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            chicken.inputWithException()
                            val addChicken = chicken.returnValue()
                            if (addChicken == 1) {
                                println("${chickenList[3]} 가 장바구니에 추가되었습니다.")
                                cartList.add(chickenList[3])
                                cartPrice.add(chickenPrice[3])
                                cartComment.add(chickenComment[3])
                            }
                            else if (addChicken ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                        (chickenList.indexOf(chickenList[4])+1) -> {
                            println("${chickenList[4]}  | ${chickenPrice[4]} | ${chickenComment[4]}")
                            println("위 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1. 확인    2.취소  ")
                            chicken.inputWithException()
                            val addChicken = chicken.returnValue()
                            if (addChicken == 1) {
                                println("${chickenList[4]} 가 장바구니에 추가되었습니다.")
                                cartList.add(chickenList[4])
                                cartPrice.add(chickenPrice[4])
                                cartComment.add(chickenComment[4])
                            }
                            else if (addChicken ==2) {
                                continue
                            }
                            else {
                                println("올바른 숫자를 입력해 주세요.")
                            }
                        }
                    }
                }
            }
            // 종료
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
            5 -> {
                val order = Order()
                order.displayInfo()
                order.isCartSizeZero(
                    cartList,
                    cartPrice,
                    cartComment)
                account = order.returnAccount()
            }
            6 -> {
                val cancel = Cancel()
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

