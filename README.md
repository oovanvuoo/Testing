# Automation Test FW

## Installation and Run
1. Install JDK 21 (Temurin)
2. Install Android Platform & Android Tools.
3. Set JAVA_HOME & ANDROID_HOME variable
4. Install Appium Server
5. Install Gradless
6. Open VS code & Install Java Support Extensions
  `Language support for Java ™ for Visual Studio Code`

  `Test Runner for Java`

  `Extension Pack for Java` This extension will support to install other Java extensions.

7. Clone or Download project

8. Gradle build to install dependences
  `gradle build`

9. Start Appium Server
  `appium`

  If facing error cann't start session
  `appium --allow-cors`


10. ADB services
  `adb server-start`

  *Notice: Ensure your devide is in development mode*

11. Run test
