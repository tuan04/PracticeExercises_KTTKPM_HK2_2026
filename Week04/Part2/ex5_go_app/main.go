package main

import (
	"fmt"
	"net/http"
)

func handler(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintln(w, "Hello from Go in Docker")
}

func main() {
	http.HandleFunc("/", handler)
	fmt.Println("Server is running")
	http.ListenAndServe(":8082", nil)
}