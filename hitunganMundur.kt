fun main() {
    val a = 100

    for (i in a downTo 1) {
        if (i != 1) {
            if (i % 2 != 0) {
                var b = 2
                while (b <= i) {
                    if (i % b == 0) {
                        if (b != i) {
                            if (i % 3 == 0 && i % 5 == 0) {
                                print("FooBar, ")
                            } else if (i % 3 == 0) {
                                print("Foo, ")
                            } else if (i % 5 == 0) {
                                print("Bar, ")
                            } else {
                                print("$i, ")
                            }
                        }
                        break
                    }
                    b++
                }
            } else if (i % 3 == 0 && i % 5 == 0) {
                print("FooBar, ")
            } else if (i % 3 == 0) {
                print("Foo, ")
            } else if (i % 5 == 0) {
                print("Bar, ")
            } else {
                if (i / 2 == 1){
                    print("")
                } else {
                    print("$i, ")
                }
            }
        }else {
            print(i)
        }
    }
}


// Proses pengecekan bilangan prima
//fun main() {
//    val a = 100
//
//    for (i in a downTo 1) {
//        if (i != 1) {
//            if (i % 2 != 0) {
//                var b = 2
//                while (b <= i) {
//                    if (i % b == 0) {
//                        if (b != i) {
//                            println("$i = bukan prima,")
//                        } else {
//                            println("$i = prima,")
//                        }
//                        break
//                    }
//                    b++
//                }
//            }else {
//                if (i / 2 == 1) {
//                    println("$i = prima")
//                } else {
//                    println("$i = bukan prima, ")
//                }
//            }
//        } else {
//            println("$i = bukan prima")
//        }
//    }
//}