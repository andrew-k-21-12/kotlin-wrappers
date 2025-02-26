// Automatically generated - do not modify!

package dom

import dom.xml.XMLDocument

sealed external class DOMImplementation {
    fun createDocument(
        namespace: String?,
        qualifiedName: String?,
        doctype: DocumentType? = definedExternally,
    ): XMLDocument

    fun createDocumentType(
        qualifiedName: String,
        publicId: String,
        systemId: String,
    ): DocumentType

    fun createHTMLDocument(title: String = definedExternally): Document
}
