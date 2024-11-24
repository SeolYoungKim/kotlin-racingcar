package racingcar

import racingcar.application.RacingCarGame
import racingcar.ui.ConsoleMessagePrinter
import racingcar.ui.ConsoleNumberReader
import racingcar.ui.StringsReaderImpl

fun main() {
    val racingCarGame =
        RacingCarGame(
            messagePrinter = ConsoleMessagePrinter,
            numberReader = ConsoleNumberReader,
            stringsReader = StringsReaderImpl,
        )
    racingCarGame.start()
}
