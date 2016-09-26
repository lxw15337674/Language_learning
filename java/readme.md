####字符串生成器:
	慢方法:
		str=str+i
	快方法:
		(1)str.append(i)
		(2)insert(int offset,arg)
			offset  字符串生成器的位置.
			arg		插入子字符串生成器的位置.
		(3)delete(int start int end)
####
	"=="运算符比较的是两个对象引用的地址是否相等.
	比较字符串是否相同需要用equals.		str.equals(str2)