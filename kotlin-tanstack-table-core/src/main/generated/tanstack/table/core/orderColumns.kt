// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")
@file:JsNonModule

package tanstack.table.core

import js.core.ReadonlyArray

external fun <TData : RowData> orderColumns(
    leafColumns: ReadonlyArray<Column<TData, *>>,
    grouping: ReadonlyArray<String>,
    groupedColumnMode: GroupingColumnMode = definedExternally,
): ReadonlyArray<Column<TData, *>>
