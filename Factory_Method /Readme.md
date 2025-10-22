# 🎓 Student Factory Method Example (Java)

This project demonstrates the **Factory Method Design Pattern** in Java using a simple `Student` class example.  
It showcases how to use a **static factory method** to create objects, rather than directly using the `new` keyword in the main program.

---

## 🧠 Project Overview

The project contains two main classes:

1. **`Student` (BLC - Business Logic Class)**  
   - Represents a student with attributes: `name`, `age`, and `grade`.  
   - Uses a **private constructor** and a **static factory method** (`createStudentObject`) to create `Student` objects.  
   - Overrides the `toString()` method to display student details.  

2. **`TestStudent` (ELC - Execution Logic Class)**  
   - Takes input from the user using `Scanner`.  
   - Calls the factory method to create and display `Student` objects.  
   - Allows continuous input until the user chooses to stop.

---

## 🧩 Project Structure

## Output
--------------------
<img width="1007" height="652" alt="image" src="https://github.com/user-attachments/assets/47a8a8a5-0cf9-4edd-ac95-d32ce20fbed5" />
