package racingcar.domain

object CarFactory {
    fun create(count: Int): List<Car> {
        return List(count) { Car() }
    }
}
