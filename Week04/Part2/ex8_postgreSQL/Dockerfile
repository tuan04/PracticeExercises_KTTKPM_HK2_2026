FROM postgres:15

ENV POSTGRES_DB=mydb
ENV POSTGRES_USER=user
ENV POSTGRES_PASSWORD=password

EXPOSE 5432

COPY data.sql /docker-entrypoint-initdb.d/