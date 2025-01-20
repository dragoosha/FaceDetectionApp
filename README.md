# FaceDetectionApp

FaceDetectionApp is a simple Android application that uses Google ML Kit's Face Detection API to detect faces in real-time via your device's camera. The app is designed to provide a seamless and intuitive experience for detecting faces, with additional features such as granting camera permissions and handling permission requests.

## Features

- **Real-Time Face Detection:** Leverages Google ML Kit to detect faces in real-time as the camera captures images.
- **Camera Access:** Automatically requests camera permissions and handles denial with helpful messages.
- **Intuitive User Interface:** Simple and clean interface that displays detected faces and provides real-time feedback.
- **Front-Facing Camera Support:** Supports the front-facing camera for face detection and recognition.
- **Customizable UI:** Easily extendable to add more features such as adding graphical elements to faces (e.g., glasses, hats).

## Getting Started

### Prerequisites

To run this project on your local machine, you'll need the following:

- Android Studio
- Android Device or Emulator with Camera Support
- Google Play Services (for ML Kit)

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/FaceDetectionApp.git
    ```

2. **Open the project in Android Studio:**
    Open the cloned repository in Android Studio and let it sync the dependencies.

3. **Run the app:**
    Connect your Android device or start an emulator and run the app from Android Studio.

### Permissions

The app requires the following permissions to function correctly:

- **Camera Permission:** To access the device camera for face detection.

You will be prompted to grant permission when you first use the camera. The app will ask for the necessary permissions, and if denied, it will guide you to the settings.

## How It Works

### Face Detection Using ML Kit

This app uses Google's **ML Kit** to perform face detection. The face detection is done in real-time, where the app analyzes each frame from the camera feed to detect faces and display them on the screen.

Key steps in the process:
1. **Capture Camera Feed:** The app continuously captures frames from the front-facing camera.
2. **Process Each Frame:** Each frame is processed using ML Kit's Face Detection API.
3. **Draw Faces on the Screen:** Detected faces are highlighted, and the app overlays a box around each detected face and contours.

## Acknowledgements

- [Google ML Kit](https://developers.google.com/ml-kit) for the face detection API.
- [AndroidX](https://developer.android.com/jetpack/androidx) for providing modern Android components.
