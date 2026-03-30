# REST Assured API Portfolio Project

This is a small portfolio-ready API automation framework built with **Java, REST Assured and TestNG**.

It uses the public **ReqRes** API to demonstrate practical API testing skills that are easy to show to HR and recruiters.

## What this project demonstrates
- REST Assured request building
- response validation and assertions
- API field-level validation
- POJO-based payload handling
- reusable spec setup
- TestNG execution and grouping
- clean folder structure for scaling

## Demo scenarios
- Get single user and validate response fields
- List users and validate pagination details
- Create user with POST request
- Update user with PUT request
- Validate unsuccessful login error response

## Tech stack
- Java 17
- REST Assured
- TestNG
- Maven
- Jackson

## Project structure
```bash
src
├── main
│   └── java
│       └── com/zain/api/portfolio
│           ├── models
│           └── utils
└── test
    └── java
        └── com/zain/api/portfolio
            ├── base
            └── tests
```

## How to run
```bash
mvn clean test
```

## Good GitHub repo title ideas
- `rest-assured-api-portfolio`
- `java-api-automation-framework`
- `api-testing-demo-restassured`

## What to tell HR
This project demonstrates practical API automation using Java and REST Assured with reusable request specifications, clean assertions, POJO payloads and TestNG-based execution.
