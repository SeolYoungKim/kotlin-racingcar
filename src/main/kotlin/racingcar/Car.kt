package racingcar

class Car(var position: Int = 0) {
    fun move(distance: Int) {
        position += distance
    }
}
