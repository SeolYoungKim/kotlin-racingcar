package racingcar.application

interface MessagePrinter {
    fun print(message: String)

    fun print(messages: List<String>)
}
