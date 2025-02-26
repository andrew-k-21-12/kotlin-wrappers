package web.performance

import js.core.HighResTimeStamp

external interface PerformanceEntry {
    val duration: HighResTimeStamp
    val entryType: String
    val name: String
    val startTime: HighResTimeStamp
    fun toJSON(): Any
}
