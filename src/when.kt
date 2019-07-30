package classes

fun main(){
    val whenExample = whenExample()
    whenExample.numberToScreen(number = 4)
}



class whenExample {
    fun numberToScreen(number: Int) {
        println(
            when (number) {
                0 -> "zero"
                1 -> "one"
                2 -> "two"
                3 -> "three"
                4 -> "four"
                5 -> "five"
                6 -> "six"
                7 -> "seven"
                8 -> "eight"
                9 -> "nine"
                else -> "else"
            }
        )

    }
}
