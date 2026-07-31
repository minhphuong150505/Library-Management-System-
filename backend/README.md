# Backend — Spring Boot

REST API cho hệ thống quản lý thư viện, được tổ chức theo kiến trúc phân lớp giống project nguồn:

```text
src/main/java/com/phuong/
├── configurations/   # Spring Security, JWT và CORS
├── controller/       # REST endpoints
├── domain/           # Enum và kiểu miền nghiệp vụ
├── event/            # Sự kiện thanh toán
├── exception/        # Xử lý lỗi tập trung
├── mapper/           # Chuyển đổi Entity/DTO
├── modal/            # JPA entities
├── oauth2/           # Đăng nhập Google
├── payload/          # Request/response DTO
├── repository/       # Spring Data JPA
├── scheduler/        # Tác vụ định kỳ
└── service/          # Business logic và implementation
```

## Chạy độc lập

Yêu cầu Java 17 và MySQL 8.x. Tạo `.env` ở thư mục gốc hoặc khai báo các biến môi trường được mô tả trong `../.env.example`.

```bash
./mvnw spring-boot:run
```

API mặc định chạy tại `http://localhost:5000`.

## Kiểm tra

```bash
./mvnw clean test
```

Test sử dụng H2 in-memory qua profile `test`, vì vậy không cần khởi động MySQL.

Khi chạy toàn bộ ứng dụng, ưu tiên dùng `docker compose up --build` từ thư mục gốc.
