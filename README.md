---
permalink: /index.html
---
# FirstEEproject

## Проект single page application веб-приложения на платформе Java EE.
### **Присутствуют:**
-регистрация, авторизация пользователя;
-возможность добавить пользователей в свой список друзей по логину, удалять;
-возможность написать другу(чат).

### **Технологии:**
информация о пользователях, списке друзей и сообщениях хранится в БД PostgreSQL. JPA используя Hibernate. Запросы на языке JPQL.
Для архитектуры REST сервиса используется Jax-rs.
Навигация и основные запросы используют REST. Однако для реализации чата используется Web socket.
### **Со стороны клиента:**
Используется фреймворк BackboneJS, MarionetteJS. Backbone Router. JQuery и Underscore.js необходимы для полноценного структурирования архитектуры.
