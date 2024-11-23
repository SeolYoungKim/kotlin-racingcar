package racingcar.domain

object CarFactory {
    // fixme : 이름 문자열을 입력받고, 문자열을 split해서 자동차를 생성하는 방식으로 변경해야 한다.
    fun create(count: Int): List<Car> {
        return List(count) { Car(name = "김설영") }
    }
}
