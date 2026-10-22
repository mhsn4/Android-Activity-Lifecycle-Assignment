# Android Activity Lifecycle Assignment

An Android application developed in Java and XML demonstrating the complete Android Activity Lifecycle and state persistence using savedInstanceState.

---

## Features Demonstrated

* **Lifecycle Callback Logging**: Logs all major lifecycle state transitions (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`, and `onRestart`) directly to the Android Logcat.
* **State Persistence**: Preserves and restores interactive button click counts across configuration changes, such as screen rotation, using `onSaveInstanceState` logic.
* **Interactive UI**: Features a clean, centered layout containing a dynamic status text view and an action button.

---

## Project Structure

* **`activity_main.xml`**: Located in `app/src/main/res/layout/`, defines a centered layout with a lifecycle status display and an interaction button.
* **`MainActivity.java`**: Located in `app/src/main/java/com/example/myapplication/`, handles lifecycle event logging, click listeners, and bundle state saving/restoring.

---

## Built With

* **Language**: Java
* **UI Toolkit**: XML / Android Views
* **IDE**: Android Studio
* **Version Control**: Git and GitHub

---

## How to Run

1. Clone or download this repository.
2. Open the project folder in Android Studio.
3. Allow Gradle to sync successfully.
4. Run the app on an Android Emulator or a physical device.
5. Check Logcat, filtered by the tag `LifecycleCallback`, to observe lifecycle state changes in real time.
