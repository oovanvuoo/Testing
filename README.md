# Automation Test Framework

## Installation and Run

1. **Install JDK 21 (Temurin)**  
   Download and install the Temurin JDK 21 from [Adoptium](https://adoptium.net).

2. **Install Android SDK Platform Tools and Android Build Tools**  
   You can install via Android Studio or command line.

3. **Set Environment Variables**  
   - `JAVA_HOME` → path to JDK 21  
   - `ANDROID_HOME` → path to Android SDK  
   Also, add the following to your system `PATH`:  
   - `$ANDROID_HOME/platform-tools`  
   - `$ANDROID_HOME/tools`

4. **Install Appium Server**  
   Install globally via npm:  
   ```bash
   npm install -g appium
   ```

5. **Install Gradle (if not using wrapper)**  
   Optional if you're using the included Gradle wrapper (`./gradlew`). Otherwise, install manually from [gradle.org](https://gradle.org/install/).

6. **Open VS Code & Install Java Support Extensions**  
   Install the following extensions:  
   - `Language Support for Java™ by Red Hat`  
   - `Test Runner for Java`  
   - `Extension Pack for Java` (includes the above and more)

7. **Clone or Download the Project**
   ```bash
   git clone <repo-url>
   cd <project-folder>
   ```

8. **Build the Project with Gradle**  
   Install dependencies and compile the code:  
   ```bash
   ./gradlew build
   ```

9. **Start Appium Server**  
   Default startup:  
   ```bash
   appium
   ```  
   If you encounter session errors, try:  
   ```bash
   appium --allow-cors
   ```

10. **Start ADB Services**  
   Make sure ADB is running:  
   ```bash
   adb start-server
   ```  
   > ⚠️ Ensure your mobile device is connected and in Developer Mode

11. **Run the Tests**  
   Run all tests:  
   ```bash
   ./gradlew test
   ```  
   Run specific test class (example):  
   ```bash
   ./gradlew test --tests "tests.HomePageTest"
   ```
