package react.dom

import dom.Element
import react.Props
import react.ReactPortal
import react.Render
import react.createElement

fun createPortal(
    container: Element,
    handler: Render,
): ReactPortal =
    createPortal(
        children = createElement<Props>(handler),
        container = container,
    )
