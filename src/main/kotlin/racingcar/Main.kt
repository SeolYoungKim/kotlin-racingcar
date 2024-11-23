package racingcar

import racingcar.application.RacingCarGame
import racingcar.ui.MessagePrinterImpl
import racingcar.ui.NumberReaderImpl
import racingcar.ui.StringsReaderImpl

fun main() {
    val racingCarGame =
        RacingCarGame(
            messagePrinter = MessagePrinterImpl,
            numberReader = NumberReaderImpl,
            stringsReader = StringsReaderImpl,
        )
    racingCarGame.start()
}
