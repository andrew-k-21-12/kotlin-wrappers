@file:JsModule("react")
@file:JsNonModule

package react

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
external fun <S, A, I> useReducer(
    reducer: RReducer<S, A>,
    initializerArg: I,
    initializer: (I) -> S,
): ReducerInstance<S, A>

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
external fun <S, A> useReducer(
    reducer: RReducer<S, A>,
    initialState: S,
): ReducerInstance<S, A>

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
external fun <S : Any, A> useReducer(
    reducer: RReducer<S?, A>,
): ReducerInstance<S?, A>
