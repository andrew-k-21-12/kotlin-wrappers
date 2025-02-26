// Automatically generated - do not modify!

@file:JsModule("@mui/base/TextareaAutosize")
@file:JsNonModule

package mui.base

external interface TextareaAutosizeProps :
    react.dom.html.TextareaHTMLAttributes<dom.html.HTMLTextAreaElement> {
    /**
     * Maximum number of rows to display.
     */
    var maxRows: Int?

    /**
     * Minimum number of rows to display.
     * @default 1
     */
    var minRows: Int?
}

/**
 *
 * Demos:
 *
 * - [Textarea autosize](https://mui.com/base/react-textarea-autosize/)
 * - [Textarea autosize](https://mui.com/material-ui/react-textarea-autosize/)
 *
 * API:
 *
 * - [TextareaAutosize API](https://mui.com/base/api/textarea-autosize/)
 */
@JsName("default")
external val TextareaAutosize: react.FC<TextareaAutosizeProps>
