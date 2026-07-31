# Frontend — React + Vite

Giao diện người dùng và trang quản trị của hệ thống quản lý thư viện.

```text
src/
├── Admin/        # Layout, route và các trang quản trị
├── components/   # Thành phần giao diện tái sử dụng
├── contexts/     # Theme context
├── hooks/        # Custom React hooks
├── pages/        # Các màn hình người dùng
├── services/     # API services
├── store/        # Redux Toolkit store và features
└── utils/        # Axios và tiện ích dùng chung
```

## Chạy độc lập

```bash
npm ci
npm run dev
```

Ứng dụng mặc định chạy tại `http://localhost:5173` và proxy API sang backend ở `http://localhost:5000`.

## Kiểm tra

```bash
npm run lint
npm run build
```

Có thể cấu hình API khác bằng biến `VITE_API_BASE_URL` trong tệp `.env` cục bộ.
