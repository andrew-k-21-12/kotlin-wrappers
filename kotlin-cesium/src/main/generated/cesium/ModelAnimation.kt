// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * <div class="notice">
 * Create animations by calling [ModelAnimationCollection.add]. Do not call the constructor directly.
 * </div>
 *
 * An active animation derived from a glTF asset. An active animation is an
 * animation that is either currently playing or scheduled to be played due to
 * being added to a model's [ModelAnimationCollection]. An active animation
 * is an instance of an animation; for example, there can be multiple active
 * animations for the same glTF animation, each with a different start time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html">Online Documentation</a>
 */
sealed external class ModelAnimation {
    /**
     * When `true`, the animation is removed after it stops playing.
     * This is slightly more efficient that not removing it, but if, for example,
     * time is reversed, the animation is not played again.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#removeOnStop">Online Documentation</a>
     */
    var removeOnStop: Boolean

    /**
     * The event fired when this animation is started.  This can be used, for
     * example, to play a sound or start a particle system, when the animation starts.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * animation.start.addEventListener(function(model, animation) {
     *   console.log(`Animation started: ${animation.name}`);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#start">Online Documentation</a>
     */
    var start: DefaultEvent

    /**
     * The event fired when on each frame when this animation is updated.  The
     * current time of the animation, relative to the glTF animation time span, is
     * passed to the event, which allows, for example, starting new animations at a
     * specific time relative to a playing animation.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * animation.update.addEventListener(function(model, animation, time) {
     *   console.log(`Animation updated: ${animation.name}. glTF animation time: ${time}`);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#update">Online Documentation</a>
     */
    var update: DefaultEvent

    /**
     * The event fired when this animation is stopped.  This can be used, for
     * example, to play a sound or start a particle system, when the animation stops.
     *
     * This event is fired at the end of the frame after the scene is rendered.
     * ```
     * animation.stop.addEventListener(function(model, animation) {
     *   console.log(`Animation stopped: ${animation.name}`);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#stop">Online Documentation</a>
     */
    var stop: DefaultEvent

    /**
     * The name that identifies this animation in the model, if it exists.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The scene time to start playing this animation. When this is `undefined`,
     * the animation starts at the next frame.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#startTime">Online Documentation</a>
     */
    val startTime: JulianDate

    /**
     * The delay, in seconds, from [ModelAnimation.startTime] to start playing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#delay">Online Documentation</a>
     */
    val delay: Double

    /**
     * The scene time to stop playing this animation. When this is `undefined`,
     * the animation is played for its full duration and perhaps repeated depending on
     * [ModelAnimation.loop].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#stopTime">Online Documentation</a>
     */
    val stopTime: JulianDate

    /**
     * Values greater than `1.0` increase the speed that the animation is played relative
     * to the scene clock speed; values less than `1.0` decrease the speed.  A value of
     * `1.0` plays the animation at the speed in the glTF animation mapped to the scene
     * clock speed.  For example, if the scene is played at 2x real-time, a two-second glTF animation
     * will play in one second even if `multiplier` is `1.0`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#multiplier">Online Documentation</a>
     */
    val multiplier: Double

    /**
     * When `true`, the animation is played in reverse.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#reverse">Online Documentation</a>
     */
    val reverse: Boolean

    /**
     * Determines if and how the animation is looped.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#loop">Online Documentation</a>
     */
    val loop: ModelAnimationLoop

    /**
     * If this is defined, it will be used to compute the local animation time
     * instead of the scene's time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#animationTime">Online Documentation</a>
     */
    var animationTime: AnimationTimeCallback
}

/**
 * A function used to compute the local animation time for a ModelAnimation.
 * ```
 * // Use real time for model animation (assuming animateWhilePaused was set to true)
 * function animationTime(duration) {
 *     return Date.now() / 1000 / duration;
 * }
 * ```
 * ```
 * // Offset the phase of the animation, so it starts halfway through its cycle.
 * function animationTime(duration, seconds) {
 *     return seconds / duration + 0.5;
 * }
 * ```
 * @param [duration] The animation's original duration in seconds.
 * @param [seconds] The seconds since the animation started, in scene time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#.AnimationTimeCallback">Online Documentation</a>
 */
typealias AnimationTimeCallback = (duration: Double, seconds: Double) -> Double
