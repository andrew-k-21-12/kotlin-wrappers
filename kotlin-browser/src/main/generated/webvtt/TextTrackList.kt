// Automatically generated - do not modify!

package webvtt

import js.core.ArrayLike
import js.core.JsIterable
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class TextTrackList :
    EventTarget,
    ArrayLike<TextTrack>,
    JsIterable<TextTrack> {
    var onaddtrack: EventHandler<TrackEvent>?
    var onchange: EventHandler<Event>?
    var onremovetrack: EventHandler<TrackEvent>?
    fun getTrackById(id: String): TextTrack?
}
