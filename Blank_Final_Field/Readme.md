# 🧑‍🎓 Student Class Example (Java)

## 📘 Overview
This project demonstrates the concept of **final variables**, **instance initializer blocks**, and **constructors** in Java using a simple `Student` class example.

It shows how the `final` keyword restricts reassignment and how instance initializer blocks are executed before constructors.

---

## 🧩 Class Details

### ✨ `Student.java`
```java
class Student {
    private final String name;

    // Instance initializer block
    {
        name = "Raj";
    }

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name) {
        // Cannot reassign because 'name' is final
    }

    public String getName() {
        return this.name;
    }
}
## output
<img width="437" height="166" alt="image" src="https://github.com/user-attachments/assets/a06839bc-c00e-45d2-9412-282e67729caf" />
