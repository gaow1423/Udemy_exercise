package main

import (
	"fmt"
	"io"
	"os"
)

func main() {
	// fmt.Println(os.Args)
	file, err := os.Open(os.Args[1])
	if err != nil {
		fmt.Println("failed to open file", err)
		os.Exit(1)
	}
	io.Copy(os.Stdout, file)
}
