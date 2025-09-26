# Auto-Complete TextView Demo (Android)

A simple Android project that demonstrates how to implement an **AutoCompleteTextView** to suggest entries (cities, etc.) as the user types.

---

## 📂 Project Structure

Auto-complete-text-view-in-android/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/example/myapplication/
│ │ │ │ └── MainActivity.kt
│ │ │ └── res/
│ │ │ └── layout/
│ │ │ └── activity_main.xml
│ └── build.gradle
└── README.md


- **MainActivity.kt** — Kotlin code that wires up the AutoCompleteTextView with an adapter and handles selection events.
- **activity_main.xml** — Layout XML containing the `AutoCompleteTextView`.
- **build.gradle** — contains SDK versions and dependencies.

---

## ✨ Features / What It Demonstrates

- Setting a **threshold** so suggestions appear after typing a certain number of characters.
- Using `ArrayAdapter` to supply suggestions (list of city names).
- Listening for item selection and showing a `Toast`.
- Basic setup that can be extended (e.g. custom adapter, network-based suggestions, etc.).

---

## 🛠️ Setup & Running

1. Clone the repo:
   ```bash
   git clone https://github.com/danger1406/Auto-complete-text-view-in-android.git


Open in Android Studio.

Make sure your compileSdkVersion and targetSdkVersion in app/build.gradle match a recent SDK (for example, 36) — some dependencies require newer compile SDK levels.

Sync Gradle and build the project.

Run on an emulator or physical device supporting at least your minSdkVersion.

You should see a screen with a text field. As you start typing (after 2 characters by default), a drop-down of suggestions appears. Selecting one displays a Toast confirming your choice.

✅ Troubleshooting / Tips

If your device/emulator isn’t showing in Android Studio’s “Running Devices” but shows in ADB:

Use adb devices from the terminal inside the SDK’s platform-tools to confirm it's connected.

Restart ADB:

adb kill-server
adb start-server


Cold boot the emulator via Device Manager → “Cold Boot Now”.

In Android Studio: Invalidate Caches / Restart.

If you get a Gradle error like:

Dependency 'androidx.core:core:1.17.0' requires compileSdk 36


then increase compileSdk and targetSdk in build.gradle accordingly.

📈 Extensions & Ideas

Use a custom adapter (with filtering logic) to display richer suggestion items (icons, descriptions).

Fetch suggestions from a web API (e.g. place autocomplete).

Implement debouncing so network requests are minimized.

Override enoughToFilter() or call showDropDown() to show suggestions even when no characters typed.

Support multi-auto-complete (for tags, comma-separated entries).

🧾 License & Credits

This project is open source. Feel free to use or adapt it for your own learning or demos.

Original concept by danger1406.
