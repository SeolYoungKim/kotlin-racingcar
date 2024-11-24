package racingcar

import racingcar.application.RacingCarGame
import racingcar.ui.ConsoleMessagePrinter
import racingcar.ui.ConsoleNumberReader
import racingcar.ui.ConsoleCarNameReader

fun main() {
    val racingCarGame =
        RacingCarGame(
            messagePrinter = ConsoleMessagePrinter,
            numberReader = ConsoleNumberReader,
            carNameReader = ConsoleCarNameReader,
        )
    racingCarGame.start()
}
