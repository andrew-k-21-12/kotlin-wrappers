plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-js"))

    api(npmv("@tanstack/table-core"))
}
