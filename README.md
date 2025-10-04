# Spring Boot RestTemplate Advanced 🔥 Error Handler, Interceptor & Timeout Explained

Welcome to **[Backend Verse](https://www.youtube.com/@BackendVerse)**! 🎥  
In this video, we will explore **Rest Template in Spring Boot** with practical examples. 🚀

---

## ▶ Watch the Tutorial

📺 **[Spring Boot RestTemplate Advanced 🔥 Error Handler, Interceptor & Timeout Explained](https://youtu.be/NwjfultVrN0)**

---

## 📝 What You’ll Learn   
📌 Implementing a Custom Error Handler   
⚡ Adding a Logging Interceptor for requests/responses   
🔑 Configuring connection & read timeouts   
🏷️ Best practices for production-ready RestTemplate   
💡 Comparing RestTemplate with WebClient for advanced use cases    

---

## 🎯 Why Watch This Video?   
✔️ Master advanced HTTP client configurations in Spring Boot   
✔️ Improve API reliability & observability   
✔️ Prepare for backend developer interviews   
✔️ Learn clean and maintainable RestTemplate setups   

---

## 🔧 Tools & Technologies Used
- Java 17
- Spring Boot
- Gradle
- IntelliJ IDEA
- PostMan

---

---

1. Run the Spring Boot application.

---

## 📬 API Endpoints with cURL

### 1️⃣ Create Audit

```bash
curl --location 'http://localhost:8081/audits' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "John Doe Updated Name 2",
    "email": "johndoe@gmail.com"
}'
```

### 2️⃣ Get Audit By Id

```bash
curl --location 'http://localhost:8081/audits/a5eef843-6df1-4b1e-b657-a42301c5c380'
```

### 3️⃣ Delete Audit By Id

```bash
curl --location --request DELETE 'http://localhost:8081/audits/a5eef843-6df1-4b1e-b657-a42301c5c380'
```

## ▶ Watch the Playlists

[Spring Boot series](https://www.youtube.com/playlist?list=PLdUn31k8Q721HBdMQzyl403o-bUtd31Wb)    
[Spring Data JPA](https://www.youtube.com/playlist?list=PLdUn31k8Q720FEKVfXrV0DKEgP7Mp1NuX)   
[Spring Boot Redis](https://www.youtube.com/playlist?list=PLdUn31k8Q721tgtkv1sfPJrvmi6-t3ijp)   
[Apache Kafka series](https://www.youtube.com/playlist?list=PLdUn31k8Q722_d3d18AZNNpsXoo3dmx6T)   
[Java 8 series](https://www.youtube.com/playlist?list=PLdUn31k8Q720AxyAXc1Fief13vQn58diY)   
[Master HTTP Clients in Spring Boot 🚀 | RestTemplate, WebClient & Feign Tutorial Series](https://www.youtube.com/playlist?list=PLdUn31k8Q723ZhebG3Oq2mky6rC_NHKX_)
---

## 📢 Don’t Miss Out!
👍 Like this video  
💬 Comment your feedback / questions  
🔔 Subscribe to **[Backend Verse](https://www.youtube.com/@BackendVerse)** for more Spring Boot tutorials in Hindi
---