# Calculator Project

## Overview

This is a simple, extensible calculator built using Java that supports multiple operations like addition, subtraction, multiplication, and division. The calculator follows key object-oriented principles, especially the Open-Closed Principle, to allow for easy extension of operations without modifying the core calculator class.

## Features

- **Basic Operations**: Supports addition, subtraction, multiplication, and division.
- **Extensibility**: Easily extendable to support new operations without modifying the `Calculator` class.
- **Chaining Operations**: Allows users to chain multiple operations sequentially.
- **Error Handling**: Gracefully handles invalid operations, including division by zero.
- **IoC Compatibility**: Designed to be compatible with an Inversion of Control (IoC) environment for external dependency management.

## Requirements

- Java 8 or above
- Apache Maven

## Setup

   ```bash
   git clone https://github.com/your-repo/calculator-project.git
   cd calculator-project
   mvn clean install
   mvn test
