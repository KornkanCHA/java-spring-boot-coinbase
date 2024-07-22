# Overview
This Spring Boot application provides a simple REST API to fetch the current price of cryptocurrencies from Coinbase. The application demonstrates basic integration with the Coinbase API and is built using Java and Spring Boot.
# Running the Application
1. Ensure you have Java and Maven installed.
2. Clone the repository: git clone <repository-url>
3. Navigate to the project directory.
4. Build and run the application: mvn spring-boot:run
5. Access the API at http://localhost:8080/get-price?asset=ASSET (replace ASSET with the desired cryptocurrency symbol Ex. http://localhost:8080/get-price?asset=BTC).
# Notes
Ensure that the asset parameter matches the correct cryptocurrency symbol used by Coinbase.
The application currently does not handle API rate limits or extensive error checking, so consider enhancing these aspects for production use.
# IDE
This project was developed using Apache NetBeans IDE.

