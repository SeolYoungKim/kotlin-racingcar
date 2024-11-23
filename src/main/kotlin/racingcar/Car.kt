package racingcar

class Car(var position: Int = 0) {
    companion object {
        private const val THRESHOLD = 4
    }

    fun moveOrStay(condition: Int) {
        if (condition >= THRESHOLD) {
            position++
        }
    }
}
