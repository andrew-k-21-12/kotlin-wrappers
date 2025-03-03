package test

import TestScope
import dom.Element
import dom.html.HTMLInputElement
import kotlinx.css.*
import kotlinx.css.properties.KeyframesBuilder
import kotlinx.css.properties.deg
import kotlinx.css.properties.rotate
import kotlinx.css.properties.transform
import runTest
import kotlin.test.*

open class TestBase {
    protected val firstColor = rgb(1, 1, 1)
    protected val secondColor = rgb(2, 2, 2)
    protected val thirdColor = rgb(3, 3, 3)

    protected val firstClassName = "firstClassName"
    protected val secondClassName = "secondClassName"

    /**
     * Assert that injected CSS for [selector] contains all of the [declarations]
     */
    protected fun TestScope.assertCssInjected(selector: String, vararg declarations: Pair<String, String>) {
        assertCssInjected(selector, declarations.map { (property, value) -> "$property: $value" })
    }

    protected fun TestScope.assertCssInjected(
        selector: String,
        strings: Iterable<String>,
        rules: List<String> = getRules(),
    ) {
        val checkedCss = StringBuilder()
        for (css in rules) {
            checkedCss.appendLine(css)
            if (selector !in css)
                continue
            css.let {
                strings.forEach {
                    assertTrue("Could not find declaration $it in $css") {
                        it in css
                    }
                }
            }
            return
        }
        assertTrue(false, "Could not find rule for selector $selector. Checked css is $checkedCss")
    }

    @BeforeTest
    open fun before() = runTest {
        clearStyles()
    }

    protected fun KeyframesBuilder.addRotation() {
        from { transform { rotate(0.deg) } }
        to { transform { rotate(360.deg) } }
    }

    protected fun CssBuilder.addSomeCss() {
        backgroundColor = Color.blue
        height = 18.px
        alignContent = Align.end
        appearance = Appearance.listbox
        padding = "1px 2px 3px 4px"
    }

    protected fun Element.childAt(i: Int): Element {
        val child = children.item(i)
        assertNotNull(child)
        return child
    }

    protected fun Element.asInput(): HTMLInputElement {
        return this as HTMLInputElement
    }

    protected fun assertAllNotEquals(expected: Any, vararg actual: Any) {
        actual.forEach { assertNotEquals(expected, it) }
    }

    protected fun assertAllEquals(expected: Any, vararg actual: Any) {
        actual.forEach { assertEquals(expected, it) }
    }
}
