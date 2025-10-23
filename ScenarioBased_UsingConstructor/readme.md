# 💳 Credit Card Offer System (Scenario Based Program in Java)

## 📌 Project Overview
This project demonstrates a **Scenario-Based Java Program** using the concept of **Passing Object References to Methods** and the **Factory Method Pattern**.

The system determines which type of credit card (Silver, Gold, Platinum, or EMI) a customer is eligible for based on their **credit points**.

---

## 🧩 Key Classes and Responsibilities

### 1. `Customer`
- Represents a customer with attributes:
  - `customerName` (String)
  - `creditPoints` (int)
- Provides a getter method for `creditPoints` and overrides `toString()` to display the customer name.

### 2. `CardType`
- Represents the type of credit card offered.
- Contains:
  - `customer` (Customer object)
  - `cardType` (String)
- Overrides `toString()` to display the card offer message.

### 3. `CardOnOffer`
- Acts as a **factory class** that decides which card type to create based on the customer’s credit points.
- Method:
  ```java
  public static CardType getOfferedCard(Customer obj)
# 💳 Credit Card Offer System (Scenario Based Program in Java)

## 📌 Project Overview
This project demonstrates a **Scenario-Based Java Program** using the concept of **Passing Object References to Methods** and the **Factory Method Pattern**.

The system determines which type of credit card (Silver, Gold, Platinum, or EMI) a customer is eligible for based on their **credit points**.

---

## 🧩 Key Classes and Responsibilities

### 1. `Customer`
- Represents a customer with attributes:
  - `customerName` (String)
  - `creditPoints` (int)
- Provides a getter method for `creditPoints` and overrides `toString()` to display the customer name.

### 2. `CardType`
- Represents the type of credit card offered.
- Contains:
  - `customer` (Customer object)
  - `cardType` (String)
- Overrides `toString()` to display the card offer message.

### 3. `CardOnOffer`
- Acts as a **factory class** that decides which card type to create based on the customer’s credit points.
- Method:
  ```java
  public static CardType getOfferedCard(Customer obj)


  ## Output
  --------------------
  <img width="852" height="302" alt="image" src="https://github.com/user-attachments/assets/f6e9c0d9-51a2-4b84-9ba9-09af42b2483c" />

