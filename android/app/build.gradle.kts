plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android { namespace = "com.headshotlab.webapp"; compileSdk = 35
    defaultConfig { applicationId = "com.headshotlab.webapp"; minSdk = 23; targetSdk = 35; versionCode = 1; versionName = "1.0" }
}
tasks.register<Copy>("copyWebAssets") {
    from("../../dist")
    into("src/main/assets/dist")
}
tasks.named("preBuild").configure { dependsOn("copyWebAssets") }
dependencies { implementation("androidx.core:core-ktx:1.15.0"); implementation("androidx.appcompat:appcompat:1.7.0") }
