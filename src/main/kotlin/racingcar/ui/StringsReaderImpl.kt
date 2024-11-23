package racingcar.ui

import racingcar.application.StringsReader

object StringsReaderImpl : StringsReader {
    override fun read(): List<String> {
        val readLine = ReaderUtils.readLine()
        return readLine.split(",")
    }
}
