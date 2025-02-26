// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface TabPanelUnstyledProps :
    TabPanelUnstyledOwnProps,
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>

external interface TabPanelUnstyledOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
     */
    var value: dynamic

    /**
     * The components used for each slot inside the TabPanel.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the TabPanel.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'div', TabPanelUnstyledComponentsPropsOverrides, TabPanelUnstyledOwnerState> */
    }
}
