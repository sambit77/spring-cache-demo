**Branch: feature/redis-cache-configured**

This branch is dedicated to demonstrating Spring's caching annotations using redis cache implementation. All examples and configurations here specifically showcase redis caching, where the data is cached in a redis container spinned up using docker-compose file.This is an extension to redis-cache branch where the RedisTemplate is configured in the code to give more control to developers.

# Spring Cache Demo

This app demonstrates various annotations related to cache using in-memory cache with Spring Framework.

## Features

- Showcases usage of Spring’s caching annotations
- Uses an in-memory cache implementation
- Example project for learning and demonstration purposes

## Prerequisites

- Java 8 or higher
- Maven (or your preferred build tool)

## Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/sambit77/spring-cache-demo.git
   cd spring-cache-demo
   ```

2. **Access the app**
   - The app will typically be available at: `http://localhost:8080`

## Usage

- Explore the code to see how caching annotations are used.
- Try hitting endpoints multiple times to observe the caching behavior.
- The various endpoints for this application can be obtained using the provided Postman collection.

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](LICENSE)
