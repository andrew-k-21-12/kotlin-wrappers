// Automatically generated - do not modify!

package media.session

sealed external class MediaSession {
    var metadata: MediaMetadata?
    var playbackState: MediaSessionPlaybackState
    fun setActionHandler(
        action: MediaSessionAction,
        handler: MediaSessionActionHandler?,
    )

    fun setPositionState(state: MediaPositionState = definedExternally)
}
