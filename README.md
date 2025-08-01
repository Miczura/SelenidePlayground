# SelenidePlayground
# 🧪 Selenide Playground Tests 

A simple collection of automated UI tests built with [Selenide](https://selenide.org/) and [TestNG](https://testng.org/) for practice and demonstration purposes.  
Tests run against public playground apps such as [The Internet (Herokuapp)](https://the-internet.herokuapp.com).

---

## 🧰 Tech Stack

- Java 17+
- Maven
- Selenide
- TestNG

---
## ⭐ Features
- **Local run only**
- **Supports Chrome and Firefox browsers**
- **Supports parallel test execution with 3 threads by default for faster feedback**
- **Automatic WebDriver management** – Drivers are downloaded and managed automatically
- **Screenshot on failure** – Saved to `test-results/reports/` (default from Selenide)
- **Text reporting provided by Selenide**
## 🚀 How to Run

### 1. Clone the project

```
git clone https://github.com/Miczura/SelenidePlayground.git
cd SelenidePlayground
```
### 2. Import the project
Import the project into your favorite IDE (e.g., IntelliJ IDEA) as a Maven project.
### 3. Compile the project
   ```
mvn clean compile
```
### 4. Run the entire test suite
   ```
mvn clean test
```
### 5.Browser selection
   ```
   mvn clean test -Dbrowser=firefox
```
