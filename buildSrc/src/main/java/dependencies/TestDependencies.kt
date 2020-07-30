package dependencies

object TestDependencies {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val MOCKITO = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.MOCKITO}"
    const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
    const val ASSERTJ = "org.assertj:assertj-core:${Versions.ASSERTJ}"
    const val ROBOELECTRIC = "org.robolectric:robolectric:${Versions.ROBOELECTRIC}"
    const val ROOM = "androidx.room:room-testing:${Versions.ROOM}"
    const val TEST_EXT = "androidx.test.ext:junit:${Versions.TEST_EXT}"
    const val CORE = "androidx.test:core:${Versions.TEST}"
    const val RUNNER = "androidx.test:runner:${Versions.TEST}"
    const val RULES = "androidx.test:rules:${Versions.TEST}"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"
    const val ARCH_CORE = "androidx.arch.core:core-testing:${Versions.ARCH_CORE}"
    const val FRAGMENT_TEST = "androidx.fragment:fragment-testing:${Versions.FRAGMENT_TEST}"
    const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:${Versions.MOCK_WEB_SERVER}"
}