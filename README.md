# PL Plugin Template

XTC component plugin (.pl) project template for compose dials.

## Structure

```
├── src/main/java/com/xtc/example/
│   └── Plugin.java           # Plugin implementation (IPlugin interface)
├── AndroidManifest.xml       # Android manifest
├── build.bat                 # Build script (Java → DEX → APK → .pl)
├── config.json               # Plugin configuration
└── deploy.json               # Deployment info
```

## Usage

1. Click **"Use this template"** to create a new repo
2. Rename package `com.xtc.example` to your package name
3. Edit `Plugin.java` with your component logic
4. Run `build.bat pl` to compile
5. Deploy the `.pl` file to your device

## Requirements

- Android SDK build-tools 37.0.0+
- JDK 8+
- Android Keystore for signing
