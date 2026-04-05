# ShopApp

A polished Android shopping sample app built with Kotlin and Android Jetpack libraries. ShopApp demonstrates a simple product browsing flow with authentication, item detail screens, and payment integration using Razorpay.

## Overview

This project is a single-module Android application targeting SDK 36 and supporting devices back to Android 7.0 (API 24). It uses modern Android development practices including Kotlin, Material Design, RecyclerView, and the Android Gradle version catalog.

## Key Features

- Product list browsing with item detail screens
- Authentication flow with a dedicated auth activity
- Razorpay checkout integration for payment handling
- Responsive UI with Material components and ConstraintLayout
- Production-ready release configuration with ProGuard rules support

## Tech Stack

- Kotlin
- Android SDK 36
- AndroidX Core KTX
- AndroidX AppCompat
- Material Design 3
- ConstraintLayout
- RecyclerView
- Razorpay Checkout SDK

## Project Details

- Application ID: `com.example.shopapp`
- Version: `1.0`
- Minimum SDK: `24`
- Target SDK: `36`
- Java / Kotlin target compatibility: `Java 11`

## Getting Started

### Prerequisites

- Android Studio with Kotlin and Android SDK support
- JDK 11
- Android device or emulator running API 24+ 
- Internet access for dependency resolution

### Setup

1. Clone the repository:

```bash
git clone https://github.com/your-org/ShopApp.git
cd ShopApp
```

2. Open the project in Android Studio.
3. Allow Gradle to sync and download required dependencies.
4. Configure the Razorpay API key if you want to run payments in a non-test environment. The default test key is set in `app/src/main/AndroidManifest.xml`:

```xml
<meta-data
    android:name="com.razorpay.ApiKey"
    android:value="rzp_test_EgmQoGwAT33eJi"/>
```

5. Run the app on an emulator or physical device.

## Build Commands

From the project root, use the Gradle wrapper:

```bash
./gradlew clean assembleDebug
./gradlew assembleRelease
```

## Testing

Run unit tests and instrumentation tests with:

```bash
./gradlew test
./gradlew connectedAndroidTest
```

## App Structure

- `app/src/main/java/` - application source code
- `app/src/main/res/` - resources, layouts, drawables, themes, strings
- `app/src/main/AndroidManifest.xml` - permissions, activities, metadata
- `app/build.gradle.kts` - Android module configuration and dependencies
- `build.gradle.kts` - root project build configuration
- `gradle/libs.versions.toml` - version catalog for dependency management

## Notes

- Update the `applicationId` and `package` names when preparing the app for production release.
- Set a valid Razorpay API key before deploying payment flows to a live environment.
- `READ_EXTERNAL_STORAGE` permission is declared for compatibility with legacy file access use cases.

## License

This repository does not include a license file. Add an appropriate license before sharing or publishing the project.
