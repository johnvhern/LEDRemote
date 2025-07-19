# 📱 SMD 5050 LED Strip Remote App

An Android app that turns your phone into a remote control for SMD 5050 LED light strips using the built-in **IR blaster**.

## 🎯 What It Does

This app allows users to control generic **44-key IR-based SMD 5050 LED strips**.  
You can change colors, brightness, and lighting modes by sending raw IR patterns directly from your device.
This build is just for **fun** because I am tired of finding my remote everytime I want to change lights.

---

## 🛠️ Tech Stack

- **Java**
- **Android SDK**
- **Consumer IR API**

---

## 📸 Screenshots

  ![Screenshot_2025-07-20-00-02-37-186_com lomi ledremote](https://github.com/user-attachments/assets/0095b18c-376d-4d96-94ee-7d2e190ed343)

---

## 📝 Notes

- Your device **must support an IR blaster** and run **Android 4.4+**.
- All IR commands are based on the **NEC protocol** and may require conversion from standard hex codes to **raw timing patterns** using `ConsumerIrManager`.

---

## 🙏 Special Thanks

Huge thanks to [@Derpidoo](https://gist.github.com/Derpidoo/e3042055e0f5c3708f9b98b75fe4d59e)  
for providing the full set of **44-key IR hex codes** for SMD 5050 LED strips.

> The provided hex codes (e.g. `0x00FF02FD`) may need to be converted into raw timing arrays compatible with Android’s `ConsumerIrManager.transmit()`.

---

## 📂 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---
