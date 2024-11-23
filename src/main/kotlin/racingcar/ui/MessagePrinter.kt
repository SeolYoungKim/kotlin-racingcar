package racingcar.ui

object MessagePrinter {
    fun print(message: String) {
        println(message)
    }

    fun print(messages: List<String>) {
        val lineSeparator = System.lineSeparator()
        println(messages.joinToString(separator = lineSeparator))
    }
}