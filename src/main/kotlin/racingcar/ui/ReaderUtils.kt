package racingcar.ui

object ReaderUtils {
    fun readLine(): String {
        return readlnOrNull()
            ?: throw IllegalArgumentException("null을 입력할 수 없습니다.")
    }
}
