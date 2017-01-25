##javaScript
	在一个页面中负责与用户进行交互
	javaScript注释与java注释相同
	特点:
		1.跨平台
		2.安全性.(javaScript的代码不能直接访问硬盘的内容)
####javaScript与java的区别:
		1.javaScript是属于网景公司的产品,java是sun公司的
		2.javaScript是基于对象的语言,java是面向对象的语言.
		3.javaScript是解释型语,java是解释,编译型语言.
		4.javaScript是弱类型语言,java是强类型语言
			javaScript声明变量不需要明确是何种数据类型,任何的变量都是使用一个关键字var去声明即可.
			java声明变量的时候必须明确该变量的数据类型. 
####javascript查看错误
	javaScript出现错误,网页会不显示.
	查看错误需要在浏览器中用F12调用开发者工具重新打开网页查看错误.
####编写javaScript的代码
	方式1:
		可以使用<Script>标签体内进行编写.
		格式:
			<script type="text/javascript">
			
					js代码;
		
			</script>
	方式2:引入外部的javaScript文件.
		格式:
			 <script src="1.js" type="text/javascript"/>
		注意:
			1.<script>是有开始标签和结束标签的.
			2.<如果<script>标签已经引入js文件,就不能再使用方式1
			
####javaScript常用的函数
	alert("显示的内容..");弹出框
	document.write("数据"); 输出数据
	
####javascript的变量声明
	与python变量声明相同
	格式:
		var 变量名 = 数据;
		
####javascript的数据类型：
	typeof 查看变量的数据类型。
	使用格式：
		typeof 变量名		
		
####javascript的数据类型：
	number 小数与整数
	string 字符串 注意： javascript中没有字符的概念，只有字符串，字符串可以写在单引号或双引号中。
	boolean 布尔数据类型，
	undefined  undefined代表该变量没有定义。
		注意:
			1.如果一个字符串是以0x开头，那么会把字符串中的内容当成十六进行的数据处理的。
			2.如果首位是0，那么就想祛除0再进行转换。
			
####字符串转数字
	parseInt()  可以把一个字符串转换成整数。
		原理:如果接收的字符串含有非数字的字符,那么parse方法会从字符串的首个字符开始寻找,一直到非数字字符位置,然后就使用前面的数字字符转换为数字.
	parseFloat() 可以把一个字符串转换成小数。
	
	IsNaN() 返回布尔值,判断字符串是否是一个数字.   NAN = not a number
		注意:
			不是一个数字返回true,是一个数字返回false
###运算符:	
	+(加法、正数、 连接符)
		true 是1. false是0
		例子:
			document.write("hello"+1); // hello1

	除法：
		如果两个整数相除不能整数的时候结果还是小数。

	比较运算符
		字符串与字符串的比较规则是：
			情况1： 能找到对应位置上的不同字符，那么就比较第一个不同字符的大小。
			情况2： 不能找到对应位置上的不同字符，这时候比较的是两个字符串的长度。

	逻辑运算符:	
		没有单与的。只有||与&&

	三目运算符	
		布尔表达式?值1:值2;
			
###控制流程语句
####if语句
		
	格式：
		if(判断条件){
			符合条件执行的代码	
		}	
	
	if语句的特殊之处： 
		1. 在javascript中的if语句条件不单止可以写布尔表达式，还可以写任何的数据。
		
		number  非0为true, 0为false.
		string  内容不能空是true， 内容空的时候是false。
		undefined：false
		NaN:    false
	

####选择语句： 
	switch语句
	
		switch(变量){
			case 值1:&nbsp;
				
				break;
			case 值2：
				
				break;
			case 值3:
				
				break;
				
			.....
				
			default：
				
				break;
			
		}
		
	特殊之处：
		1. 	在javascript中case后面可以跟常量与变量还可以跟表达式。
		