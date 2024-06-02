# Binary Protocols and Data Serialization

## Project Overview

This project demonstrates the use of binary protocols and data serialization in Java. It includes a simple application that serializes and deserializes a data object to and from a binary file.

## Setup Instructions

1. Clone the repository.
2. Build the project using Maven:
      mvn clean install

markdown
Copy code
3. Run the application:
      java -jar target/binary-protocols-serialization-1.0-SNAPSHOT-jar-with-dependencies.jar
      
## Usage

1. The application will serialize a `Data` object to a binary file in the `data` directory.
2. It will then deserialize the object from the file and print the data to the console.

## CI Setup

This project uses GitHub Actions for continuous integration. The CI pipeline is defined in the `.github/workflows/ci.yml` file.

## Expected Results

The serialized data is stored in the `data/serializedData.bin` file, and the deserialized data is printed to the console.
