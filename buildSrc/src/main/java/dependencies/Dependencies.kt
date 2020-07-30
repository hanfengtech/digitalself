/**
 * Project dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object Dependencies {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"

    const val CONSTRAIN_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAIN_LAYOUT}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_DYNAMIC_FEATURES = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.NAVIGATION}"
    const val LEGACY_SUPPORT = "androidx.legacy:legacy-support-v4:${Versions.LEGACY_SUPPORT}"

    const val PLAY_CORE = "com.google.android.play:core:${Versions.PLAY_CORE}"
    const val PLAY_CORE_KTX = "com.google.android.play:core:${Versions.PLAY_CORE_KTX}"


    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"

    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    const val ROOM = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val RECYCLE_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLE_VIEW}"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"
    const val SWIPE_REFRESH_LAYOUT = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SWIPE_REFRESH_LAYOUT}"
    const val PAGING = "androidx.paging:paging-runtime-ktx:${Versions.PAGING}"
    const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"


    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING}"
    const val MOSHI = "com.squareup.moshi:moshi:${Versions.MOSHI}"
    const val MOSHI_KTX = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"
    const val CRASHLYTICS = "com.crashlytics.sdk.android:crashlytics:${Versions.CRASHLYTICS}"
}