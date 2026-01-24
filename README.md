# Spring Boot Skeleton / Template for Any Project

This is a Spring Boot project skeleton containing only the minimal configurations.  
No business logic is included, making it suitable as a starting point for new projects.

---

## 1. Configuration Overview

- **JPA**: Spring Data JPA
    - `spring.jpa.hibernate.ddl-auto = none`
    - `spring.jpa.open-in-view = false`
    - Default batch fetch size and other basic settings included
- **JSON**: Jackson
    - Configurations for safe serialization of lazy-loaded entities
- **YML-based Settings**: Profiles, groups, and logging
    - `spring.profiles.group` used for environment grouping
    - `decorator.datasource.exclude-beans` applied for multi-datasource control
- **Logging**: Fine-grained logging level configuration per package
- **Excluded Integrations**: Spring Cloud, Feign, Redis (can be added later if needed)
- **Monitoring**: Micrometer-based metrics for application performance
Can be integrated with Prometheus, Grafana, or other monitoring tools
Collects metrics such as JVM memory, request counts, response times, etc.
---

## 2. Progress / Changelog

| Date       | Description |
|------------|-------------|
| 2026-01-24 | Initial skeleton setup with YML configurations |
|  |  |
|  |  |
| ...        | ... |

---

## 3. Getting Started (Optional)

1. Clone the project:
```bash
git clone https://github.com/KangWooJu/SpringDefaultSettings
