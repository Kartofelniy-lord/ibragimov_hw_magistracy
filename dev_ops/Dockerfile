FROM nginx

# Копирование файлов конфигурации и index.html внутрь контейнера
COPY nginx.conf /etc/nginx/nginx.conf
COPY index.html /usr/share/nginx/html/index.html

# задаем порт веб-сервера
EXPOSE 80

# запускаем веб-сервер
CMD ["nginx", "-g", "daemon off;"]