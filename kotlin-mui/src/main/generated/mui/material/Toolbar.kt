// Automatically generated - do not modify!

@file:JsModule("@mui/material/Toolbar")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ToolbarProps :
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The Toolbar children, usually a mixture of `IconButton`, `Button` and `Typography`.
     * The Toolbar is a flex container, allowing flex item properites to be used to lay out the children.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ToolbarClasses?

    /**
     * If `true`, disables gutter padding.
     * @default false
     */
    var disableGutters: Boolean?

    /**
     * The variant to use.
     * @default 'regular'
     */
    var variant: ToolbarVariant?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [App bar](https://mui.com/material-ui/react-app-bar/)
 *
 * API:
 *
 * - [Toolbar API](https://mui.com/material-ui/api/toolbar/)
 */
@JsName("default")
external val Toolbar: react.FC<ToolbarProps>
