# Task1:
# 🧪 OrangeHRM Automation Task

This project contains automated test cases for the [OrangeHRM Demo Site](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login), built using **Java**, **Selenium WebDriver**, and **TestNG**. It applies the **Page Object Model (POM)** design pattern to ensure better code organization and maintainability.

---

## 📌 Task Requirements

The project implements the following automation scenarios:

### 🔐 Part 1: Login
- ✅ Login with valid username and password.

### ❌ Part 2: Invalid Login
- 🧪 Valid username + Invalid password
- 🧪 Invalid username + Valid password
- 🧪 One of the fields is left empty

### 🚫 Part 3: Both Fields Empty
- 🔎 Ensures an error message appears when both username and password fields are empty.

### 📊 Part 4: Home Page Widget Verification
- ✅ After successful login, verify that **7 widgets** are visible on the home page.

---

## 📂 Project Structure

```
├── src/
│   ├── main/java/
│   │   └── pages/              # Page Object classes
│   └── test/java/
│       └── tests/             # Test classes using TestNG
├── LoginSuite.xml             # TestNG suite configuration
├── .gitignore                 # Git ignored files
└── README.md                  # Project documentation
```
## ⚙️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven (for build & dependency management)
- IntelliJ IDEA 

---

## 🧪 How to Run the Tests

1. Clone the repository:

```bash
git clone https://github.com/DemianaYounes/AutomationTasks.git
cd AutomationTasks
