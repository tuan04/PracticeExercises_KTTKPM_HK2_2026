FROM node:20-alpine AS build-stage

WORKDIR /app

COPY package*.json ./
RUN npm install

COPY . .
RUN npm run build 

# ------------------
FROM nginx:stable-alpine

# Copy file cấu hình Nginx của mình vào container
COPY nginx.conf /etc/nginx/conf.d/default.conf

# Copy thành phẩm từ giai đoạn 1 sang thư mục của Nginx
# Lưu ý: Thay 'dist' thành 'build' nếu bạn dùng Create React App
COPY --from=build-stage /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]