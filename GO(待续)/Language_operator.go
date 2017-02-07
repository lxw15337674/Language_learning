package main

import "fmt"

func Language_operator() {
	var a = true
	var b = false
	//AND
	if a || b {
		fmt.Printf("true\n")
	}
	//OR
	if a && b {
		fmt.Printf("true\n")
	} else {
		fmt.Printf("false\n")
	}
	//NOT
	if !(a && b) {
		fmt.Printf("true\n")
	}
}
