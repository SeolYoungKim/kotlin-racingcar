package racingcar

import racingcar.application.RacingCarGame
import racingcar.ui.MessagePrinterImpl
import racingcar.ui.NumberReaderImpl

fun main() {
    val racingCarGame = RacingCarGame(MessagePrinterImpl, NumberReaderImpl)
    racingCarGame.start()
}
