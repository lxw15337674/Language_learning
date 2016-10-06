####字符串生成器:
	慢方法:
		str=str+i
	快方法:
		(1)str.append(i)
		(2)insert(int offset,arg)
			offset  字符串生成器的位置.
			arg		插入子字符串生成器的位置.
		(3)delete(int start int end)
####随机数
	Math.random()可获得一个0.0-1.0之间的随机数.
	Random r = new Random();
		r.nextInt(int n) 返回大于等于0小于n的随机整数
		r.nextDouble()   返回一个随机double值
####相等
	"=="运算符比较的是两个对象引用的地址是否相等.
	比较字符串是否相同需要用equals.		str.equals(str2)
####集合循环输出
	while(it.hasNext()){
            System.out.println(it.next());
        }

		
	