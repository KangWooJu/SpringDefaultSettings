# Spring Boot Skeleton / Template for Any Project

A reusable Spring Boot project template containing common backend configurations and infrastructure.

This project focuses on providing a solid starting point for backend development by including commonly used components such as Spring Security, JWT authentication, Redis, QueryDSL, Swagger, common response handling, exception handling, and a complete testing environment.

Business logic is intentionally excluded so that the template can be reused for any project.

---

# Features

- Spring Boot 4
- Spring Security + JWT Authentication
- Access Token / Refresh Token Strategy
- Redis Authentication Cache
- QueryDSL
- Spring Data JPA
- Swagger / OpenAPI
- Global Exception Handling
- Common API Response
- Soft Delete Support
- JPA Auditing
- Testcontainers
- Repository Slice Test
- Controller Test
- Integration Test
- Unit Test

---

# Tech Stack

| Category | Technology |
|-----------|------------|
| Language | Java 21 |
| Framework | Spring Boot 4 |
| Security | Spring Security, JWT |
| Database | MySQL, Redis |
| ORM | Spring Data JPA, QueryDSL |
| Documentation | Swagger / OpenAPI |
| Testing | JUnit5, Mockito, H2, Testcontainers |
| Build Tool | Gradle |

---

# Configuration Overview

## JPA

- Spring Data JPA
- `spring.jpa.open-in-view = false`
- JPA Auditing enabled
- Soft Delete support
- Common `BaseEntity`
- Batch Fetch optimization
- Optional-based query handling

---

## QueryDSL

- Type-safe JPA queries
- Custom repositories using `JPAQueryFactory`
- Fetch Join support
- Dynamic query implementation
- Generated Q Classes under:

```text
src/main/generated
```

---

## Security

- JWT Authentication
- AccessToken + RefreshToken strategy
- Custom Authentication Filter
- Custom Login Filter
- Custom Logout Filter
- Refresh Token Reissue
- Refresh Token Invalidation
- Custom `UserDetailsService`
- Redis-backed authentication cache
- `UserAuthCache` support
- Unified authentication response format

---

## Redis

- Authentication Cache
- Refresh Token Repository
- Typed Redis Serializer
- RedisTemplate configuration
- User cache retrieval API

---

## User Domain

- User Create
- User Delete (Soft Delete)
- Nickname support
- User lookup by ID
- Common timestamp management using `Instant`

---

## Swagger / OpenAPI

- Swagger UI configuration
- JWT Authentication Guide
- Filter Mock APIs
- API Group Tags
- Common API documentation

---

## Exception Handling

- Global Exception Handler
- BaseException
- Common Exception Enum
- Standardized API Error Response

---

## JSON

- Jackson Configuration
- Common `ApiResult`
- JSON Serializer
- Enum Serialization
- Lazy Loading Serialization Support

---

## YML Configuration

- Profile-based configuration
- Environment variable support
- Test profile
- Local profile
- Production profile

---

## Testing

The project contains a complete testing environment.

### Unit Test

- Mockito
- Service Layer
- Security Components

### Controller Test

- MockMvc

### Repository Slice Test

- DataJpaTest
- QueryDSL
- H2 Database

### Integration Test

- SpringBootTest
- Testcontainers
- MySQL Container
- Redis Container

---

# Project Structure

```text
src
├── global
│   ├── config
│   ├── security
│   ├── redis
│   ├── exception
│   ├── response
│   ├── swagger
│   ├── util
│   └── querydsl
│
├── domain
│   └── user
│
└── generated
```

---

# Progress / Changelog

| Date | Description |
|------|-------------|
| 2026-01-24 | Initial Spring Boot skeleton setup |
| 2026-01-27 | Add `BaseEntity` with JPA auditing support |
| 2026-01-28 | Configure QueryDSL, Swagger, and common enum serialization |
| | Update JSON and Swagger dependencies |
| 2026-01-29 | Add JPA converters for enum and boolean types |
| 2026-01-30 | Add common success/failure message interfaces and enums |
| 2026-01-31 | Add global exception handling and common `ApiResult` response |
| | Refactor common serializers and import structure |
| 2026-05-07 | Implement User create/delete with soft delete |
| | Enable JPA auditing |
| | Configure Redis templates and authentication cache repositories |
| | Implement JWT authentication and authorization |
| | Configure QueryDSL, application beans, CORS, and Swagger |
| 2026-05-11 | Extract Cookie utility for refresh token handling |
| | Add refresh token authentication exception handling |
| | Add authentication response DTOs |
| | Implement refresh token persistence and renewal |
| 2026-05-12 | Unify authentication response structure |
| | Separate refresh token validation logic |
| | Implement custom `UserDetailsService` |
| | Improve user lookup with `Optional` |
| | Add `BaseException` for user lookup failures |
| | Refactor refresh token responses using enums |
| | Configure JWT filter chain |
| | Implement refresh token reissue API |
| | Add logout filter with refresh token invalidation |
| | Improve Swagger authentication documentation |
| | Add Swagger mock APIs for authentication filters |
| | Add Swagger tag documentation for User APIs |
| | Correct Swagger package scan configuration |
| 2026-05-16 | Add unit tests for UserQueryService |
| | Add unit tests for RefreshService token reissue flow |
| | Update SpringDoc package scanning configuration |
| 2026-05-23 | Configure common test profile |
| | Update datasource environment variables |
| | Expand User and Security unit tests |
| | Apply MockitoExtension to UserQueryService tests |
| | Fix JwtUtil mock behavior |
| 2026-05-25 | Add unit tests for CookieUtil |
| | Add unit tests for RefreshTokenValidator |
| | Add unit tests for JwtFilter |
| | Refactor Authorization header to Bearer format |
| | Add unit tests for JwtLoginFilter |
| | Add unit tests for JwtLogoutFilter |
| 2026-05-30 | Configure H2 environment for repository slice tests |
| | Configure DataJpaTest environment |
| | Add QueryDSL repository slice tests |
| | Move UserQueryService tests to the query package |
| | Rename user table to `users` |
| | Add Redis user cache retrieval API |
| 2026-07-20 | Apply typed Redis serializer for `UserAuthCache` |
| 2026-08-07 | Add nickname support to the User domain |
| | Add user lookup by ID |
| | Cache authenticated user information on login |
| | Refactor timestamp type from `LocalDateTime` to `Instant` |
| | Rename Redis template for refresh tokens |
| | Configure Testcontainers integration test environment |
| | Implement `UserDetailsService` |
| | Add unit tests for the User domain |
| | Add unit tests for the Refresh domain |
| | Add controller tests for the User domain |
| | Add repository slice tests for the User domain |
| | Add integration test template |
| | Add integration tests for the User domain |


---

# Getting Started

## Clone Repository

```bash
git clone https://github.com/KangWooJu/SpringDefaultSettings.git
```

```bash
cd SpringDefaultSettings
```

---

## Configure Environment Variables

Configure the required environment variables.

Example:

```text
DATABASE_URL=
DATABASE_USERNAME=
DATABASE_PASSWORD=

REDIS_HOST=
REDIS_PORT=

JWT_SECRET=
```

---

## Build

```bash
./gradlew clean build
```

---

## Run

```bash
./gradlew bootRun
```

---

# Future Improvements

- Flyway Migration
- Docker Compose Environment
- GitHub Actions CI/CD
- Prometheus & Grafana Monitoring
- Multi-module Architecture
- OpenTelemetry
- Rate Limiting
- API Versioning
- Structured Logging
- Metrics Dashboard
