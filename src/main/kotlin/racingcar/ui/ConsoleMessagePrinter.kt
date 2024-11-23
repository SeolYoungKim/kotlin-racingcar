package racingcar.ui

import racingcar.application.MessagePrinter

object ConsoleMessagePrinter : MessagePrinter {
    override fun print(message: String) {
        println(message)
    }

    override fun print(messages: List<String>) {
        val lineSeparator = System.lineSeparator()
        println(messages.joinToString(separator = lineSeparator))
    }
}
