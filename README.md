# Calculator 📱

A clean, modern calculator application built with **Kotlin** and **Jetpack Compose**.

> 💡 **Personal Milestone:** This project was one of the very first milestones in my Android app development journey! It served as a hands-on exploration of Kotlin, modern declarative UI with Jetpack Compose, and foundational Android architecture.it was made in mid 2025  

---

## ✨ Features

- **Basic Operations:** Addition, subtraction, multiplication, and division.
- **Scientific & Advanced Math:**
  - Square root ($\sqrt{x}$)
  - Factorial ($n!$)
  - Exponentiation ($x^y$)
  - Mathematical constants ($\pi$, $e$)
- **Adaptive Text Scaling:** Display dynamically adjusts font size as expression length grows for a seamless user experience.
- **Modern UI:** Built from scratch with Jetpack Compose, Material 3, and edge-to-edge support.
- **MVVM Architecture:** Clean separation between state management (`CalculatorViewModel`) and UI components (`CalculatorScreen`, `CalcButton`).

---

## 🛠️ Tech Stack & Libraries

- **Language:** [Kotlin](https://kotlinlang.org/)
- **UI Framework:** [Jetpack Compose](https://developer.android.com/jetpack/compose) (Material 3)
- **Architecture:** MVVM (Model-View-ViewModel)
- **State Management:** Android Architecture Components (`ViewModel`, Compose runtime state)
- **Build System:** Gradle (Kotlin DSL with Version Catalogs)
- **Minimum SDK:** Android API 29 (Android 10)
- **Target SDK:** Android API 35 (Android 15)

---

## 📂 Project Structure

```text
app/src/main/java/com/example/calculator/
├── MainActivity.kt           # Entry point with edge-to-edge configuration
├── CalculatorScreen.kt       # Main Compose UI layout and keypad
├── CalculatorViewModel.kt    # Logic, calculation evaluation, and state handling
├── CalcButton.kt             # Reusable custom button components
└── ui/theme/                 # Material 3 theme, colors, and typography
```

---

## 🚀 Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) Ladybug (or newer recommended)
- JDK 11 or higher
- Android SDK with API 35

### Running the App

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Dev-VardhanX/Calculator.git
   cd Calculator
   ```

2. **Open in Android Studio:**
   - Launch Android Studio.
   - Select **Open** and browse to the cloned folder.
   - Wait for Gradle sync to complete.

3. **Run:**
   - Connect an Android device (via USB/Wi-Fi debugging) or start an Android Virtual Device (AVD).
   - Click **Run** (`Shift + F10`) or use the green play button in the toolbar.

---

## 👤 Author

- **Dev Vardhan** - [@Dev-VardhanX](https://github.com/Dev-VardhanX)

