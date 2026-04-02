# môi trường chạy code
FROM node:25

# Tạo thư mục để chứa ứng dụng (code) bên trong container
WORKDIR /app

#Sao chép package.json để tải thư viện cần thiết
COPY package*.json ./

RUN npm i

COPY . .

EXPOSE 3000

CMD ["npm", "run", "start"]