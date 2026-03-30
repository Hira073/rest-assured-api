# REST Assured API Automation Framework

## Overview
This project demonstrates a structured API automation framework built using REST Assured and TestNG. It showcases reusable request handling, response validation and clean test design aligned with real-world QA automation practices.

## Tech Stack
- Java
- REST Assured
- TestNG
- Maven

## Framework Highlights
- Reusable request specifications
- Centralized base API setup
- Response validation (status code, body, headers)
- Clean and scalable test structure
- Data-driven test capability (extendable)

## Project Structure
src
├── test
│   ├── java
│   │   └── com/zain/portfolio
│   │       ├── base
│   │       ├── tests
│   │       └── utils
│   └── resources
│       └── testdata

## Test Coverage
- GET API validation
- POST API validation
- Status code verification
- Response body assertions

## Example Assertions
- Validate HTTP status codes (200, 201, etc.)
- Validate response fields
- Validate JSON structure

## How to Run
```bash
mvn clean test
