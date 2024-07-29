# Employability-Assessment
Final Employability Test Repository

## E-commerce Coupon Management System

## Project Documentation

### Initial Problem

Riwi is currently developing an e-commerce project to sell its products online. However, a development cell is needed to handle the management and redemption of coupons. Therefore, your team is tasked with developing a system that allows users to manage and redeem discount coupons. The API should offer the following functionalities:

- **User Management**:
  - User registration.

- **Coupon Management**:
  - Creation and listing of coupons.
  - Modification and deletion of coupons as long as they have not been used.
  - Verification of the validity of coupons (expiration date, status).

- **Coupon Redemption**:
  - Allow users to redeem coupons on purchases.
  - Consult the redemption history of coupons by user.

- **Product Management**:
  - Listing of products.

### Team Members, Responsibilities, and Roles

- **NewNobbie**: Documentation
- **Marulanda921**: Mappers
- **nicoluna319**: Planning and support
- **jhamile08**: Planning and interfaces

### Proposed Solution

To solve the problem, we decided to create four tables:
- `User`
- `CouponHistory`
- `Coupon`
- `Product`

DER

![image](https://github.com/user-attachments/assets/f8ebc17f-49e4-4d95-b783-b3cb9628b024)


### Step-by-Step Guide to Start the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/NewNobbie/Employability-Assessment.git
2. **cd Employability-Assessment**:
   ```bash
   mvn clean install
3. **Run the application:**
    ```bash
    mvn spring-boot:run
4. **Access the application:**
Open your browser and go to: 
    ```bash
    http://localhost:8080/swagger-ui/index.html

### Management:
**Click Up and GitHub Project**
https://app.clickup.com/9013367720/v/li/901304801857
