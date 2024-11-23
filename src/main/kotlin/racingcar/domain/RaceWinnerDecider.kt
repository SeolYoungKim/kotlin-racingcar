package racingcar.domain

object RaceWinnerDecider {
    fun decide(cars: List<Car>): List<Car> {
        val maxPosition = cars.maxOf { car -> car.position }
        return cars.filter { car -> car.position >= maxPosition }
    }
}
