# Android E-Commerce App

A simple e-commerce application built with modern Android development tools and architecture.

## Features

- Product listing with category filtering
- Shopping cart functionality
- Checkout process
- MVVM Architecture
- Local database with Room
- API implementation with Retrofit
- Dependency injection with Koin
- Modular architecture
- Reactive programming with Coroutine Flow
- Unit testing

## Technical Overview

### Architecture

The app follows the MVVM (Model-View-ViewModel) architecture pattern:

- **Model**: Repositories that handle data operations, Room database for local storage
- **View**: Activities and Fragments that display UI elements
- **ViewModel**: Manages UI-related data, handles business logic

### Key Components

- **Room Database**: Stores products, cart items, and orders locally
- **Retrofit**: Fetches product data from FakeStore API
- **Koin**: Handles dependency injection
- **Coroutines & Flow**: Manages asynchronous operations and reactive data streams
- **Navigation Component**: Handles in-app navigation

## Screenshots

(Add screenshots here when available)

## Getting Started

### Prerequisites

- Android Studio
- JDK 17 or higher
- Android SDK 21+

### Installation

1. Clone the repository
2. Open the project in Android Studio
3. Sync the Gradle files
4. Run the app on an emulator or physical device

## Acknowledgments

- [FakeStore API](https://fakestoreapi.com/) for product data