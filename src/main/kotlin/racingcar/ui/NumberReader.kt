package racingcar.ui

object NumberReader {
    fun read(): Int {
        val readLine = readLine()
        return convertToInt(readLine)
    }

    private fun readLine(): String {
        return readlnOrNull()
            ?: throw IllegalArgumentException("null을 입력할 수 없습니다.")
    }

    private fun convertToInt(readLine: String): Int {
        return readLine.toIntOrNull()
            ?: throw IllegalArgumentException("숫자만 입력할 수 있습니다.")
    }
}
