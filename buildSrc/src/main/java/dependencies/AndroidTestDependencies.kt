package dependencies

object AndroidTestDependencies {
    const val LEAKCANARY = "com.squareup.leakcanary:leakcanary-android-instrumentation:${Versions.LEAKCANARY}"
    const val MOCKITO = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.MOCKITO}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    const val RUNNER = "androidx.test:runner:${Versions.TEST}"
    const val RULES = "androidx.test:rules:${Versions.TEST}"
    const val JUNIT = "androidx.test.ext:junit:${Versions.TEST_EXT}"
    const val FRAGMENT_TEST = "androidx.fragment:fragment-testing:${Versions.FRAGMENT_TEST}"
    const val PLAY_CORE = "com.google.android.play:core:${Versions.PLAY_CORE}"
    const val ANNOTATION = "androidx.annotation:annotation:${Versions.ANNOTATION}"
}