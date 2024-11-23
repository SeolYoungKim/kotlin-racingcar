package racingcar.domain

class Car(var position: Int = 0, val name: String) {
    companion object {
        private const val THRESHOLD = 4
    }

    fun moveOrStay(condition: Int) {
        if (canMove(condition)) {
            position++
        }
    }

    private fun canMove(condition: Int) = condition >= THRESHOLD
}
