package racingcar

import racingcar.application.RacingCarGame
import racingcar.ui.ConsoleCarNameReader
import racingcar.ui.ConsoleMessagePrinter
import racingcar.ui.ConsoleNumberReader

fun main() {
    val racingCarGame =
        RacingCarGame(
            messagePrinter = ConsoleMessagePrinter,
            numberReader = ConsoleNumberReader,
            carNameReader = ConsoleCarNameReader,
        )
    racingCarGame.start()
}
