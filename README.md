# 🧠 Hierarchical Model & Mixin Implementation in Java

**First assignment in the course: Object-Oriented Programming 2**

This project includes two separate implementations in Java:
1. **The Hierarchical Semantic Model** of Collins & Quillian (1969)
2. A **Mixin-inspired simulation** of smart electronic devices controlled by a universal remote

---

## 📌 Contents

- [Project 1: Hierarchical Model](#project-1-hierarchical-model-collins--quillian-1969)
- [Project 2: Mixin with Smart Devices](#project-2-mixin-design-with-smart-devices)
- [Technologies Used](#️technologies-used)
- [How to Run](#-running-the-project)
- [Team Members](#-team-members)
- [License](#license)

---

## 📁 Project 1: Hierarchical Model (Collins & Quillian, 1969)

This part of the project is a Java-based simulation of a semantic memory model proposed by **Collins & Quillian**, structured as a **hierarchical inheritance tree**.

### 🧩 Features

- Uses **abstract and final classes** to represent general-to-specific concepts.
- Simulates **feature inheritance** through the class hierarchy.
- Enables users to ask questions via the **console**, such as:  
  > `"The color of a pine tree is green?"`  
  > `"A salmon is a type of fish?"`  
- Answers are given in **"Yes/No"**, with the full inheritance path displayed.

### 🌳 Hierarchy Example

<p align="center">
  <img src="https://github.com/user-attachments/assets/585698e1-fbd6-4d43-a08a-e59c204adb81" alt="Hierarchical Model" width="600"/>
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/40d0ff6b-509e-430e-8cce-d17c0c92da1e" alt="Hierarchical Model Console" width="600"/>
</p>

---

## 📁 Project 2: Mixin Design with Smart Devices

The second part of the assignment explores the concept of **Mixin-like behavior** in Java through the simulation of smart electronic devices controlled by a **universal remote**.

### 🧩 Features

- Devices implement **interfaces** based on functionality (e.g., `Turnable`, `AdjustableVolume`, `HasTimer`).
- Devices are grouped by **room** (e.g., Living Room, Kitchen).
- Users can:
  - **Activate all devices** in a specific room
  - **Activate all devices** supporting a specific function
- Demonstrates **flexible composition** of behaviors without deep inheritance.

### 🛋️ Example Devices

- TV: Operable, ControlVolume, Channel Tuning
- Fridge: Operable, Temperature
- Oven: Operable, Timer, Temperature

### Screenshot

<p align="center">
  <img src="https://github.com/user-attachments/assets/a3c27e17-260c-4ded-a53d-809f2d4a7542" alt="Mixin Model Console" width="600"/>
</p>

---

## 🛠️ Technologies Used

- **Java**
- OOP principles: **Abstract Classes**, **Final Classes**, **Interfaces**
- **Console Input** (`Scanner`)
- Inheritance and Composition
- Simulation of behavior via prompts

---

## 🚀 Running the Project

To run either part of the project:

1. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).
2. Navigate to the relevant package:
   - For the hierarchy model: `src/CollinsQuillian/Main.java`
   - For the mixin model: `src/MixinModel/Main.java`
3. Run the `Main` class.
4. Follow the console prompts.

---

## 👥 Team Members

- **Or Zino**  
- **Gal Shlomay**  
- **Tohar Krasnovsky**  
- **Shaked Shira Etedgi**

---

## 📄 License

This project is submitted as part of a university assignment. Not for commercial use.
