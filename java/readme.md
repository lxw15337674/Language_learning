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
####list接口的两种类
	1.arraylist,实现可变的数组.优点:访问快.缺点:插入或删除速度较慢
	2.Linkedlist,采用链表结构.优点:插入或删除速度快,缺点:访问慢
	例子:List<E> list = new ArrayList<>(); 
			E:代表合法的java数据类型.例如String
	