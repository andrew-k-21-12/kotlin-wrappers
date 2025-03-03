// Automatically generated - do not modify!

package dom.events

external interface KeyboardEventInit : EventModifierInit {
    var code: String?
    var isComposing: Boolean?
    var key: String?
    var location: Short?
    var repeat: Boolean?
}

open external class KeyboardEvent(
    type: String,
    init: KeyboardEventInit = definedExternally,
) : UIEvent {
    val altKey: Boolean
    val code: String
    val ctrlKey: Boolean
    val isComposing: Boolean
    val key: String
    val location: Short
    val metaKey: Boolean
    val repeat: Boolean
    val shiftKey: Boolean
    fun getModifierState(keyArg: String): Boolean
    val DOM_KEY_LOCATION_LEFT: Short
    val DOM_KEY_LOCATION_NUMPAD: Short
    val DOM_KEY_LOCATION_RIGHT: Short
    val DOM_KEY_LOCATION_STANDARD: Short

    companion object {
        val DOM_KEY_LOCATION_LEFT: Short
        val DOM_KEY_LOCATION_NUMPAD: Short
        val DOM_KEY_LOCATION_RIGHT: Short
        val DOM_KEY_LOCATION_STANDARD: Short
    }
}
