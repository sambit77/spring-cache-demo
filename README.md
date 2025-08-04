# Spring Cache Demo

This app demonstrates various annotations related to cache using in-memory cache with Spring Framework.

## Features

- Showcases usage of Spring’s caching annotations
- Uses an in-memory/redis cache implementation
- Example project for learning and demonstration purposes

**Branch: feature/inmemory-cache**

This branch is dedicated to demonstrating Spring's caching annotations using an in-memory cache implementation. All examples and configurations here specifically showcase in-memory caching.

**Branch: feature/redis-cache**

This branch is dedicated to demonstrating Spring's caching annotations using redis cache implementation. All examples and configurations here specifically showcase redis caching, where the data is cached in a redis container spinned up using docker-compose file.

**Branch: feature/redis-cache-configured**

This branch is dedicated to demonstrating Spring's caching annotations using redis cache implementation. All examples and configurations here specifically showcase redis caching, where the data is cached in a redis container spinned up using docker-compose file.This is an extension to redis-cache branch where the RedisTemplate is configured in the code to give more control to developers.


## Prerequisites

- Java 8 or higher
- Maven (or your preferred build tool)
  
## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](LICENSE)
