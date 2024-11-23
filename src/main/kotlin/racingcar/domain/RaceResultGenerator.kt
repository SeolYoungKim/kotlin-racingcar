package racingcar.domain

object RaceResultGenerator {
    private const val NAME_POSITION_SEPARATOR = " : "
    private const val POSITION_STRING = "-"

    fun generate(cars: List<Car>): String {
        val lineSeparator = System.lineSeparator()
        return cars.joinToString(separator = lineSeparator, postfix = lineSeparator) { car ->
            convertToResultFormat(car)
        }
    }

    private fun convertToResultFormat(car: Car): String {
        return car.name + NAME_POSITION_SEPARATOR + POSITION_STRING.repeat(car.position)
    }
}
