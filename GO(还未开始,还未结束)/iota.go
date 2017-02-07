package main

import "fmt"

func use_iota() {
	//	iota：特殊常量，在每一个const关键字出现时，被重置为0，然后再下一个const出现之前，每出现一次iota，其所代表的数字会自动增加1。
	const (
		a = "a"
		b
		c = iota
		d
		e = 100
		f
		g = iota
	)
	fmt.Println(a, b, c, d, e, f, g)
	//  <<左移
	const (
		i = 1 << iota //1<<0
		j = 3 << iota //3<<1= 3*(2**1)=6
		k             //3<<2= 3*(2**2)=12
		l             //3<<3= 3*(2**3)=24
	)
	fmt.Println("i=", i)
	fmt.Println("j=", j)
	fmt.Println("k=", k)
	fmt.Println("l=", l)

}
