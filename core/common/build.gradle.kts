plugins {
    id("app.android.library")
    id("app.android.hilt")
}

android {
    namespace = "com.playground.modular.app.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}