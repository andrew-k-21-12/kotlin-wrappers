package emotion.sheet

import dom.html.HTMLElement
import dom.html.HTMLStyleElement
import js.core.ReadonlyArray

external interface StyleSheet {
    val container: HTMLElement
    val nonce: String?
    val key: String
    fun insert(rule: String)
    fun flush()
    val tags: ReadonlyArray<HTMLStyleElement>
}
