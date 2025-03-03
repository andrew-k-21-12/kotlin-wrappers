// Automatically generated - do not modify!

package cssom

sealed external class CSSKeyframesRule :
    CSSRule {
    val cssRules: CSSRuleList
    var name: String
    fun appendRule(rule: String)
    fun deleteRule(select: String)
    fun findRule(select: String): CSSKeyframeRule?
}
