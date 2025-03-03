// Automatically generated - do not modify!

package web.navigator

import js.core.ReadonlyArray
import js.core.Void
import media.capabilities.MediaCapabilities
import media.devices.MediaDevices
import media.key.MediaKeySystemAccess
import media.key.MediaKeySystemConfiguration
import media.session.MediaSession
import serviceworkers.ServiceWorkerContainer
import web.clipboard.Clipboard
import web.gamepad.Gamepad
import web.geolocation.Geolocation
import web.http.BodyInit
import web.permissions.Permissions
import web.share.ShareData
import web.url.URL
import web.vibration.VibratePattern
import kotlin.js.Promise

sealed external class Navigator :
    NavigatorAutomationInformation,
    NavigatorConcurrentHardware,
    NavigatorContentUtils,
    NavigatorCookies,
    NavigatorID,
    NavigatorLanguage,
    NavigatorLocks,
    NavigatorOnLine,
    NavigatorPlugins,
    NavigatorStorage {
    /** Available only in secure contexts. */
    val clipboard: Clipboard

    /** Available only in secure contexts. */
    val credentials: dynamic /* CredentialsContainer */
    val doNotTrack: String?
    val geolocation: Geolocation
    val maxTouchPoints: Int
    val mediaCapabilities: MediaCapabilities

    /** Available only in secure contexts. */
    val mediaDevices: MediaDevices
    val mediaSession: MediaSession
    val permissions: Permissions

    /** Available only in secure contexts. */
    val serviceWorker: ServiceWorkerContainer

    /** Available only in secure contexts. */
    fun canShare(data: ShareData = definedExternally): Boolean
    fun getGamepads(): ReadonlyArray<Gamepad?>

    /** Available only in secure contexts. */
    fun requestMediaKeySystemAccess(
        keySystem: String,
        supportedConfigurations: ReadonlyArray<MediaKeySystemConfiguration>,
    ): Promise<MediaKeySystemAccess>

    fun sendBeacon(
        url: String,
        data: BodyInit? = definedExternally,
    ): Boolean

    fun sendBeacon(
        url: URL,
        data: BodyInit? = definedExternally,
    ): Boolean

    /** Available only in secure contexts. */
    fun share(data: ShareData = definedExternally): Promise<Void>
    fun vibrate(pattern: VibratePattern): Boolean
}
