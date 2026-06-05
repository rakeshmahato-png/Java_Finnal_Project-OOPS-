# School Administration Management System (OOP Project)

An interactive, console-based School Administration Management System designed in Java to showcase structural object-oriented programming methodologies.

## 🌟 Core OOP Concepts Demonstrated
* **Inheritance:** `Teacher` and `Student` sub-classes extend the base `Person` class to promote code reusability.
* **Encapsulation:** Attributes like `name`, `age`, `subject`, and `course` are kept `private` and accessed securely via `getters`.
* **Runtime Polymorphism:** Dynamically manages various school entities using a single parent array (`Person[]`) and processes role-specific behavior at runtime via **Dynamic Method Dispatch**.

---

## 🛠️ Project Architecture (Class Hierarchy)

- **Person** (Base Class)
  ├── **Teacher** (Derived Subclass)
  └── **Student** (Derived Subclass)

---

## 🚀 How to Run the Program

1. Clone or download the `SchoolManagement.java` file.
2. Open your terminal/command prompt in the file directory.
3. Compile the program:
   ```bash
   javac SchoolManagement.java
