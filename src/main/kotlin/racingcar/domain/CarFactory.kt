package racingcar.domain

object CarFactory {
    fun create(names: List<String>): List<Car> {
        return names.map { name -> Car(name = name) }
    }
}
