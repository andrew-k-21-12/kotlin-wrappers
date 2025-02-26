// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface CompilerOptions {
    var allowJs: Boolean?
    var allowSyntheticDefaultImports: Boolean?
    var allowUmdGlobalAccess: Boolean?
    var allowUnreachableCode: Boolean?
    var allowUnusedLabels: Boolean?
    var alwaysStrict: Boolean?
    var baseUrl: String?
    var charset: String?
    var checkJs: Boolean?
    var declaration: Boolean?
    var declarationMap: Boolean?
    var emitDeclarationOnly: Boolean?
    var declarationDir: String?
    var disableSizeLimit: Boolean?
    var disableSourceOfProjectReferenceRedirect: Boolean?
    var disableSolutionSearching: Boolean?
    var disableReferencedProjectLoad: Boolean?
    var downlevelIteration: Boolean?
    var emitBOM: Boolean?
    var emitDecoratorMetadata: Boolean?
    var exactOptionalPropertyTypes: Boolean?
    var experimentalDecorators: Boolean?
    var forceConsistentCasingInFileNames: Boolean?
    var importHelpers: Boolean?
    var importsNotUsedAsValues: ImportsNotUsedAsValues?
    var inlineSourceMap: Boolean?
    var inlineSources: Boolean?
    var isolatedModules: Boolean?
    var jsx: JsxEmit?
    var keyofStringsOnly: Boolean?
    var lib: ReadonlyArray<String>?
    var locale: String?
    var mapRoot: String?
    var maxNodeModuleJsDepth: Int?
    var module: ModuleKind?
    var moduleResolution: ModuleResolutionKind?
    var moduleSuffixes: ReadonlyArray<String>?
    var moduleDetection: ModuleDetectionKind?
    var newLine: NewLineKind?
    var noEmit: Boolean?
    var noEmitHelpers: Boolean?
    var noEmitOnError: Boolean?
    var noErrorTruncation: Boolean?
    var noFallthroughCasesInSwitch: Boolean?
    var noImplicitAny: Boolean?
    var noImplicitReturns: Boolean?
    var noImplicitThis: Boolean?
    var noStrictGenericChecks: Boolean?
    var noUnusedLocals: Boolean?
    var noUnusedParameters: Boolean?
    var noImplicitUseStrict: Boolean?
    var noPropertyAccessFromIndexSignature: Boolean?
    var assumeChangesOnlyAffectDirectDependencies: Boolean?
    var noLib: Boolean?
    var noResolve: Boolean?
    var noUncheckedIndexedAccess: Boolean?
    var out: String?
    var outDir: String?
    var outFile: String?
    var paths: MapLike<ReadonlyArray<String>>?
    var preserveConstEnums: Boolean?
    var noImplicitOverride: Boolean?
    var preserveSymlinks: Boolean?
    var preserveValueImports: Boolean?
    var project: String?
    var reactNamespace: String?
    var jsxFactory: String?
    var jsxFragmentFactory: String?
    var jsxImportSource: String?
    var composite: Boolean?
    var incremental: Boolean?
    var tsBuildInfoFile: String?
    var removeComments: Boolean?
    var rootDir: String?
    var rootDirs: ReadonlyArray<String>?
    var skipLibCheck: Boolean?
    var skipDefaultLibCheck: Boolean?
    var sourceMap: Boolean?
    var sourceRoot: String?
    var strict: Boolean?
    var strictFunctionTypes: Boolean?
    var strictBindCallApply: Boolean?
    var strictNullChecks: Boolean?
    var strictPropertyInitialization: Boolean?
    var stripInternal: Boolean?
    var suppressExcessPropertyErrors: Boolean?
    var suppressImplicitAnyIndexErrors: Boolean?
    var target: ScriptTarget?
    var traceResolution: Boolean?
    var useUnknownInCatchVariables: Boolean?
    var resolveJsonModule: Boolean?
    var types: ReadonlyArray<String>?

    /** Paths used to compute primary types search locations */
    var typeRoots: ReadonlyArray<String>?
    var esModuleInterop: Boolean?
    var useDefineForClassFields: Boolean?
    // [option: string]: CompilerOptionsValue | TsConfigSourceFile | undefined
}
