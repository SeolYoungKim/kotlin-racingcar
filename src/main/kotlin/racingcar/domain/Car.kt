package racingcar.domain

class Car(var position: Int = 0, val name: String) {
    companion object {
        private const val THRESHOLD = 4
    }

    init {
        validateIsNotBlank()
        validateLength()
    }

    private fun validateIsNotBlank() {
        if (name.isBlank()) {
            throw IllegalArgumentException("자동차 이름은 비어있을 수 없습니다.")
        }
    }

    private fun validateLength() {
        val nameLength = name.length
        if (nameLength > 5) {
            throw IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다. 현재 입력 = $name, 글자 수 = $nameLength")
        }
    }

    fun moveOrStay(condition: Int) {
        if (canMove(condition)) {
            position++
        }
    }

    private fun canMove(condition: Int) = condition >= THRESHOLD
}
