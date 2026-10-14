# CSE489: ANDROID APP DEVELOPMENT

## Homework 1: Bigger Number Game

- **Student Name:** Monowar Husain
- **Institution:** BRAC University (BRACU)
- **Course:** CSE489 : ANDROID APP DEVELOPMENT
- **Assignment:** Homework 1 – Bigger Number Game

---

## 📌 Project Overview

The **Bigger Number Game** is a single-activity Android application built in Kotlin. The goal of this assignment is to demonstrate foundational Android development concepts, including:
- Designing responsive UI using `ConstraintLayout`.
- Wiring UI components (`TextView`, `Button`) to Kotlin code.
- Handling user click events with `OnClickListener`.
- Generating random numbers without duplication.
- Dynamically updating game state and scoring with real-time `Toast` notifications.

---

## 🎮 Game Mechanics

1. **Number Generation:** Two distinct random integers (0–99) are generated on game start and refreshed after every choice.
2. **User Decision:** The player taps the button showing what they believe is the higher number.
3. **Evaluation & Feedback:**
   - **Correct Answer:** The user scores **+1 point**, a green/positive `Toast` is shown (`"Correct! Great job!"`), and the score board increments.
   - **Incorrect Answer:** The user loses **-1 point**, an alert `Toast` is shown (`"Wrong! Better luck next time."`), and the score board decrements.
4. **Instant Progression:** Immediately after each click, two new numbers are drawn automatically.

---

## 🛠️ Tech Stack & Environment

- **Language:** Kotlin
- **IDE:** Android Studio (Ladybug / Koala)
- **Build System:** Gradle (Kotlin DSL - `.gradle.kts`)
- **Version Catalog:** `gradle/libs.versions.toml`
- **UI Architecture:** Android Views (XML Layouts, `ConstraintLayout`)

---

## 📂 Project Directory Structure

```text
BiggerNumberGame/
├── app/
│   ├── src/
│   │   ├── androidTest/java/com/example/biggernumbergame/
│   │   │   └── ExampleInstrumentedTest.kt
│   │   ├── main/
│   │   │   ├── java/com/example/biggernumbergame/
│   │   │   │   └── MainActivity.kt          # Primary game logic & event listeners
│   │   │   ├── res/
│   │   │   │   └── layout/
│   │   │   │       └── activity_main.xml    # Single-page UI layout
│   │   │   └── AndroidManifest.xml          # Main application launcher manifest
│   │   └── test/java/com/example/biggernumbergame/
│   │       └── ExampleUnitTest.kt
│   ├── .gitignore
│   └── build.gradle.kts
├── gradle/
│   ├── wrapper/
│   │   ├── gradle-wrapper.jar
│   │   └── gradle-wrapper.properties
│   ├── gradle-daemon-jvm.properties
│   └── libs.versions.toml
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── README.md
```

---

## 🚀 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/<YOUR_GITHUB_USERNAME>/BiggerNumberGame.git
   cd BiggerNumberGame
   ```
2. **Open in Android Studio:**
   - Select **File > Open...** and point to the root `BiggerNumberGame` directory.
   - Allow Gradle to sync dependencies automatically.
3. **Run on Device / Emulator:**
   - Choose your emulator or connected Android device in the top toolbar.
   - Click **Run ▶** (or press `Shift + F10`).

---

## 📜 Academic Integrity

This project is submitted by **Monowar Husain** for **CSE489** at **BRAC University**. All code implementation adheres to the university's academic honesty policy.
