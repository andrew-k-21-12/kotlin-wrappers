package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface PlaceholderProps : PropsWithChildren {
    var innerProps: HTMLAttributes<HTMLDivElement>
    var isFocused: Boolean
    var isDisabled: Boolean
}
